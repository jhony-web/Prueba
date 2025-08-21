public class circulo implements figura, Dibijable,Rotable{

    private double radio;

    public circulo(double radio) {

        this.radio = radio;
    }


    @Override
    public double calcularArea(){
        double resultado = 3.14 * radio*radio;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("dibuja circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Se rota circulo");
    }
}
