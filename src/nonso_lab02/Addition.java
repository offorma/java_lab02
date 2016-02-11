/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonso_lab02;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 1514414
 */
public class Addition {
    public static void main(String[] args){
        
        String text = JOptionPane.showInputDialog(null, "Please enter the first number");
        int num1 = Integer.parseInt(text);
        String text2 = JOptionPane.showInputDialog(null, "Please enter the second number");
        int num2 = Integer.parseInt(text2);
        int sum = num1 +num2;
        JOptionPane.showMessageDialog(null, sum);
        
        //using scanner oblect
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the first number");
        int num3 = input.nextInt();
        System.out.println("Please Enter the second number");
        int num4 = input.nextInt();
        int sum2 = num3 + num4;
        System.out.println(sum2);
    }
}
