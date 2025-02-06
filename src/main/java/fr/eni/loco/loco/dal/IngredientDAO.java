package fr.eni.loco.loco.dal;

import java.util.List;

import fr.eni.loco.loco.bo.Ingredient;

public interface IngredientDAO {

    public void create (Ingredient ingredient);

    public List<Ingredient> showAll();

    public Ingredient read(long id);

    public void incrementQuantity(Ingredient ingredient );

    public void decrementQuantity(Ingredient ingredient );

    public void deleteById(long id);
     
}
