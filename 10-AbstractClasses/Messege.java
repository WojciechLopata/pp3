public abstract class Messege {
    String text;
    public  Messege(){
        text="";
    };
    public Messege(String txt){
        this.text=txt;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public int charNumber(){
        int a= this.text.length();
        return a;

    }
    public abstract void  send();
    
}
