/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonso_lab02;

import javax.swing.JOptionPane;

/**
 *
 * @author 1514414
 */
public class Value {

    public static void main(String[] args) {
        int value;
        value = JOptionPane.showConfirmDialog(null, "please press Yes, No or Cancle");
        System.out.println("The value returned by pressing the confirm button dialog was: "+value);
    
    
  
 int x1, x2, x3, x4 ;
 int y = 31, z = 28 ;
 x1 = y + z / 7 ;
 x2 = (y + z) / 7 ;
 x3 = y + z % 7 ;
 x4 = (y + z) % 7 ;
 System.out.println("x1 = " + x1 + "\n x2 = " + x2) ;
 System.out.println("x3 = " + x3 + "\n x4 = " + x4) ;
 

    }

}
