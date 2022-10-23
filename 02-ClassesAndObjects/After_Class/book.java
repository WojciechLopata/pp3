
public class book{
    //WYKAZ ATRYBUTU 
    String nazwa;
    String autor;
    int rokWydania;
    int iloscStron;
    String jezyk;
    int strona = 1;
    boolean czyOtwarta;
   
    
    /*Dach do tyłu wciskam gaz abonent niedostepny nie chcesz sluchac moich klamst o tym co robie w weekend y
    kocham ją ją dlaczego budze się z inna kocham ją ją ją dlaczzego budzę się inną.
    5 w nocy po koncercie jak mam nie brać jej ze sobą ona mi pomoże usnąć jak nikgo nie ma obok, hotelowy pokój telefon w trybie samolot czas policzyć hajs chodź whisky moja żono
    */
    public void changeStatus(){
        czyOtwarta=!czyOtwarta;
        
    };
    public void jakaStrona(){
        System.out.println(strona);
    };
    public void nastepnaStrona(){
        strona++;        
    };
    public void poprzednaStrona(){
        strona--;
    };
    public void wyswietlInformacje(){
        System.out.println(nazwa+" "+autor+" "+rokWydania+" "+iloscStron+" "+jezyk+" "+strona);
        if (czyOtwarta){
            System.out.println("Otwarta");
        }
        else{
            System.out.println("Zamknięta");
        }
    }
}
 
        