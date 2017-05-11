package com.mycompany.cameldemo.model;

/**
 * Created by Emilo on 11-05-2017.
 */
public class Allergy {
    private int allergyId;
    private String allergyName;
    private String allergyDescription;

    public int getAllergyId() {
        return allergyId;
    }

    public void setAllergyId(int allergyId) {
        this.allergyId = allergyId;
    }

    public String getAllergyName() {
        return allergyName;
    }

    public void setAllergyName(String allergyName) {
        this.allergyName = allergyName;
    }

    public String getAllergyDescription() {
        return allergyDescription;
    }

    public void setAllergyDescription(String allergyDescription) {
        this.allergyDescription = allergyDescription;
    }

    @Override
    public String toString()
    {
        return '\n' + "ID: " + allergyId + '\n' + "Name: " + allergyName + '\n' + "Description: " + allergyDescription;
    }
}
