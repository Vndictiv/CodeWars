package codewars.done;

public class Money {

    public static int calculateYears(double principal, double interest,  double tax, double desired) {

        if (principal == desired){
            return 0;
        }
        else {
        int result = 0;

        do {
            principal += principal*interest - (principal*interest)*tax;

            result++;
        }while (principal <= desired);


        return result;}
    }
}
