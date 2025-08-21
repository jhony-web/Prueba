import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Structures {
    public static void main (String[] args){
        //int[] numeros = new int[3];
        int[] numeros = {1,2,3,6};

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);

        numeros[0] = -1;
        System.out.println(numeros[0]);

        //arraylist
        ArrayList<String> lista = new ArrayList<>();

        System.out.println(lista);

        lista.add("casa");
        lista.add("noce");
        lista.add("noce");
        lista.add("cuaderno");
        System.out.println(lista);

        lista.remove(0);
        System.out.println(lista);

        //HashSet
        HashSet<String> MySet = new HashSet<>();
        MySet.add("asdasd");
        MySet.add("zzz");
        MySet.add("qweq");
        MySet.add("zzz");
        System.out.println(MySet);

        MySet.remove("zzz");
        System.out.println(MySet);

        //hashMap

        HashMap<Integer, String> nombres = new HashMap<>();

        nombres.put(123, "pedro");
        nombres.put(456, "juan");
        nombres.put(67, "juan");

        System.out.println(nombres);

        nombres.replace(67, "gloria");
        nombres.remove(123);

        System.out.println(nombres);

        Integer[] nu = {1,2,3,6};
        ArrayList<Integer> Aralist = new ArrayList<>(Arrays.asList(nu));
        System.out.println(Aralist);

        System.out.println(lista);

        HashSet<String> hashSet = new HashSet<>(lista);
        System.out.println(lista);

    }
}
