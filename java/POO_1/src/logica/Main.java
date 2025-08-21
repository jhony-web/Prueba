package logica;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Alumno A1 = new Alumno();

        //System.out.println(A1.nombre);

        Alumno A2 = new Alumno(2,"CArlos","Quispe");

        //System.out.println(A2.nombre);
        System.out.println(A2.getNombre());

        A1.setApellido("asd");
        System.out.println(A1.getApellido());

        A2.setApellido("Luisina");
        System.out.println(A2.getApellido());
    }
}