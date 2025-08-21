package Ecepciones;

public class main_dos {


    public static void main(String[] args) {
        int t = 150;

        try{

            verificar(t);
        }catch(TemperaturaCheck e){
            System.out.println("Error "+ e.getMessage());
        }
    }


    public static void verificar(int temperatura) throws TemperaturaCheck{
        if(temperatura < -50 ||50 < temperatura){
            throw new TemperaturaCheck("Temperatura fuera de rango");

            }else {
            System.out.println(temperatura);
        }
    }
}
