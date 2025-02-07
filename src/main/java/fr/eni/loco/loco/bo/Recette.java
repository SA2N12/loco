package fr.eni.loco.loco.bo;

import java.util.List;

public class Recette {
    //attributs
    private String name;
    private String description;
    private List<Ingredient> ingredients;

    //constructeur
    public Recette() {

    }

    public Recette(String name, String description, List<Ingredient> ingredients) {
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
    }

    //getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Ingredient> getIngredients() {
        return ingredients;
    }
    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

}
