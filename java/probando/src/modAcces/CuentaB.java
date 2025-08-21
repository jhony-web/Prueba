package modAcces;

public class CuentaB {
    private double balance;

    public CuentaB(double balance){
        this.balance=balance;
    }


    public void deposito(double monto){
        balance = balance + monto;
        System.out.println("Depósito exitoso. Nuevo saldo: " + balance);
    }

    public void retiro(double monto){
        balance = balance - monto;
        System.out.println("Retiro exitoso. Nuevo saldo: "+ balance);
    }

    public double obtenerBalance(){
        return balance;
    }
}
