package Logica;

public class Bulbasaur extends Pokemon implements InterPlanta{

    public Bulbasaur() {
    }

    @Override
    protected void Placaje() {
        System.out.println("Bul Placaje");
    }

    @Override
    protected void Araniazo() {
        System.out.println("Bul Aña");
    }

    @Override
    protected void Mordisco() {
        System.out.println("Bul Mor");
    }


    @Override
    public void PlantaFeroz() {
        System.out.println("Planta F");
    }

    @Override
    public void Latigo() {
        System.out.println("Latigazoo");
    }
}
