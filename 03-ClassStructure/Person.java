
public class Person {
    String name;
    double weight;
    double height;
    double BMI;
    public Person(String nameC){
        name=nameC;

    }
    public Person(String nameC,double weightC, double heightC){
        name=nameC;
        weight=weightC;
        height=heightC;

    }
    public void setWeightAndHeight(double weightC,double heightC ){
        weight=weightC;
        height=heightC;
    

    }
    public void calculateBMI(){
        double helper=height;
        helper=helper/100;
        BMI=weight/(helper*helper);
        
        

    }
    public void displayRecord(){
        String bmiAnswer="";
        if(BMI<18.5){
            bmiAnswer="bmi too low ";
        }
        if(BMI>24.9){
            bmiAnswer="bmi too high";
        }
        System.out.println(name+height+" "+weight+" "+BMI+" "+bmiAnswer);
        
    }



    public static void main (String[] args){
        Person a = new Person("Marek");
        Person b = new Person("Lukasz",85,175);
        b.calculateBMI();
        b.displayRecord();
    }

}
