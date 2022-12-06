public class AudioBook extends Book {
    protected String length;
    protected int minutes;
    protected int seconds;
    public AudioBook(String name, String author, int minutes, int seconds) {
        super(name, author);
        this.minutes = minutes;
        this.seconds = seconds;
        this.length="Minut: "+minutes+" Sekund: "+seconds;
    }
    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public void display(){
        System.out.println(getName()+" "+getAuthor()+" "+this.length);
    }
    public static void main(String[] args){
        AudioBook a = new AudioBook("abc", "xyz", 12, 34);
        a.setAuthor("bvd");
        a.display();
    }
   
    
}
