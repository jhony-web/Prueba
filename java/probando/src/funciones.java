import java.util.ArrayList;

public class funciones {

    public static void frase(){
        System.out.println("hola javaa");
    }

    public static void holaxxx(String name){
        System.out.println("hola "+name);
    }
    public static int resta(int a, int b){
        int c = a-b;
        System.out.println(c);
        return c;
    }

    public static int cuad(int a){
        int b = a*a;
        System.out.println(b);
        return b;
    }

    public static void parImpar(int p){
        if(p%2==0){
            System.out.println("Par");

        }else{
            System.out.println("impar");
        }
    }
    public static boolean edad(int e){
        if (e>=18){
            return true;
        }else {
            return false;
        }
    }


    public static int facto(int num){
        int fac = 1;
        for(int k=1;k<=num;k++){
            fac= fac*k;
        }
        System.out.println(fac);
        return fac;
    }

    public static void mostrarLista(ArrayList<String> lista) {
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }


    public static void main(String[] args){

    frase();
    holaxxx("jose");
    resta(9,4);
    cuad(6);

    parImpar(11);

    boolean ed = edad(2);
    System.out.println(ed);

    facto(4);


        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Casa");
        palabras.add("Sol");
        palabras.add("Montaña");

        mostrarLista(palabras);
    }

}
