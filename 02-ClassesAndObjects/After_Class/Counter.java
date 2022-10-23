public class Counter{
    //WYKAZ ATRYBUTU 
  int counter = 0;
  public void increase(){
      
      counter=counter+10;
  };
  public void decrease(){
      counter=counter-10;
  }
  public void reset(){
      counter=0;
  };
  public void display(){
      System.out.println(counter);  
    };
                }
