package codewars.actual;

//In a small town the population is p0 = 1000 at the beginning of a year.
// The population regularly increases by 2 percent per year and moreover
// 50 new inhabitants per year come to live in the town. How many years does the town need to see its population greater
// or equal to p = 1200 inhabitants?

public class Agre {
    public static int nbYear(int p0, double percent, int aug, int p) {

        int result = 0;

        while (p0 < p) {
            p0 += p0 * percent / 100 + aug;
            result++;
        }

        return result;
    }

    public static void main(String[] args) {
       // System.out.println(nbYear(1000,0.02,50,1200));
        System.out.println(nbYear(1000, 2, 50, 1200));
    }
}
