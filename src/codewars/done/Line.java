package codewars.done;

public class Line {
    public static String Tickets(int[] peopleInLine)
    {
        int d25 = 0;
        int d50 = 0;
        for (int i = 0; i < peopleInLine.length; i++) {
            if (peopleInLine[i] == 25) d25++;
            if (peopleInLine[i] == 50) {
                d25--;
                d50++;
            }
            if (peopleInLine[i] == 100) {
                if (d50 > 0) {
                    d50--;
                    d25--;
                } else {
                    d25 -= 3;
                }
            }
            if (d25 < 0) return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Tickets(new int[] {25,25,50,50,100});
    }
}
