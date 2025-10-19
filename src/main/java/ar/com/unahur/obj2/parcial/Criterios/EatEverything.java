package ar.com.unahur.obj2.parcial.Criterios;

import ar.com.unahur.obj2.parcial.Recipe;

public class EatEverything implements RecipeGuideline {

    @Override
    public Boolean like(Recipe aRecipe) {
        return Boolean.TRUE;
    }
    
}
