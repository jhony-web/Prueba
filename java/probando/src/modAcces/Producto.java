package modAcces;

public class Producto {

    private float price;

    public Producto(float price){
        this.price = price;
    }
    public void setPrice(float newPrice){
        if (newPrice>0){
            this.price = newPrice;
        }else {
            System.out.println("precio menor 0");
        }


    }
    public float getPrice() {
        return price;
    }
}
