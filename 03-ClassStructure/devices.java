public class devices {
    String name;
    boolean connected;
    public static int numberOfConnectedDevices =0;
    


    public devices(String nameC){
        name=nameC;


    }
    public void connect(){
        if(!connected){
            numberOfConnectedDevices++;
        }
        connected=true;
    }

    public void disconnect(){
        if(connected){
            numberOfConnectedDevices--;
        }
        connected=false;
    }
    public void isConnected(){
        System.out.println(connected);
    }
    public static void displayConnected(){
        System.out.println(numberOfConnectedDevices);
    }
    public static void main (String[] args){
        devices a = new devices("abc");
        a.connect();
        devices b = new devices("Cbc");
        devices c = new devices("def");
        devices d = new devices("tel");
        devices e = new devices("pierdoły");
        b.connect(); 
        c.connect();
        displayConnected();
        c.disconnect();
        displayConnected();
        
    }
}
