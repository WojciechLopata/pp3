import java.util.ArrayList;

public class Cities {
  String[] miasta;

public Cities(String[] miasta) {
    this.miasta = miasta;
}
public Cities filter(char c){
    ArrayList<String> filtering= new ArrayList<String>();
    for (String i : miasta){
        if(i.substring(0,1).equals(String.valueOf(c))){
          
                filtering.add(i);
        }
    }
    return new Cities(filtering.toArray(new String[]{}));
}
    public String cities() {
        String output="";
        for (String i : miasta){
            output+=i;

        }
        return output;
    }
    public static void main(String[] args){
        String[] m_1={"Krakow","Sopot","Warszawa","Szczecin"};
        Cities a = new Cities(m_1);
        
        System.out.println(a.filter('S').cities());
    }
}

     

