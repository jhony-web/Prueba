public class cuadrado implements figura, Dibijable{

    private double lado;

    public cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado*lado;
        return resultado;
    }
    public String prueba(){
        return "asf";
    }

    @Override
    public void dibujar() {
        System.out.println("dibuja un cuadrado");
    }
}
