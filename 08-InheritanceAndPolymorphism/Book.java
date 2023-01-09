public class Book{
    private String name;
    private String author;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    public void display(){
        System.out.println(name+author);
    }
    


    public static void main(String[] args){
        Book a = new Book("w pustyni","Sienkiewicz");
        Book b = new Book("gdzie indziej","nie Sienkiewicz");
        a.display();
        b.display();
    }

}