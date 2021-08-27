package com.pizzabackend.pizzaapp.model;

import org.springframework.data.annotation.Id;

public class Pizza {

    @Id
    public String orderNumber; //let Spring hand all getters and setters for @Id

    private String pizzaSize;
    private String pizzaCrust;
    private String[] pizzaToppings;
    private String email;


    public Pizza() {
    }

    public Pizza(String pizzaSize, String pizzaCrust, String[] pizzaToppings, String email) {
        this.pizzaSize = pizzaSize;
        this.pizzaCrust = pizzaCrust;
        this.pizzaToppings = pizzaToppings;
        this.email = email;
    }

    public String getOrderNumber(){return this.orderNumber;}

    public String getPizzaSize() {
        return this.pizzaSize;
    }

    public String getPizzaCrust() {
        return this.pizzaCrust;
    }

    public String[] getPizzaToppings() {
        return this.pizzaToppings;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPizzaSize(String size) {
        this.pizzaSize = size;
    }

    public void setPizzaCrust(String crust) {
        this.pizzaCrust = crust;
    }

    public void setPizzaToppings(String[] toppings) {
        this.pizzaToppings = toppings;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
