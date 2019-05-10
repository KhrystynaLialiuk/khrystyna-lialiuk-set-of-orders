package com.orders;

import java.time.*;

public class Order {
    private Client client;
    private Product product;
    private LocalDate dateOfOrder;

    Order(Client client, Product product, int year, int month, int day) {
        this.client = client;
        this.product = product;
        this.dateOfOrder = LocalDate.of(year, month, day);
    }

    @Override
    public String toString() {
        return client + " has ordered " + product + " on " + dateOfOrder + ";";
    }

    @Override
    public int hashCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(dateOfOrder.getMonthValue()).append(dateOfOrder.getDayOfMonth()).append(client.getName().length()).append(client.getSurname().length()).append(product.getType().length()).append(product.getBrand().length()).append(product.getModel().length());
        int hashCode = Integer.parseInt(sb.toString());
        System.out.println("HashCode is " + hashCode);  // in order to check if it works correctly
        return hashCode;
    }

    @Override
    public boolean equals(Object o) {
        Order e = (Order) o;
        return (client.getName().equals(e.getClient().getName())) &&
                (client.getSurname().equals(e.getClient().getSurname())) &&
                (product.getType().equals(e.getProduct().getType())) &&
                (product.getBrand().equals(e.getProduct().getBrand())) &&
                (product.getModel().equals(e.getProduct().getModel())) &&
                (dateOfOrder.getYear() == e.getDateOfOrder().getYear()) &&
                (dateOfOrder.getMonthValue() == e.getDateOfOrder().getMonthValue()) &&
                (dateOfOrder.getDayOfMonth() == e.getDateOfOrder().getDayOfMonth());
    }

    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }
}