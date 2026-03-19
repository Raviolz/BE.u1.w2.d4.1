package Entities;

import java.time.LocalDate;
import java.util.List;

public class Order {

    // Attributi

    private long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;

    // Costruttore

    public Order(long idInput, String statusInput, LocalDate orderDateInput, LocalDate deliveryDateInput, List<Product> productsInput, Customer customerInput) {
        this.id = idInput;
        this.status = statusInput;
        this.orderDate = orderDateInput;
        this.deliveryDate = deliveryDateInput;
        this.products = productsInput;
        this.customer = customerInput;

    }

    // metodi get


    public long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }

    // metodi

//    public double total() {
//        double total = 0;
//
//        for (int i = 0; i < this.getProducts().size(); i++) {
//            total += this.getProducts().get(i).getPrice();
//        }
//
//        return total;
//    }

    public double total() {
        return this.getProducts()
                .stream()
                .mapToDouble(p -> p.getPrice())
                .sum();
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", products=" + products +
                ", customer=" + customer +
                '}';
    }


    // ES1


}
