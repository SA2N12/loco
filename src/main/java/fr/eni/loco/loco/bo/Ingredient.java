package fr.eni.loco.loco.bo;

public class Ingredient {

    //attributs
    private long id;

    private String name;

    private int quantity;

    //constructeur
    public Ingredient() {

    }

    public Ingredient(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public Ingredient(long id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    //getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Ingredient [id=" + id + ", name=" + name + ", quantity=" + quantity + "]";
    }

    
}
