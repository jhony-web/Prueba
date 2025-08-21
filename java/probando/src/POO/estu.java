package POO;

public class estu {
    int nota;

    public estu(int nota){
        this.nota = nota;
    }

    public void rendi(){
        if(nota<=10){
            System.out.println("Reprobo");
        }else {
            System.out.println("Aprobo");
        }

    }

}
