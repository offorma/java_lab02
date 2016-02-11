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
public class Days {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the number of days you would like me to convert");
        int num = input.nextInt();
        int weeks = num/7;
        int days = num%7;
        System.out.println(num+" days equals "+ weeks +" weeks and "+ days +" days");
    }
    
}
