package com.mycompany.cameldemo.model;

<<<<<<< HEAD
import com.mycompany.cameldemo.databases.user.MealTypesRepository;

/**
 * Created by Emilo on 11-05-2017.
 */
public class MealType implements Model
=======
/**
 * Created by Emilo on 11-05-2017.
 */
public class MealType
>>>>>>> ff29ce4d6c79ff861c2ee1f5149e096682c9f84e
{
    private int mealTypeId;
    private String mealTypeName;

    public int getMealTypeId() {
        return mealTypeId;
    }

    public void setMealTypeId(int mealTypeId) {
        this.mealTypeId = mealTypeId;
    }

    public String getMealTypeName() {
        return mealTypeName;
    }

    public void setMealTypeName(String mealTypeName) {
        this.mealTypeName = mealTypeName;
    }
<<<<<<< HEAD

	@Override
	public void send() {
		MealTypesRepository repo = new MealTypesRepository();
		String message = "MealType " + mealTypeId + " was ";
		if(repo.exists(mealTypeId)) 
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