/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonso_lab02;

/**
 *
 * @author 1514414
 */
public class Nonso_lab02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a =107 , b = 5;
        int sum = a+b;
        int diff = a-b;
        int quotient = a/b;
        int rem = a%b;
       System.out.println("The sum of a and b =" + sum);
        System.out.println("The difference of a and b =" + diff);
         System.out.println("The quotient of a and b =" + quotient);
          System.out.println("The remainder of a and b =" + rem);
          int trial = 100/0;
           System.out.println(trial);
    }
    
}
