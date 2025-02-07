package fr.eni.loco.loco.dal;

import java.util.List;

import fr.eni.loco.loco.bo.Recette;

public interface RecetteDAO {

    public void create (Recette recette);

    public void deleteById(long id);

    public Recette read(long id);

    public List<Recette> showAll();

}
