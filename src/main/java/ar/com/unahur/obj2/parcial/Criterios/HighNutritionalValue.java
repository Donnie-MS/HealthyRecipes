package ar.com.unahur.obj2.parcial.Criterios;

import ar.com.unahur.obj2.parcial.Recipe;

public class HighNutritionalValue implements RecipeGuideline{
    private Integer minimumValue;
    public HighNutritionalValue(Integer minimumValue) {
        this.minimumValue = minimumValue;
    }

    @Override
    public Boolean like(Recipe aRecipe) {
        return aRecipe.getNutritionValue() >= minimumValue;
    }
    
}
