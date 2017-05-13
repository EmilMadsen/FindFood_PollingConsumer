package com.mycompany.cameldemo.model;

<<<<<<< HEAD
import com.mycompany.cameldemo.databases.user.RecipesRepository;
=======
import java.util.Collection;
>>>>>>> ff29ce4d6c79ff861c2ee1f5149e096682c9f84e

/**
 * Created by Emilo on 11-05-2017.
 */
<<<<<<< HEAD
public class Recipe implements Model {
=======
public class Recipe {
>>>>>>> ff29ce4d6c79ff861c2ee1f5149e096682c9f84e

    private int recipeId;
    private String recipeName;
    private String recipeDescription;
    private String recipeImageFilePath;
<<<<<<< HEAD
    private int recipeTypeId;
    private String publisherName;

    public Recipe(){}

=======
    private RecipeType recipeType;
    private String publisherName;
    private Collection<MeasuredIngredient> measuredIngredients;

    public Recipe(){}

    public Recipe(String name, String description, String imageFilePath,
                  RecipeType recipeType, Collection<MeasuredIngredient> measuredIngredients){
        this.recipeId = 0;
        this.recipeName = name;
        this.recipeDescription = description;
        this.recipeImageFilePath = imageFilePath;
        this.recipeType = recipeType;
        this.measuredIngredients = measuredIngredients;
    }

    public Recipe(int id, String name, String description, String imageFilePath,
                  RecipeType recipeType, Collection<MeasuredIngredient> measuredIngredients){
        this.recipeId = id;
        this.recipeName = name;
        this.recipeDescription = description;
        this.recipeImageFilePath = imageFilePath;
        this.recipeType = recipeType;
        this.measuredIngredients = measuredIngredients;
    }

>>>>>>> ff29ce4d6c79ff861c2ee1f5149e096682c9f84e
    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeDescription() {
        return recipeDescription;
    }

    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }

    public String getRecipeImageFilePath() {
        return recipeImageFilePath;
    }

    public void setRecipeImageFilePath(String recipeImageFilePath) {
        this.recipeImageFilePath = recipeImageFilePath;
    }

<<<<<<< HEAD
    public int getRecipeTypeId() {
        return recipeTypeId;
    }

    public void setRecipeTypeId(int recipeTypeId) {
        this.recipeTypeId = recipeTypeId;
=======
    public RecipeType getRecipeType() {
        return recipeType;
    }

    public void setRecipeType(RecipeType recipeType) {
        this.recipeType = recipeType;
    }

    public Collection<MeasuredIngredient> getMeasuredIngredients() {
        return measuredIngredients;
    }

    public void setMeasuredIngredients(Collection<MeasuredIngredient> measuredIngredients) {
        this.measuredIngredients = measuredIngredients;
>>>>>>> ff29ce4d6c79ff861c2ee1f5149e096682c9f84e
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
<<<<<<< HEAD

	@Override
	public void send() 
	{
		RecipesRepository repo = new RecipesRepository();
		String message = "Recipe " + recipeId + " was ";
		if(repo.exists(recipeId)) 
		{
			repo.update(this);
			message += "updated";
		}
		else
		{
			repo.create(this);
			message += "created";
		}
		
		System.out.println(message);
	}
=======
>>>>>>> ff29ce4d6c79ff861c2ee1f5149e096682c9f84e
}