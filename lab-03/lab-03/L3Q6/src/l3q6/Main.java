/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q6;

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
        double radius, x, y, distanceSquared;

        System.out.print("Enter the radius of the circle: ");
        radius = keyboard.nextDouble();
        System.out.print("Enter the point (x y): ");
        x = keyboard.nextDouble();
        y = keyboard.nextDouble();

        distanceSquared = x * x + y * y;

        if (distanceSquared <= radius * radius) {
            System.out.println("The point (" + x + ", " + y + ") is inside the circle");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is outside the circle");
        }
    }
    
}
