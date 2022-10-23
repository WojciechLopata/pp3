
public class Lamp{
    //WYKAZ ATRYBUTU 
  boolean status;
  public void turnOn(){
      status=true;
      
  };
  public void turnOff(){
     status=false;
  };
  public void displayStatus(){
    if(status){
        System.out.println("Lampa jest włączona");
    }
    else{
        System.out.println("Lampa jest wyłączona");
    }
  }
}
 