/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Pizza {
    private String toppings;
    private float diameter;
    private float price;

    public Pizza(String toppings, float diameter, float price) {
        this.toppings = toppings;
        this.diameter = diameter;
        this.price = price;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" + "toppings=" + toppings + ", diameter=" + diameter + ", price=" + price + '}';
    }
    
    
    
    
}
