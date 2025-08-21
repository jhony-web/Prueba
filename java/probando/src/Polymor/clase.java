package Polymor;

import java.util.ArrayList;

public class clase {


    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        System.out.println(animals);

        animals.add(new Perro());

        //System.out.println(animals);

        for(Animal a : animals){
            a.Sonido();
        }

        var Salud = new Saludo();
        Salud.saludar();
        Salud.saludar("pedro");

        var va = new Vahiculo();
        var Movil = new Carro();
        var bici = new  Bicicleta();

        va.encender();
        Movil.encender();
        bici.encender();


        ArrayList<Vahiculo> moviles = new ArrayList<>();
        moviles.add(new Carro());
        moviles.add(new Vahiculo());
        moviles.add(new Bicicleta());

        for (Vahiculo a: moviles){
            a.encender();
        }

        var notificacion = new Notificacion();
        var email = new EmailNoti();
        var sms = new SMS();


        sendNotification(email);
        sendNotification(sms);

        var ani = new Animal();
        var per = new Perro();

        showAnimalType(ani);
        showAnimalType(per);

        var valor = new Converter();

        valor.convert(5);
        valor.convert(4.56);
        valor.convert("asdads");

        var dinero = new Product(25);

        var libro = new book(150);
        var libro2 = new book(1200);

        System.out.println(dinero.getPrice());
        System.out.println(libro.getPrice());
        System.out.println(libro2.getPrice());

        ArrayList<Product> producto = new ArrayList<>();

        //producto.add(50);
        producto.add(new Product(100));
        producto.add(new book(1000));

        for(Product p : producto){
            System.out.println(p.getPrice());
        }

        ArrayList<Personaje> atac = new ArrayList<>();

        atac.add(new MAgo());
        atac.add(new Personaje());

        for(Personaje a : atac){
            System.out.println(a.atacar());
        }

         Personaje[] team ={
                new Personaje(),
                 new MAgo()
         };
        for(Personaje f:team){
            System.out.println(f.atacar());
        }

    }


        public static void sendNotification(Notificacion n) {
            n.send();
        }

        public static void showAnimalType(Animal animal){
           System.out.println(animal.getType());
        }

    }



