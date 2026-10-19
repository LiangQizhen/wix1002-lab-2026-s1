/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double gram, initialF, finalF, kg, initialC, finalC, q;

        System.out.print("Enter the amount of water in gram: ");
        gram = keyboard.nextDouble();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        initialF = keyboard.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        finalF = keyboard.nextDouble();

        kg = gram / 1000;
        initialC = (initialF - 32) / 1.8;
        finalC = (finalF - 32) / 1.8;
        q = kg * (finalC - initialC) * 4184;

        System.out.printf("The energy needed is %e\n", q);
    }
}
