package com.mycompany.cameldemo.model;

<<<<<<< HEAD
import com.mycompany.cameldemo.databases.user.MenusRepository;
=======
import java.util.Collection;
>>>>>>> ff29ce4d6c79ff861c2ee1f5149e096682c9f84e

/**
 * Created by Emilo on 11-05-2017.
 */
<<<<<<< HEAD
public class Menu implements Model
=======
public class Menu
>>>>>>> ff29ce4d6c79ff861c2ee1f5149e096682c9f84e
{
    private int menuId;
    private String menuName;
    private String menuDescription;
    private String menuImageFilePath;
<<<<<<< HEAD
    private int mealTypeId;
    private String publisherName;

    public Menu(){}

=======
    private MealType mealType;
    private Collection<Recipe> recipes;

    public Menu(){}

    public Menu(String name, String description, String imageFilePath,
                MealType mealType, Collection<Recipe> recipes){
        this.menuId= 0;
        this.menuName= name;
        this.menuDescription = description;
        this.menuImageFilePath = imageFilePath;
        this.mealType = mealType;
        this.recipes = recipes;
    }

    public Menu(int id, String name, String description, String imageFilePath,
                MealType mealType, Collection<Recipe> recipes){
        this.menuId= id;
        this.menuName= name;
        this.menuDescription = description;
        this.menuImageFilePath = imageFilePath;
        this.mealType = mealType;
        this.recipes = recipes;
    }

>>>>>>> ff29ce4d6c79ff861c2ee1f5149e096682c9f84e
    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }

    public String getMenuImageFilePath() {
        return menuImageFilePath;
    }

    public void setMenuImageFilePath(String menuImageFilePath) {
        this.menuImageFilePath = menuImageFilePath;
    }

<<<<<<< HEAD
    public int getMealTypeId() {
        return mealTypeId;
    }

    public void setMealTypeId(int mealTypeId) {
        this.mealTypeId = mealTypeId;
    }

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	@Override
	public void send() 
	{
		MenusRepository repo = new MenusRepository();
		String message = "Menu " + menuId + " was ";
		if(repo.exists(menuId)) 
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
    public MealType getMealType() {
        return mealType;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }

    public Collection<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Collection<Recipe> recipes) {
        this.recipes = recipes;
    }
>>>>>>> ff29ce4d6c79ff861c2ee1f5149e096682c9f84e
}
