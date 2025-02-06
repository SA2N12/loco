package fr.eni.loco.loco.dal;

import java.util.List;

import fr.eni.loco.loco.bo.Ingredient;

public interface IngredientDAO {

    public void create (Ingredient Ingredient);

    public List<Ingredient> showAll();

    public Ingredient read(long id);
    
}
