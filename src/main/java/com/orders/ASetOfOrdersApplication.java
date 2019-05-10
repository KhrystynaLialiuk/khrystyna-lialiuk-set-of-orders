package com.orders;

import java.util.*;

public class ASetOfOrdersApplication {

    public static void main(String[] args) {

        Client client1 = new Client("Jakub", "Panczak", "Warszawa, Rakowiecka 3");
        Client client2 = new Client("Khrystyna", "Lialiuk", "Zabki, Powstancow 23");

        Product product1 = new Product("Phone", "Samsung", "S4");
        Product product2 = new Product("Cooker", "Bosch", "PI57");

        // order2 and order4 intentionally made the same in order to test equals() method
        Order order1 = new Order(client1, product2, 2018, 12, 24);
        Order order2 = new Order(client2, product1, 2019, 4, 17);
        Order order3 = new Order(client2, product1, 2019, 4, 18);
        Order order4 = new Order(client2, product1, 2019, 4, 17);

        HashSet<Order> orders = new HashSet<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);

        System.out.println("There are " + orders.size() + " orders created:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
