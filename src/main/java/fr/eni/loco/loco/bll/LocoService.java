package fr.eni.loco.loco.bll;

import java.util.List;

import fr.eni.loco.loco.bo.Ingredient;
import fr.eni.loco.loco.bo.Recette;

public interface LocoService {

    //ingredient
    public void createIngredient (Ingredient Ingredient);

    public List<Ingredient> showAllIngredients();

    public Ingredient readIngredient(long id);

    public void deleteIngredientById(long id);

    public void incrementIngredientQuantity(long id);

    public void decrementIngredientQuantity(long id);

    public boolean ingredientExist(String name);

    //recette
    public void createRecette (Recette recette);

    public void deleteRecetteById(long id);

    public Recette readRecette(long id);

    public List<Recette> showAllRecettes();


}
