/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5q5;

/**
 *
 * @author jem
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double a, b, c, d, e, f, denominator, x, y;

        System.out.print("Enter a, b, c, d, e, f: ");
        a = keyboard.nextDouble();
        b = keyboard.nextDouble();
        c = keyboard.nextDouble();
        d = keyboard.nextDouble();
        e = keyboard.nextDouble();
        f = keyboard.nextDouble();

        denominator = a * d - b * c;

        if (denominator == 0) {
            System.out.println("The equation has no solution");
        } else {
            x = (e * d - b * f) / denominator;
            y = (a * f - e * c) / denominator;
            System.out.printf("x is %.2f and y is %.2f\n", x, y);
        }
    }
    
}
