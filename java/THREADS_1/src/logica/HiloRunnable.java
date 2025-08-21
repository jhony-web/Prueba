package logica;

public class HiloRunnable implements Runnable{

    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Hilo runneable " + i);
        }
    }


}
