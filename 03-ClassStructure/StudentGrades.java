import java.util.Random;
import java.util.Scanner;

public class StudentGrades {

    String studentName;
    double[] grades;

    StudentGrades(String name, int number) {
        this.studentName = name;
        this.grades=new double[number];
        for (int i=0; i<number;i++){
            Random rand=new Random();
            int a=rand.nextInt(4)+2;
            System.out.println(a);
            this.grades[i]=a;
            
        }
    }
    public void calculatelowest() {
        int size = grades.length;
        double smallest=grades[0];
        for (int i = 1; i<size;i++){
            if(grades[i]< smallest){
                smallest=grades[i];
            }

        

        }
        System.out.println(smallest);
    }
    public void calculateHighest(){
        int size=grades.length;
        double highest=grades[0];
        for ( int i=1;i<size;i++){
            if(highest<grades[i]){
                highest=grades[i];
            }

        }
        System.out.println(highest);
    }
    public void numberOfGrades(){
        System.out.println(grades.length);
    }
    public void average(){
        int size=grades.length;
        double sum=0;
        for (int i=0;i<size;i++){
            sum=sum+grades[i];
        }
        double average=sum/size;
        System.out.println(average);
    }
    public static void main(String[] args){
        StudentGrades amanda= new StudentGrades("Amanda",7);
        
        Scanner scan = new Scanner(System.in);
        int[] array= new int[4];
        int liczba;
        int i=0;
        String scaner="Y";
        while(4>i){
            System.out.println("podaj liczbe");
            liczba= scan.nextInt();
            array[i]=liczba;
            i++;
        }
        while(i>0){
            System.out.println(array[4-i]);
            i--;
        }
        
        
        
        amanda.numberOfGrades();
        amanda.average();
        amanda.calculateHighest();
        amanda.calculatelowest();
        
       

    }
}
