import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class iteraciones {
    public static void main(String[]args){

    int i = 1;
        while(i< 11){
            System.out.println(i);
            i++;
        }

        ArrayList<String> lista = new ArrayList<>();
        lista.add("casa");
        lista.add("roca");
        lista.add("control");
        lista.add("cuaderno");

        int a = 0;
        do{
            System.out.println(lista.get(a));
            a++;
        }while(a < lista.size());


        for(int b=0;b<101;b+=5){
            System.out.println(b);

        }

    int[] numeros = {2, 4, 6, 7, 8};
    int c = 0;
        while(c<numeros.length){
            System.out.println(numeros[c]);
            c++;
        }

    for(int f = 0; f<numeros.length;f++){
        System.out.println(numeros[f]);
    }

        //HashSet
        HashSet<String> MySet = new HashSet<>();
        MySet.add("asdasd");
        MySet.add("zzz");
        MySet.add("qweq");
        MySet.add("zzz");
    for(String palabra: MySet){
        System.out.println(palabra);
    }
        //hashMap

        HashMap<Integer, String> nombres = new HashMap<>();

        nombres.put(123, "pedro");
        nombres.put(456, "juan");
        nombres.put(67, "juan");

        for(Integer clave: nombres.keySet()){
            System.out.println(clave);
        }

        for(Map.Entry<Integer, String> en : nombres.entrySet()){
            System.out.println(en.getKey());
            System.out.println(en.getValue());
        }

        int g=0;
        while(g<20){
            g++;
            if(g%3==0){
                continue;
            }

            System.out.println(g);



        }
    int[] num = {2, 4, 6, 7,-9 , 8};
    int j = 0;

        do{
            System.out.println(num[j]);
            j++;
            if(num[j]< 0){break;
            }

        }while(j<num.length);


    int numero = 3;
    int fac = 1;
    for(int k=1;k<=numero;k++){
     fac= fac*k;
     System.out.println(fac);
    }
    System.out.println(fac);
    }
}
