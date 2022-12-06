import java.util.ArrayList;


public class Library {
    ArrayList<Book>   books = new ArrayList<Book>();

    public void addBook(Book book){
        books.add(book);

    }
    public void display(){
        int size=books.length();
        for (int i=0;size>i;i++){
            books.get(i).display();
        }
    }
   
    public static void main(String[] args){
        ArrayList<Book>   books = new ArrayList<Book>();
    

    }
}
