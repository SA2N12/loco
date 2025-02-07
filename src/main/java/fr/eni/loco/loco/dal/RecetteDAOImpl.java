package fr.eni.loco.loco.dal;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import fr.eni.loco.loco.bo.Recette;

@Repository
public class RecetteDAOImpl implements RecetteDAO{

    private static final String SELECT_ALL = "select id, name, description from Recettes";

    private NamedParameterJdbcTemplate namedParameter;
    
    public RecetteDAOImpl(NamedParameterJdbcTemplate namedParameter) {
        this.namedParameter = namedParameter;
    }

    @Override
    public void create(Recette recette) {
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public void deleteById(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public Recette read(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public List<Recette> showAll() {
        return namedParameter.query(SELECT_ALL, new BeanPropertyRowMapper<>(Recette.class));
    }

}
