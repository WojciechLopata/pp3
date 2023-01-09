public class Logic {
    boolean[] logiczne;

    public Logic(boolean[] logiczne) {
        this.logiczne = logiczne;
    }
    
    public int opposite(){
        int suma=0;
        int dlugosc=logiczne.length;
        for (int i=1;i<dlugosc-1;i++){
            if((logiczne[i+1] == logiczne[i-1]) && logiczne[i+1] != logiczne[i]  ){
                suma++;
            }
        }


        return suma; 
    }
    public static void main(String[] args){
        boolean[] logiczne = {true,false,true};
        Logic a = new Logic(logiczne);
        System.out.println(a.opposite());

        boolean[] logiczne_1 = {true,false,false};
        Logic b = new Logic(logiczne_1);
        System.out.println(b.opposite());
        boolean[] logiczne_2 = {true,false,true,true,false,true,false,true,false};
        Logic c = new Logic(logiczne_2);
        System.out.println(c.opposite());
    
    }
}
