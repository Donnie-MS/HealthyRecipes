package ar.com.unahur.obj2.parcial.Criterios;

import ar.com.unahur.obj2.parcial.Recipe;

public class TraditionalRecipe implements RecipeGuideline{
    @Override
    public Boolean like(Recipe aRecipe) {
        return aRecipe.isTraditional();
    }
}
