/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cameldemo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.sql.Date;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

<<<<<<< HEAD
import com.mycompany.cameldemo.databases.publisher.PublisherRepository;
import com.mycompany.cameldemo.model.*;

=======
import com.mycompany.cameldemo.databases.publisher.AllergyRepository;
import com.mycompany.cameldemo.databases.publisher.PublisherRepository;
import com.mycompany.cameldemo.model.Allergy;
>>>>>>> ff29ce4d6c79ff861c2ee1f5149e096682c9f84e
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.impl.ScheduledPollConsumer;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class PollingConsumer extends ScheduledPollConsumer
{
    private PollingEndpoint endpoint;
    private static int count = 0;
    private Date now;

    public PollingConsumer(PollingEndpoint endpoint, Processor processor)
    {
        super(endpoint, processor);
        this.endpoint = endpoint;
        this.setDelay(endpoint.getConfiguration().getDelay());
    }

    @Override
    protected int poll() throws Exception 
    {
        count++;
        java.util.Date utilDate = new java.util.Date();
        if(now == null)
        {
            now = new Date(0);
        }
        else
        {
            now = new Date(utilDate.getTime());
        }

<<<<<<< HEAD
        System.out.println("Poll #" + count + " begun");
        
        String operationPath = endpoint.getOperationPath();
        if(operationPath.equals("queryDatabase")) return processDatabaseQuery();
=======
        System.out.println("new poll " + count);
        String operationPath = endpoint.getOperationPath();

        if (operationPath.equals("search/feeds")) return processSearchFeeds();
>>>>>>> ff29ce4d6c79ff861c2ee1f5149e096682c9f84e

        // only one operation implemented for now !
        throw new IllegalArgumentException("Incorrect operation: " + operationPath);
    }

<<<<<<< HEAD
    private int processDatabaseQuery() throws Exception 
    {
        //Query query = new Query();
    	PublisherRepository repo = new PublisherRepository();
        try {
        	ArrayList<ArrayList> collections = new ArrayList();
        	
        	Collection<Allergy> allergies = repo.getAllergies(now);
            Collection<Ingredient> ingredients = repo.getIngredients(now);
            Collection<IngredientAllergy> ingredientAllergies = repo.getIngredientAllergies(now);
            Collection<MealType> mealTypes = repo.getMealTypes(now);
            Collection<MeasuredIngredient> measuredIngredients = repo.getMeasuredIngredients(now);
            Collection<RecipeType> recipeTypes = repo.getRecipeTypes(now);
            Collection<Recipe> recipes = repo.getRecipes(now);
            Collection<RecipeAllergy> recipeAllergies = repo.getRecipeAllergies(now);
            Collection<Menu> menus = repo.getMenus(now);
            Collection<MenuAllergy> menuAllergies = repo.getMenuAllergies(now);
            Collection<MenuIngredient> menuIngredients = repo.getMenuIngredients(now);
            Collection<MenuRecipe> menuRecipes = repo.getMenuRecipes(now);
            
            
                        
            collections.add((ArrayList) allergies);
            collections.add((ArrayList) ingredients);
            collections.add((ArrayList) ingredientAllergies);
            collections.add((ArrayList) mealTypes);
            collections.add((ArrayList) measuredIngredients);
            collections.add((ArrayList) recipeTypes);
            collections.add((ArrayList) recipes);
            collections.add((ArrayList) recipeAllergies);
            collections.add((ArrayList) menus);
            collections.add((ArrayList) menuAllergies);
            collections.add((ArrayList) menuIngredients);
            collections.add((ArrayList) menuRecipes);
            
            
            Exchange exchange = getEndpoint().createExchange();
            exchange.getIn().setBody(collections, ArrayList.class);
=======
    private JsonObject performGetRequest() throws ClientProtocolException, IOException 
    {
        HttpClient client = HttpClientBuilder.create().build();
        //HttpGet request = new HttpGet("http://cloud.feedly.com/v3/" + uri);
        HttpGet request = new HttpGet("http://80.255.6.114:4567/polling");
        HttpResponse response = client.execute(request);
        int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode != 200) throw new RuntimeException("Feedly API returned wrong code: " + statusCode);

        JsonParser parser = new JsonParser();
        InputStreamReader sr = new InputStreamReader(response.getEntity().getContent(), "UTF-8");
        BufferedReader br = new BufferedReader(sr);
        JsonObject json = (JsonObject) parser.parse(br);
        br.close();
        sr.close();

        return json;
    }

    private int processSearchFeeds() throws Exception 
    {
        AllergyRepository repo = new AllergyRepository();
        try {
            Collection<Allergy> allergies = repo.getAll(now);
            Exchange exchange = getEndpoint().createExchange();
            exchange.getIn().setBody(allergies, ArrayList.class);
>>>>>>> ff29ce4d6c79ff861c2ee1f5149e096682c9f84e
            getProcessor().process(exchange);
        } catch (Exception e) {
            e.printStackTrace();
        }

<<<<<<< HEAD
        return 1;
    }
=======


        return 1;
    }

    private int processDatabaseQuery()
    {


        return 1;
    }

>>>>>>> ff29ce4d6c79ff861c2ee1f5149e096682c9f84e
}
