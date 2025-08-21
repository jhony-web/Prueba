package Ecepciones;

public class Array {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int resultado = a / b; // Esto lanza ArithmeticException

            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Esto lanza ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            System.out.println("❌ Error aritmético: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Índice fuera del arreglo: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❗ Otro error no controlado: " + e.getMessage());
        }

        System.out.println("➡️ Programa continúa.");
    }

}
