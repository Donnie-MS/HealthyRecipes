package ar.com.unahur.obj2.parcial;

import java.util.ArrayList;
import java.util.List;

public class Nutritionist {
    private String name;
    private final List<Recipe> availableRecipes;
    
    public Nutritionist(List<Recipe> availableRecipes, String name) {
        this.availableRecipes = new ArrayList<>(availableRecipes);
        this.name = name;
    }

    public void visit(Client aClient) {
        if(this.hasProperRecipe()) {

        }
        else {
            Recipe emergencyRecipe = new Recipe("magic smoothie", this.name, 2000, 0)
            aClient.addReceivedRecipes(emergencyRecipe);
        }
    }

    private Boolean hasProperRecipe() {
        return 
    }
}
