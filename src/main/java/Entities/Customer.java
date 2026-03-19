package Entities;

public class Customer {

    // attributi

    private long id;
    private String name;
    private int tier;

    // costruttore

    public Customer(long idInput, String nameInput, int tierInput) {
        this.id = idInput;
        this.name = nameInput;
        this.tier = tierInput;

    }

    // metodi get


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTier() {
        return tier;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }
}
