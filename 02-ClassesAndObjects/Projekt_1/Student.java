public class Student{
    //WYKAZ ATRYBUTU 
    String name;
    int wiek;
    String id;
    boolean isValid;
    int semester;
    double averageGrade;
    /*Dach do tyłu wciskam gaz abonent niedostepny nie chcesz sluchac moich klamst o tym co robie w weekend y
    kocham ją ją dlaczego budze się z inna kocham ją ją ją dlaczzego budzę się inną.
    5 w nocy po koncercie jak mam nie brać jej ze sobą ona mi pomoże usnąć jak nikgo nie ma obok, hotelowy pokój telefon w trybie samolot czas policzyć hajs chodź whisky moja żono
    */
    public void SayHello(){
        System.out.println("hello");
        
    };
    public void displayName(){
        System.out.println("my name is "+name);
    };
    public void displayAge(){
        System.out.println("my age is "+wiek);
        
    };
    public  void displayStudent(){
        System.out.println(id+" "+semester+" "+averageGrade);
        
    };
    public void idStatusChange(){
        isValid=!isValid;
        
    };
    public void displayId(){
        System.out.print(name+" "+id+" "+isValid);
        
    };
    //WYKAZ METOD
    public static void main(String[] args){
    Student s1= new Student();
    s1.name="Janek";
    s1.wiek=21;
    s1.id="3213321";
    s1.semester=3;
    s1.isValid=true;
    s1.averageGrade=3.0;
    s1.displayName();
    s1.displayAge();
    s1.displayStudent();
    s1.displayId();
    s1.idStatusChange();
    
};
};

