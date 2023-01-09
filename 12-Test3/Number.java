import java.lang.Math;


public class Number {
    int system;
    String value;
    public int getSystem() {
        return system;
    }
    public void setSystem(int system) {
        this.system = system;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public Number(int system, String value) {
        this.system = system;
        this.value = value;
    }
    public int get10(){
        int suma=0;
        
        double wielkosc=value.length();
        for (int i=0; i<wielkosc;i++){
            char znak=value.charAt(i);

            int wartosc=Character.getNumericValue(znak);
           // System.out.println(wartosc);
            if(wartosc>=system){
                return -1;

            }
            else{
                
                suma=(int) (suma+(wartosc*(Math.pow(system,wielkosc-i-1))));
            }


        }
        

        return suma;
    }
    public static void main(String[] args){

        Number a= new Number(5, "101");
        System.out.println(a.get10());
        Number b= new Number(8, "1018");
        System.out.println(b.get10());
    }

}
