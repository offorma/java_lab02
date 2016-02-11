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
public class Split {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Please enter five numbers");
          Scanner input = new Scanner(System.in);
          String numbers = input.nextLine();
          System.out.println(numbers.charAt(0)+"   "+numbers.charAt(1)+"   "+numbers.charAt(2)
                  +"   "+numbers.charAt(3)+"   "+numbers.charAt(4));
    }
    
}
