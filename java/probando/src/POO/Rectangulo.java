package POO;

public class Rectangulo {

    int base;
    int altura;

    public Rectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
    }

    public void perimetro(){
        int p;
        p = 2*base+2*altura;
        System.out.println(p);
    }
    public void area(){
        int a;
        a = (base*altura);
        System.out.println(a);
    }
}
