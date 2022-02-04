/**
 * Main.java
 * merupakan file utama dalam praktikum 1
 * @author [18220026] [Annel Rashka Perdana]
 */
import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        double baseSalary = sc.nextDouble();
        double currentPoints = sc.nextDouble();
        double targetPoints = sc.nextDouble();

        Employee FAANG = new Employee(name, baseSalary);
        EmployeePerformance FAANGper = new EmployeePerformance(FAANG, currentPoints, targetPoints);


        if (FAANGper.isPromotable()){
            System.out.println("YES");
            System.out.printf("%.2f\n", FAANGper.getCurrentSalary() );
        }
        else{
            System.out.println("NO");
            System.out.printf("%.2f\n", ((2*targetPoints)-currentPoints) );
        }
    }
}