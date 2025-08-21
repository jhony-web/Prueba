package Ecepciones;

public class Cuatro {

    public static void main(String[] args) {

        //int nume = trans("28");

        try {
            int nume = trans("28J");
            System.out.println(nume);
        }catch (NumberFormatException e ){
            System.out.println("no es numero");
        }


    }

    public static int trans(String a){
        int num = Integer.parseInt(a);
        return num;
    }


}
