public class SMS extends Messege {
    String phoneNumber;


    public void  send(){
        System.out.println(this.phoneNumber +" " + this.text);
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public SMS(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public SMS(String txt, String phoneNumber) {
        super(txt);
        this.phoneNumber = phoneNumber;
    }
    public static void main(String[] args){
        Messege a = new SMS("75421421421");
        a.send();
        Messege b = new SMS("Halo","999999221");
        b.send();
        System.out.println(b.charNumber());
    }   
}
