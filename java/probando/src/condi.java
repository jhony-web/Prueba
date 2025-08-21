public class condi {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int c = 10;

        if (a > b) {
            System.out.println("a es mayor q b");

        } else if (a == b) {
            System.out.println("a es igual q b");

        }

        if (a % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }


        if (0 < b && b < 100) {
            System.out.println("rango");
        }


        int dia = 2;

        switch (dia) {
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
        }


        if(a>b && a>c){
            System.out.println(a);
        } else if (b>a && b>c) {
            System.out.println(b);

        } else if (c>a && c>b) {
            System.out.println(c);
        }else {
            System.out.println("same");
        }


    }
}
