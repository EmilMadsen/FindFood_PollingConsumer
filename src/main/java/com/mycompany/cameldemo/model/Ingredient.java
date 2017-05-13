package com.mycompany.cameldemo.model;

<<<<<<< HEAD
import com.mycompany.cameldemo.databases.user.IngredientsRepository;
=======
import java.util.Collection;
>>>>>>> ff29ce4d6c79ff861c2ee1f5149e096682c9f84e

/**
 * Created by Emilo on 11-05-2017.
 */
<<<<<<< HEAD
public class Ingredient implements Model{
    private int ingredientId;
    private String ingredientName;
    private String ingredientDescription;
=======
public class Ingredient {
    private int ingredientId;
    private String ingredientName;
    private String ingredientDescription;
    private Collection<Allergy> allergies;
>>>>>>> ff29ce4d6c79ff861c2ee1f5149e096682c9f84e

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public String getIngredientDescription() {
        return ingredientDescription;
    }

    public void setIngredientDescription(String ingredientDescription) {
        this.ingredientDescription = ingredientDescription;
    }

<<<<<<< HEAD
	@Override
	public void send() {
		IngredientsRepository repo = new IngredientsRepository();
		String message = "Ingredient " + ingredientId + " was ";
		if(repo.exists(ingredientId)) 
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
    public Collection<Allergy> getAllergies() {
        return allergies;
    }

    public void setAllergies(Collection<Allergy> allergies) {
        this.allergies = allergies;
    }
>>>>>>> ff29ce4d6c79ff861c2ee1f5149e096682c9f84e
}
