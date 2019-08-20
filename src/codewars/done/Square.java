package codewars.done;

public class Square {

    public static boolean isSquare(int n) {
        if (n == 0){
            return true;
        }
        Double myNumber = Math.sqrt(n);

        int numberToString = myNumber.intValue();

        String myString = String.valueOf(numberToString);

        String secondChar = new String(myString.toString());

          int numberTwo = Integer.valueOf(secondChar);
            int equal = numberTwo * numberTwo;
        if (n == equal){
            return true;
        }
        else

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSquare(10000));
    }

}
