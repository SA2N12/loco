package fr.eni.loco.loco.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.loco.loco.bo.Ingredient;
import fr.eni.loco.loco.dal.IngredientDAO;

@Service
public class LocoServiceImpl implements LocoService {

    @Autowired
    private IngredientDAO ingredientDAO;

    @Override
    public void createIngredient(Ingredient ingredient) {
        ingredientDAO.create(ingredient);
    }

    @Override
    public List<Ingredient> showAllIngredients() {
        return ingredientDAO.showAll();
    }

    @Override
    public Ingredient readIngredient(long id) {
        return ingredientDAO.read(id);
    }
    
}
