/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonso_lab02;

import java.util.Scanner;

/**
 *
 * @author 1514414
 */
public class AreaOfACircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter the raduis of the circle");
          Scanner input = new Scanner(System.in);
          double R = input.nextDouble();
          double A = Math.PI*R*R;
          System.out.println("The circle of Radius "+R+" has area "+A);
    }
    
}
