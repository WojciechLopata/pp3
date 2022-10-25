
public class CinemaTicket
{
   String cinemaName="KINO XYZ";
   static String filmName;
   int mainRow;
   int mainSeat;
   float price;
   public void displayTicketData(){
       System.out.println(cinemaName+" Nazwa filmu "+filmName+" Rząd "+mainRow+" miejsce "+mainSeat+" cena  "+price+" PLN ");
       
   };
   public CinemaTicket(String movie,int seat,int row){
       cinemaName="Morning star cinema";
       filmName=movie;
       mainRow=row;
       mainSeat=seat;
       if(row>2){
           price=25;
       }
       else{
           price=10;
       }
       
   }
   
   

public static void main(String[] args){
        CinemaTicket a=new CinemaTicket("Gladiator",12,2);
        CinemaTicket b=new CinemaTicket("Gladiator",20,7);
        a.displayTicketData();
        b.displayTicketData();
    
}    
}