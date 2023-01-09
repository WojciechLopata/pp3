public class Car extends Vehicle {
    int maxspeed;

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public Car(int s, int maxspeed) {
        super(s);
        this.maxspeed = maxspeed;
    }
    public int[] spec(){
        int[] a = {this.getMaxspeed(),this.getSeats()};
        return a;
    }

    public int getMaxspeed() {
        return maxspeed;
    }
    
    public static void main(String[] args){
        Car a= new Car(4, 130);
        int[] b=a.spec();
        
        System.out.println(java.util.Arrays.toString(b));
        System.out.println(Arrays.toString(b));
        int theArray[] = {1, 2, 3};
        System.out.println(java.util.Arrays.toString(theArray));


    }
}
