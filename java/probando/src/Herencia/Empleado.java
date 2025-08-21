package Herencia;

public class Empleado {

    private String nombre;
    private int salario;

    public Empleado(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;
    }
    // Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para obtener el salario
    public int getSalario() {
        return salario;
    }
}
