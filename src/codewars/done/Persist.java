package codewars.done;

public class Persist {

    public static int persistence(long n) {
int result = 0;
String s = String.valueOf(n);

        while(n > 9){
            long multi = 1;
            for(char ch : s.toCharArray()){
                multi *= Long.parseLong(String.valueOf(ch));
                result++;
            }
            return result;

       }
       return result;

}
}
