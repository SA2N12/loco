package fr.eni.loco.loco.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import fr.eni.loco.loco.bo.Ingredient;
import fr.eni.loco.loco.bo.Recette;
import fr.eni.loco.loco.dal.IngredientDAO;
import fr.eni.loco.loco.dal.RecetteDAO;

@Service
public class LocoServiceImpl implements LocoService {

    //ingredient
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

    @Override
    public void deleteIngredientById(long id) {
        ingredientDAO.deleteById(id);
    }

    @Override
    public void incrementIngredientQuantity(long id) {
        ingredientDAO.incrementQuantity(id);
    }

    @Override
    public void decrementIngredientQuantity(long id) {
        ingredientDAO.decrementQuantity(id);
    }

    @Override
    public boolean ingredientExist(String name) {
        try{
            Ingredient ingredient = ingredientDAO.getByName(name);
            return ingredient != null;
        }catch (EmptyResultDataAccessException e){
            return false;
        }
    }

    //recette
    @Autowired
    private RecetteDAO recetteDAO;

    @Override
    public void createRecette(Recette recette) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createRecette'");
    }

    @Override
    public void deleteRecetteById(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteRecetteById'");
    }

    @Override
    public Recette readRecette(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readRecette'");
    }

    @Override
    public List<Recette> showAllRecettes() {
        return recetteDAO.showAll();
    }
    
}
