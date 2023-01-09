public class Arrays {
 public static boolean arr(int a[],int b[]){
    int c= a.length;
    int suma1=0;
    for (int i=0; c>i;i++){
        if(a[i]/10>=1 && a[i]/10<=9  ){
            suma1++;
        }
    }
    int suma2=0;
    int d=b.length;
    for (int i=0; d>i;i++){
        if(b[i]/10>=1 && b[i]/10<=9 ){
            suma2++;
        }
    }
    if(suma1==suma2){
        return true;


    }
    return false;
 }   
 public static void main(String[] args){
    int array1[]={15,8,2,37,49,117};
    int array2[]={9,6,7,12,48,4,6,90,5};
    System.out.println(arr(array1,array2));

 }
}
