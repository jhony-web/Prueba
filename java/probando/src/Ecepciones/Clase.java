package Ecepciones;

import java.util.Scanner;

public class Clase {

    public static void main(String[] args) {

        int r=4;
        while(r>1) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();

            int b = scanner.nextInt();


            try {
                int resultado = a / b;
                System.out.println(resultado);
            } catch (ArithmeticException e) {
                System.out.println("Error divicion 0");
            }


            System.out.println("fin");
            r++;

        }
    }

}
