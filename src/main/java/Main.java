package Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {

        // CREAZIONE TOT CUSTOMER

        Customer c1 = new Customer(1, "Luca Rossi", 2);
        Customer c2 = new Customer(2, "Marco Bianchi", 3);
        Customer c3 = new Customer(3, "Giulia Ferrari", 1);
        Customer c4 = new Customer(4, "Alessandro Romano", 4);
        Customer c5 = new Customer(5, "Francesca Gallo", 2);
        Customer c6 = new Customer(6, "Matteo Conti", 5);
        Customer c7 = new Customer(7, "Chiara Ricci", 3);
        Customer c8 = new Customer(8, "Davide Moretti", 1);
        Customer c9 = new Customer(9, "Sara Barbieri", 4);
        Customer c10 = new Customer(10, "Andrea Lombardi", 2);
        Customer c11 = new Customer(11, "Elena Greco", 5);
        Customer c12 = new Customer(12, "Simone Rinaldi", 3);

//test
        // System.out.println(c1);


        // CREZIONE TOT PRODUCTS

        Product p1 = new Product(1, "Smartphone", "electronics", 699.0);
        Product p2 = new Product(2, "Baby Stroller", "baby", 220.0);
        Product p3 = new Product(3, "Java Programming Guide", "books", 120.0);
        Product p4 = new Product(4, "Boys T-Shirt", "boys", 15.0);
        Product p5 = new Product(5, "Pasta Pack", "food", 2.5);
        Product p6 = new Product(6, "Laptop", "electronics", 1200.0);
        Product p7 = new Product(7, "Clean Code", "books", 95.0);
        Product p8 = new Product(8, "Baby Bottle Set", "baby", 25.0);
        Product p9 = new Product(9, "Men T-Shirt", "clothes", 20.0);
        Product p10 = new Product(10, "Boys Jeans", "boys", 40.0);

        Product p11 = new Product(11, "Design Patterns", "books", 150.0);
        Product p12 = new Product(12, "Baby Monitor", "baby", 90.0);
        Product p13 = new Product(13, "Wireless Headphones", "electronics", 150.0);
        Product p14 = new Product(14, "Olive Oil", "food", 12.0);
        Product p15 = new Product(15, "Boys Jacket", "boys", 60.0);
        Product p16 = new Product(16, "Spring Boot Basics", "books", 80.0);
        Product p17 = new Product(17, "Women Dress", "clothes", 55.0);
        Product p18 = new Product(18, "Baby Crib", "baby", 300.0);
        Product p19 = new Product(19, "Boys Sneakers", "boys", 50.0);
        Product p20 = new Product(20, "Algorithms Book", "books", 130.0);

        Product p21 = new Product(21, "Coffee Beans", "food", 9.5);
        Product p22 = new Product(22, "Smartwatch", "electronics", 250.0);
        Product p23 = new Product(23, "Baby Diapers Pack", "baby", 40.0);
        Product p24 = new Product(24, "Boys Shorts", "boys", 20.0);
        Product p25 = new Product(25, "Data Structures", "books", 110.0);
        Product p26 = new Product(26, "Winter Jacket", "clothes", 120.0);
        Product p27 = new Product(27, "Bluetooth Speaker", "electronics", 80.0);
        Product p28 = new Product(28, "Baby Toy Set", "baby", 35.0);
        Product p29 = new Product(29, "Boys Hoodie", "boys", 45.0);
        Product p30 = new Product(30, "Microservices Guide", "books", 90.0);

        Product p31 = new Product(31, "Chocolate Box", "food", 15.0);
        Product p32 = new Product(32, "Sneakers", "clothes", 70.0);
        Product p33 = new Product(33, "Docker Essentials", "books", 70.0);
        Product p34 = new Product(34, "Baby High Chair", "baby", 85.0);
        Product p35 = new Product(35, "Boys Cap", "boys", 12.0);
        Product p36 = new Product(36, "Biscuits", "food", 4.0);
        Product p37 = new Product(37, "Kubernetes in Action", "books", 140.0);
        Product p38 = new Product(38, "Baby Blanket", "baby", 20.0);
        Product p39 = new Product(39, "Jeans", "clothes", 45.0);
        Product p40 = new Product(40, "Boys Socks Pack", "boys", 10.0);

        Product p41 = new Product(41, "Java Concurrency", "books", 105.0);
        Product p42 = new Product(42, "Baby Bath Tub", "baby", 55.0);
        Product p43 = new Product(43, "Boys Pajamas", "boys", 25.0);
        Product p44 = new Product(44, "Advanced Java Book", "books", 135.0);
        Product p45 = new Product(45, "Baby Car Seat", "baby", 180.0);
        Product p46 = new Product(46, "Boys Backpack", "boys", 35.0);
        Product p47 = new Product(47, "Database Systems", "books", 125.0);
        Product p48 = new Product(48, "Baby Pacifier", "baby", 8.0);
        Product p49 = new Product(49, "Boys Winter Coat", "boys", 75.0);
        Product p50 = new Product(50, "Baby Swing", "baby", 150.0);

        List<Product> allProductList = new ArrayList<>(List.of(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30,
                p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50));
        // test

        // System.out.println(p20);
        // System.out.println(p33);
        // System.out.println(p50);
        //  System.out.println("Lista di tutti prodotti" + allProductList);


        // CREAZIONE TOT ORDER    NOTA: List.of() la crea sul momento non gli assegni nome esiste solo dentro o1,2,3 ecc E SOPRATTUTTO E'IMMUTABILE. Diverso da List<Integer> l = new ArrayList<>();
        // Order o1 = new Order(1,"pending",LocalDate.of(2026, 1, 2), LocalDate.of(2026, 1, 6),new ArrayList<>(List.of(p1, p2, p3)), c1);


        Order o1 = new Order(1, "pending", LocalDate.of(2026, 1, 2), LocalDate.of(2026, 1, 6), List.of(p3), c1);
        Order o2 = new Order(2, "delivered", LocalDate.of(2026, 1, 5), LocalDate.of(2026, 1, 10), List.of(p1, p7, p30, p14), c2);
        Order o3 = new Order(3, "shipped", LocalDate.of(2026, 1, 8), LocalDate.of(2026, 1, 13), List.of(p11, p18), c3);
        Order o4 = new Order(4, "pending", LocalDate.of(2026, 1, 12), LocalDate.of(2026, 1, 18), List.of(p4, p9, p41, p22, p35), c4);
        Order o5 = new Order(5, "delivered", LocalDate.of(2026, 1, 15), LocalDate.of(2026, 1, 20), List.of(p5, p36), c5);

        Order o6 = new Order(6, "shipped", LocalDate.of(2026, 1, 18), LocalDate.of(2026, 1, 23), List.of(p6, p13, p22), c6);
        Order o7 = new Order(7, "pending", LocalDate.of(2026, 1, 22), LocalDate.of(2026, 1, 28), List.of(p2), c7);
        Order o8 = new Order(8, "delivered", LocalDate.of(2026, 1, 25), LocalDate.of(2026, 1, 30), List.of(p8, p15, p23, p28), c8);
        Order o9 = new Order(9, "shipped", LocalDate.of(2026, 1, 28), LocalDate.of(2026, 2, 3), List.of(p10, p20, p31), c9);
        Order o10 = new Order(10, "pending", LocalDate.of(2026, 2, 1), LocalDate.of(2026, 2, 6), List.of(p16, p24), c10);

        Order o11 = new Order(11, "delivered", LocalDate.of(2026, 2, 4), LocalDate.of(2026, 2, 9), List.of(p19, p27, p33, p42, p45), c11);
        Order o12 = new Order(12, "shipped", LocalDate.of(2026, 2, 7), LocalDate.of(2026, 2, 12), List.of(p28), c12);
        Order o13 = new Order(13, "pending", LocalDate.of(2026, 2, 10), LocalDate.of(2026, 2, 15), List.of(p29, p35, p43), c1);
        Order o14 = new Order(14, "delivered", LocalDate.of(2026, 2, 13), LocalDate.of(2026, 2, 18), List.of(p37, p44), c2);
        Order o15 = new Order(15, "shipped", LocalDate.of(2026, 2, 16), LocalDate.of(2026, 2, 21), List.of(p38, p45, p49, p21), c3);

        Order o16 = new Order(16, "pending", LocalDate.of(2026, 2, 19), LocalDate.of(2026, 2, 24), List.of(p39, p46), c4);
        Order o17 = new Order(17, "delivered", LocalDate.of(2026, 2, 22), LocalDate.of(2026, 2, 27), List.of(p40, p47, p1, p6), c5);
        Order o18 = new Order(18, "shipped", LocalDate.of(2026, 2, 25), LocalDate.of(2026, 3, 2), List.of(p6), c6);
        Order o19 = new Order(19, "pending", LocalDate.of(2026, 3, 1), LocalDate.of(2026, 3, 6), List.of(p3, p11, p22, p30, p48), c7);
        Order o20 = new Order(20, "delivered", LocalDate.of(2026, 3, 5), LocalDate.of(2026, 3, 10), List.of(p25, p31), c8);


        List<Order> allOrderList = new ArrayList<>(List.of(o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20));
        //test


        //  System.out.println(o18);
        // System.out.println(o7);
        // System.out.println(allOrderList);


        System.out.println("*****************************************************      ES  1      ************************************************************");


        Map<Customer, List<Order>> orderByCustomer = allOrderList.stream().collect(Collectors.groupingBy(order -> order.getCustomer()));
        orderByCustomer.forEach((customer, orderList) ->
                System.out.println("Cliente: " + customer.getName() + ", ordini effettuati: " + orderList)
        );


        System.out.println("*****************************************************      ES  2      ************************************************************");

        Map<Customer, Double> totalByCustomer = allOrderList.stream()
                .collect(Collectors.groupingBy(
                        order -> order.getCustomer(), // come raggruppo
                        Collectors.summingDouble(order -> order.total()) // cosa faccio dentro ogni gruppo
                ));

        totalByCustomer.forEach((customer, total) ->
                System.out.println("Cliente: " + customer.getName() + ", totale acquisti: " + total)
        );
    }
}