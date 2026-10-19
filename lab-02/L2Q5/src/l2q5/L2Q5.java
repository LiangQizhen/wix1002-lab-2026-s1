/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int MAX = 10000;

        Random g = new Random();
        int number = g.nextInt(MAX + 1);

        int sum = number % 10 + number / 10 % 10 + number / 100 % 10
                + number / 1000 % 10 + number / 10000 % 10;

        System.out.println("The number is " + number);
        System.out.println("The sum of all the digits is " + sum);
    }
}

