package com.example.recipeapp;

public class recipeDataModal {
    private String titleName;
    private String timeToCook;
    private String ingredients;
    private int recipeImage;

    public recipeDataModal(String titleName, String timeToCook, String ingredients, int recipeImage) {
        this.titleName = titleName;
        this.timeToCook = timeToCook;
        this.ingredients = ingredients;
        this.recipeImage = recipeImage;

    }

    public String getTitleName() {
        return titleName;
    }

    public String getTimeToCook() {
        return timeToCook;
    }

    public String getIngredients() {
        return ingredients;
    }

    public int getRecipeImage() {
        return recipeImage;
    }
}
