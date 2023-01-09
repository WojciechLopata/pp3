class Numbers {
int one;
int  two;
int three;
int four;
int five;
public Numbers(int one, int two, int three, int four, int five) {
    this.one = one;
    this.two = two;
    this.three = three;
    this.four = four;
    this.five = five;
}
public boolean different(){
    if(one!=two  && one!= three && one!= four && one!=five){
        if(two!=three && two!=four && two!=five){
            if(three!=four && three != five){
                if(four!=five){
                    return true;
                }
            }
        }
    }
    return false;
}
public static void main(String[] args){
    Numbers a = new Numbers(3,4,2,1,6);
    Numbers b =new Numbers(9,7,4,3,7);
    System.out.println(a.different());
    System.out.println(b.different());

}



}