package com.mycompany.cameldemo.model;

/**
 * Created by Emilo on 11-05-2017.
 */
public class MeasuredIngredient
{
    private int measuredIngredientId;
    private Ingredient ingredient;
    private double amount;
    private String measure;

    public MeasuredIngredient(){}

    public int getMeasuredIngredientId() {
        return measuredIngredientId;
    }

    public void setMeasuredIngredientId(int measuredIngredientId) {
        this.measuredIngredientId = measuredIngredientId;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }
}
