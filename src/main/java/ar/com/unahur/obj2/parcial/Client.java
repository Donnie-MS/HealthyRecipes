package ar.com.unahur.obj2.parcial;

import java.util.ArrayList;
import java.util.List;

import ar.com.unahur.obj2.parcial.Criterios.EatEverything;
import ar.com.unahur.obj2.parcial.Criterios.RecipeGuideline;

public class Client {
    private final Long dni;
    private RecipeGuideline recipeGuideline;
    private List<Recipe> receivedRecipes;

    public Client(Long dni, RecipeGuideline recipeGuideline) {
        this.dni = dni;
        this.recipeGuideline = new EatEverything();
        this.receivedRecipes = new ArrayList<>();
    }

    public void setRecipeGuideLine(RecipeGuideline newRecipeGuideLine) {
        this.recipeGuideline = newRecipeGuideLine;
    }

    private Boolean RecipeGuidelineHas(Recipe aRecipe) {
        return receivedRecipes.contains(aRecipe);
    }


    public void addReceivedRecipes(Recipe aRecipe) {
        if(this.RecipeGuidelineHas(aRecipe)) {
            this.receivedRecipes.remove(aRecipe);
        }
        this.receivedRecipes.add(aRecipe);
    }
}
