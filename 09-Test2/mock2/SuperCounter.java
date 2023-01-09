public class SuperCounter extends Counter {

    public SuperCounter(int c) {
        super(c);
    }
    public void addN(int n){
       for (int i=0;n>i;i++){
        add1();
       }
    }

    public static void main(String[] args){
        SuperCounter a= new SuperCounter(4);
        System.out.println(a.getCounter());
        a.addN(10);
        System.out.println(a.getCounter());

    }
}
