//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //figura cua = new cuadrado(2,5,10);
        cuadrado cua = new cuadrado(10);
        double resul = cua.calcularArea();

        System.out.println(resul);
        System.out.println(cua.prueba());

        circulo cir = new circulo(5);
        System.out.println(cir.calcularArea());
        cir.dibujar();


        
    }
}