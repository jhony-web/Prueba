package Herencia;

public class Manager extends Empleado{

    private String depa;

    public Manager(String nombre, int salario, String depa) {
        super(nombre, salario); // Llama al constructor de Empleado
        this.depa = depa;
    }
    // Getter para el departamento
    public String getDepa() {
        return depa;
    }

    // Método opcional para mostrar toda la información
    public void mostrarInformacion() {
        System.out.println("Manager: " + getNombre() + ", Salario: " + getSalario() + ", Departamento: " + depa);
    }

}
