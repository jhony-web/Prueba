package Polymor;

public class book extends Product{

    public book(double price){
        super(price);
    }


    @Override
    public double getPrice() {
        return basePrice*0.5;
    }
}
