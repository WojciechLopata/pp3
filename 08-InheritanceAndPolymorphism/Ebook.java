public class Ebook extends Book {
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;

    }

    public Ebook(String name, String author, String fileName) {
        super(name, author);
        this.fileName = fileName;
    }
    public void display(){
        System.out.println(super.name+super.author+fileName);
    }
    
    
    public static void main(String[] args){
        Ebook a = new Ebook("w pustyni","Sienkiewicz","wpiwp.pdf");
        Ebook b = new Ebook("gdzie indziej","nie Sienkiewicz","nwm.doc");
        a.display();
        b.display();
        Book c =new Book("krzyzacy ", "tez sienkiewicz");
        c.display();
    }
    
}
