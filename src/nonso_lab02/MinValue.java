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
public class MinValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        //if we add one to the max value of the integer class
        //it wraps around and give the min value as the result.
        System.out.println(Integer.MAX_VALUE+1);
        System.out.println(Integer.MIN_VALUE-1);
        
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
    }
    
}
