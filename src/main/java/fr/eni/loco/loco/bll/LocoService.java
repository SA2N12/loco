package fr.eni.loco.loco.bll;

import java.util.List;

import fr.eni.loco.loco.bo.Ingredient;

public interface LocoService {

    public void createIngredient (Ingredient Ingredient);

    public List<Ingredient> showAllIngredients();

    public Ingredient readIngredient(long id);

    public void deleteIngredientById(long id);

}
