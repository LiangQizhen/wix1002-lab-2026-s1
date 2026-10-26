/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q2;

/**
 *
 * @author jem
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /Random g = new Random();
        int number = g.nextInt(6);
        String word = "";

        switch (number) {
            case 0:
                word = "zero";
                break;
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
        }

        System.out.println(number + " is " + word + ".");/ TODO code application logic here
    }
    
}
