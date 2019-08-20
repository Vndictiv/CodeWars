package codewars.done;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Vasya - Clerk zadanie na kata
public class Line2 {
    public static String Tickets2(int[] peopleInLine) {

//     int suma = 0;
//
//     for(int i = 0; i < (peopleInLine.length-1); i++){
//         suma += peopleInLine[i];
//     }

        List<Integer> lista = new ArrayList<>();
     for (int i = 0; i < peopleInLine.length; i++){
         lista.add(peopleInLine[i]);
     }

        Collections.sort(lista);

     if (peopleInLine[(peopleInLine.length)-1] == 100 && lista.contains(25)==true && lista.contains(50) == true){
         return "YES";
     }

     if (peopleInLine[(peopleInLine.length)-1] == 50 && lista.contains(25) ==true ) {
         return "YES";
     }

     if (peopleInLine.length>2){

           if (peopleInLine[(peopleInLine.length)-1] == 100 && lista.get(2) == 25) {
                return "YES";
            }
     }
     if (peopleInLine[(peopleInLine.length)-1] == 25 /*&& lista.get(0) == 25*/){
            return "YES";
        }
     if (peopleInLine.length == 1 && lista.contains(25)){
         return "YES";
     }

return "NO";

     // W przypadku gdy w kolejce będą osoby co wcześniej dały banknot na który trzeba dać resztę wtedy ify z ostatnią pozycją nie działają

    }
    public static void main(String[] args) {
        Tickets2(new int[] {25,25,50,50,100});
    }
}
