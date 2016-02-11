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
public class CelsiusToFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Please enter the temprature in celsius");
          Scanner input = new Scanner(System.in);
          double celcius = input.nextDouble();
          double fahrenheit =(1.8*celcius)+32;
          String text ="The fahrenheit equvalent of temp in celcius is equal to "+fahrenheit;
          JOptionPane.showMessageDialog(null, text);
                  
    }
    
}
