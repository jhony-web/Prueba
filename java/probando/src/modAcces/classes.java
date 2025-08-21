package modAcces;

public class classes {
    public static void main(String[] args) {
        var pe  = new Person("mario", 54);

        String nombre = pe.getName();
        System.out.println(nombre);
        pe.setName("juan");
        nombre = pe.getName();
        System.out.println(nombre);

        var prec = new Producto(25);
        prec.setPrice(30);
        System.out.println(prec.getPrice());

        var cuenta = new CuentaB(50);
        System.out.println(cuenta.obtenerBalance());

        cuenta.deposito(20);
        System.out.println(cuenta.obtenerBalance());

        cuenta.retiro(10);
        System.out.println(cuenta.obtenerBalance());

        var libro = new Libro("juego de tronos");
        System.out.println(libro.obtenerTitulo());

    }
}

