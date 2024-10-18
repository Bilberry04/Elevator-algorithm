import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|Witaj w algorytmie windy \n|Winda znajduje się w bloku 9 piętrowym \n|Podaj 4 piętra, które w jednym momencie mają zostać obsłużone przez windę");
        System.out.println("|Wprowadź dane: ");
        System.out.print("|Piętro a: ");
        int a = sc.nextInt();
        System.out.print("|Piętro b: ");
        int b = sc.nextInt();
        System.out.print("|Piętro c: ");
        int c = sc.nextInt();
        System.out.print("|Piętro d: ");
        int d = sc.nextInt();

        Integer[] floor = {a, b, c, d};
        Arrays.sort(floor, Collections.reverseOrder());

        System.out.println("Kolejność obsługi pięter (od najwyższego do najniższego):");
        for (int i = 0; i < floor.length; i++) {
            System.out.print(floor[i]);
            if(i < floor.length - 1) {
                System.out.print(">");
            }
        }

        sc.close();
    }
}