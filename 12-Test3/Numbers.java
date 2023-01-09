public class Numbers {
    int[] numery;

    public Numbers(int[] numery) {
        this.numery = numery;
    }
    public boolean ok(){
        int wielkosc=numery.length;
        for (int i=0;i<wielkosc;i++){
            if(i%2!=(numery[i]%2)){
                return false;
            }

        }

        return true;

    }
    public static void main(String[] args){
        int[] n1={6,7,6,1,4};
        int[] n2={2,6,2,1,4};
        Numbers a =new Numbers(n1);
        Numbers b =new Numbers(n2);
        System.out.println(a.ok());
        System.out.println(b.ok());
    }
        
}
