

public class Family 
{
    public Person[] members;
    public Family(Person[] members){
        this.members=members;

    }
    public int adults(){
        int sum=0;
        for(Person person :members){
            if(person.getAge()>=18){
                sum++;
            }
        }
        return sum;
    }
    public static void main(String[] args){
       Person[] members={new Person("Marekl", 27),new Person("Pierdoła", 19)};
       Family a = new Family(members);
       System.out.print(a.adults());


    }



}
