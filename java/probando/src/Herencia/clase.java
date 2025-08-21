package Herencia;

public class clase {

    public static void main(String[] args) {
        Vehiculo auto = new Vehiculo();
        auto.movee();

        var car = new carro();
        car.movee();
        car.bocina();

        var an = new animal();
        an.hazSonido();

        var per = new perro();
        per.hazSonido();

        var cat = new gato();
        cat.hazSonido();

        var Em = new Empleado("huan",1000);
        System.out.println(Em.getSalario());

        var Mana = new Manager("lope",2000,"ventas");
        System.out.println(Mana.getSalario());

        System.out.println(Mana.getDepa());
    }


}
