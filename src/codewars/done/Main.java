package codewars.done;


public class Main {

    public int solution(int[] A) {
        for(int a : A){
            a *= a++;
            if(a > 0)
                return 1;
            if (a < 0)
                return -1;
            else
                return 0;
        }
        return 0;
    }


    public int solution2(int[] A) {
        int a = 1;

        for(int i =0;  i <= A.length;  i++){
           a *= A[i];  //*A[i+1];

        }
        if (a == 0)
            return 0;
        if (a < 0)
            return -1;
        else
            return 1;

    }


}
