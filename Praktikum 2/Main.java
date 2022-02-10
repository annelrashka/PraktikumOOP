/**
 * Main.java
 * file main dalam praktikum 2
 * @author 18220026 Annel Rashka Perdana
 */
import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenisMobil = sc.nextInt();

        if (jenisMobil == 1){
            int maxCap = sc.nextInt();
            int totalMil = sc.nextInt();

            Bus busAlice = new Bus(maxCap);

            System.out.println(busAlice.toString());
            System.out.println(busAlice.getPrice());
            busAlice.increaseMileage(totalMil);
            System.out.println(busAlice.toString());
            System.out.println(busAlice.getPrice());
        }
        else if(jenisMobil==2){
            int NoW = sc.nextInt();
            boolean trucLoad = sc.nextBoolean();
            int totalMil = sc.nextInt();

            Truck truckAlice = new Truck(NoW, trucLoad);

            System.out.println(truckAlice.toString());
            System.out.println(truckAlice.getPrice());
            truckAlice.increaseMileage(totalMil);
            System.out.println(truckAlice.toString());
            System.out.println(truckAlice.getPrice());
        }
        else if(jenisMobil == 3){
            int vanBasePrice = sc.nextInt();
            int totalMil = sc.nextInt();

            Van vanAlice = new Van(vanBasePrice);

            System.out.println(vanAlice.toString());
            System.out.println(vanAlice.getPrice());
            vanAlice.increaseMileage(totalMil);
            System.out.println(vanAlice.toString());
            System.out.println(vanAlice.getPrice());
        }

    }
}