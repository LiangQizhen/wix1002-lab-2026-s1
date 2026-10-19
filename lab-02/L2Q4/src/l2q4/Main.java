/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int totalSeconds, hours, minutes, seconds;

        System.out.print("Enter the number of seconds: ");
        totalSeconds = keyboard.nextInt();

        hours = totalSeconds / 3600;
        minutes = totalSeconds % 3600 / 60;
        seconds = totalSeconds % 60;

        System.out.println(totalSeconds + " seconds is " + hours + " hours, "
                + minutes + " minutes and " + seconds + " seconds");
    }
}
