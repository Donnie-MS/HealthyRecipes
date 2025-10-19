package ar.com.unahur.obj2.parcial.Criterios;

import java.util.ArrayList;
import java.util.List;

import ar.com.unahur.obj2.parcial.Recipe;

public class Mixed implements RecipeGuideline{
    private final List<RecipeGuideline> recipeGuideline = new ArrayList<>();

    public void addRecipeGuideline(RecipeGuideline aRecipeGuideline) {
        this.recipeGuideline.add(aRecipeGuideline);
    }
    @Override
    public Boolean like(Recipe aRecipe) {
        return recipeGuideline.stream().allMatch(guideLine -> guideLine.like(aRecipe));
    }
    
}
