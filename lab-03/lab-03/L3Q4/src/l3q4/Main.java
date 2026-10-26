/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q4;

/**
 *
 * @author jem
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random g = new Random();

        int p1Roll1 = g.nextInt(6) + 1;
        int p1Roll2 = g.nextInt(6) + 1;
        int p2Roll1 = g.nextInt(6) + 1;
        int p2Roll2 = g.nextInt(6) + 1;

        int p1Score = p1Roll1 + p1Roll2;
        int p2Score = p2Roll1 + p2Roll2;

        System.out.println("Player 1 rolled " + p1Roll1 + " and " + p1Roll2
                + ", score = " + p1Score);
        System.out.println("Player 2 rolled " + p2Roll1 + " and " + p2Roll2
                + ", score = " + p2Score);

        if (p1Score > p2Score) {
            System.out.println("Player 1 wins the game");
        } else if (p2Score > p1Score) {
            System.out.println("Player 2 wins the game");
        } else {
            System.out.println("It is a tie");
        }// TODO code application logic here
    }
    
}
