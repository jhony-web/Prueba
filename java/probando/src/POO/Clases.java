package POO;

import java.util.ArrayList;

public class Clases {

    public static void main(String[] args) {
        var libro = new Book("asd","tuj");
        libro.mostrarD();

        var perro = new Dog();
        perro.ladrar();

        var estudiante = new estu(15);
        estudiante.rendi();

        var Recta = new Rectangulo(2,5);
        Recta.perimetro();
        Recta.area();

        var q = new Persona("juan", 15);
        var w = new Persona("carlos",36);

        System.out.println(q);
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add(q.getNombre());
        nombres.add(w.getNombre());

        System.out.println(nombres);


    }

}
