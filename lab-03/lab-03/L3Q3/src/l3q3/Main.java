/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q3;

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
        double sales, commission;

        System.out.print("Enter the sales volume: ");
        sales = keyboard.nextDouble();

        if (sales <= 100) {
            commission = sales * 0.05;
        } else if (sales <= 500) {
            commission = sales * 0.075;
        } else if (sales <= 1000) {
            commission = sales * 0.10;
        } else {
            commission = sales * 0.125;
        }

        System.out.printf("The commission is %.2f\n", commission);// TODO code application logic here
    }
    
}
