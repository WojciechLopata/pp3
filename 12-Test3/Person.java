public class Person{
    String  name;
    String surname;
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String display(){
        String initials;
        String nameInitial=name.substring(0,1).toUpperCase();
        String surnameInitial=surname.substring(0,1).toUpperCase();
        initials=nameInitial+surnameInitial;
        return initials;


    }
    public static void main(String[] args){
        Person a = new Person("Anna", "May");
        System.out.print(a.display());

    }

}