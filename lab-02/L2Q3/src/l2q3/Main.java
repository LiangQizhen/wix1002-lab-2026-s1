/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int MIN = 10;
        final int MAX = 50;

        Random g = new Random();
        int first = g.nextInt(MAX - MIN + 1) + MIN;
        int second = g.nextInt(MAX - MIN + 1) + MIN;
        int third = g.nextInt(MAX - MIN + 1) + MIN;

        int sum = first + second + third;
        double average = (double) sum / 3;

        System.out.println("The three numbers are " + first + ", " + second + " and " + third);
        System.out.println("The sum is " + sum);
        System.out.printf("The average is %.2f\n", average);
    }
}
