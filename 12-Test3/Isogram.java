public class Isogram {
    public static boolean  isogram(String znaki){
        char [] chars=znaki.toCharArray();
        int wielksoc=chars.length;
        for (int i=0;i<wielksoc;i++){
            for(int c=i+1;c<wielksoc;c++){
                if(chars[i]==chars[c]){
                    return false;

                }
            }
        }

        return true;
    }
   public static void main(String[] args){
    System.out.println(isogram("red sun"));
    System.out.println(isogram("blue water"));
    System.out.println(isogram("BLUE water"));
    System.out.println(isogram("my blue water"));
   }
}
