package ar.com.unahur.obj2.parcial;

public class Recipe {
    private String name;
    private String author;
    private Integer nutritionalValue;
    private Integer yearsOfTradition;

    public Recipe(String name, String author, Integer nutritionalValue, Integer yearsOfTradition) {
        this.name = name;
        this.author = author;
        this.nutritionalValue = nutritionalValue;
        this.yearsOfTradition = yearsOfTradition;
    }

    public String getName() {
        return this.name;
    }

    public Boolean isTraditional() {
        return (this.yearsOfTradition - 20) >= 0;
    }

    public Integer getNutritionValue() {
        return this.nutritionalValue;
    }

    public String getAuthor() {
        return this.author;
    }
}
