import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("|Witaj w algorytmie windy \n|Winda znajduje się w bloku 9 piętrowym \n|Podaj piętro, z którego chcesz wsiąść oraz piętro docelowe");
        System.out.println("|Wprowadź dane: ");
        System.out.print("|Wsiadam z: ");
        int from1 = sc.nextInt();
        System.out.print("|Wysiadam na: ");
        int to1 = sc.nextInt();

        // Tworzymy tablice dla losowych pięter, zaczynając od `from1` i `to1`
        Integer[] floorFrom = new Integer[4];
        Integer[] floorTo = new Integer[4];

        // Pierwsze piętro to te podane przez użytkownika
        floorFrom[0] = from1;
        floorTo[0] = to1;

        // Generowanie losowych pięter
        for (int i = 1; i < 4; i++) {
            floorFrom[i] = rand.nextInt(10); // Losowe piętra od 0 do 9
            floorTo[i] = rand.nextInt(10);
        }

        // Sortowanie w kolejności malejącej
        Arrays.sort(floorFrom, Collections.reverseOrder());

        System.out.println("Kolejność obsługi pięter (od najwyższego do najniższego):");
        for (int i = 0; i < floorFrom.length; i++) {
            System.out.print(floorFrom[i]);
            if (i < floorFrom.length - 1) {
                System.out.print(" > ");
            }
        }

        sc.close();
    }
}