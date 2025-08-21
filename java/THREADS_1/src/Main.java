import logica.Hilo;
import logica.HiloRunnable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Hilo H = new Hilo();
        Thread HRun = new Thread(new HiloRunnable());

        //H.run();
        H.start();

        HRun.start();

    }
}