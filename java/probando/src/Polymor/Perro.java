package Polymor;

public class Perro extends Animal {

    @Override
    public void Sonido(){
        System.out.println("Guaaauu");
    }

    @Override
    public String getType(){
        return "Perro";
    }
}
