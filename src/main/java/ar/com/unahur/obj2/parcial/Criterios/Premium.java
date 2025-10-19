package ar.com.unahur.obj2.parcial.Criterios;

import java.util.ArrayList;
import java.util.List;

import ar.com.unahur.obj2.parcial.Recipe;

public class Premium implements RecipeGuideline {
    private List<String> preferredAuthors = new ArrayList<>();

    @Override
    public Boolean like(Recipe aRecipe) {
        return preferredAuthors.stream().anyMatch(author -> author.equals(aRecipe.getAuthor()));
    }

    public void addPreferredAuthor(String aAuthor) {
        preferredAuthors.add(aAuthor);
    }
   
}
