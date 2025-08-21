package POO;

public class Book {

    String title;
    String author;

    public Book(String title, String author){
        this.title=title;
        this.author= author;
    }

    public void mostrarD(){
        System.out.println(title);
        System.out.println(author);
    }



}
