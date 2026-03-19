package Entities;

public class Product {

    // attributi

    private long id;
    private String name;
    private String category;
    private double price;

    // costruttore

    public Product(long idInput, String nameInput, String categoryInput, double priceInput) {
        this.id = idInput;
        this.name = nameInput;
        this.category = categoryInput;
        this.price = priceInput;

    }


    // metodi get


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
