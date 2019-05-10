package com.orders;

public class Client {

    private String name;
    private String surname;
    private String shippingAddress;

    Client(String name, String surname, String shippingAddress) {
        this.name = name;
        this.surname = surname;
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", residing under the address: " + shippingAddress;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getShippingAddress() {
        return this.shippingAddress;
    }
}