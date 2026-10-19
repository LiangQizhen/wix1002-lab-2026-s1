/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of the car: ");
        double p = input.nextDouble();
        System.out.print("Enter the down payment: ");
        double d = input.nextDouble();
        System.out.print("Enter the rate in %: ");
        double r = input.nextDouble();
        System.out.print("Enter the loan duration in year: ");
        double y = input.nextDouble();

        double m = (p - d) * (1 + r * y / 100) / (y * 12);

        System.out.printf("The monthly payment is %.2f%n", m);
        input.close();
       
    }
}
