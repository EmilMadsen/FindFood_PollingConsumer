package com.mycompany.cameldemo.model;

import java.util.Collection;

/**
 * Created by Emilo on 11-05-2017.
 */
public class Ingredient {
    private int ingredientId;
    private String ingredientName;
    private String ingredientDescription;
    private Collection<Allergy> allergies;

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

    public Collection<Allergy> getAllergies() {
        return allergies;
    }

    public void setAllergies(Collection<Allergy> allergies) {
        this.allergies = allergies;
    }
}
