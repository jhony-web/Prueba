package Polymor;

public class Product {

    protected double basePrice;

    public Product(double price){
        this.basePrice = price;
    }

    public double getPrice(){
        return basePrice;
    }

}
