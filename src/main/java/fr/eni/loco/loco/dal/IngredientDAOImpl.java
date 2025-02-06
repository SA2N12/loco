package fr.eni.loco.loco.dal;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import fr.eni.loco.loco.bo.Ingredient;

@Repository
public class IngredientDAOImpl implements IngredientDAO {

    private static final String INSERT = "insert into ingredients (name, quantity) values  (:name, :quantity)";
    private static final String SELECT_ALL = "select id, name, quantity from Ingredients";
    private static final String SELECT_BY_ID = "select id, name, quantity from ingredients where id=:idIngredient";
    private static final String DELETE_BY_ID = "DELETE FROM Ingredients WHERE id=:idIngredient"; 

    private NamedParameterJdbcTemplate namedParameter;

    public IngredientDAOImpl(NamedParameterJdbcTemplate namedParameter){
        this.namedParameter = namedParameter;
    }

    @Override
    public void create(Ingredient ingredient) {
        KeyHolder keyHolder = new GeneratedKeyHolder();

        MapSqlParameterSource map = new MapSqlParameterSource();
        map.addValue("name", ingredient.getName());
        map.addValue("quantity", ingredient.getQuantity());
        namedParameter.update(INSERT, map, keyHolder);

        Number generatedKey = keyHolder.getKey();
		if(generatedKey != null) {
			ingredient.setId(generatedKey.longValue());
		}

    }

    @Override
    public List<Ingredient> showAll() {
        return namedParameter.query(SELECT_ALL, new BeanPropertyRowMapper<>(Ingredient.class));
    }

    @Override
    public Ingredient read(long id) {
        MapSqlParameterSource map = new MapSqlParameterSource();
        map.addValue("idIngredient", id);
        return namedParameter.queryForObject(SELECT_BY_ID, map, new BeanPropertyRowMapper<>(Ingredient.class));
    }

    @Override
    public void incrementQuantity(Ingredient ingredient) {
        ingredient.setQuantity(ingredient.getQuantity()+1);
    }

    @Override
    public void decrementQuantity(Ingredient ingredient) {
        ingredient.setQuantity(ingredient.getQuantity()-1);
    }

    @Override
    public void deleteById(long id) {
        MapSqlParameterSource map = new MapSqlParameterSource();
        map.addValue("idIngredient", id);
        namedParameter.update(DELETE_BY_ID, map);
    }
}
