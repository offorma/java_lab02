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
public class Seconds {
      public static void main(String[] args) {
          System.out.println("Please enter the number of hours");
          Scanner input = new Scanner(System.in);
          int hour = input.nextInt();
          System.out.println("Please enter the number of minutes");
          int minutes = input.nextInt();
          System.out.println("Please enter the number of seconds");
          int seconds = input.nextInt();
          int secondsForHour = hour*60*60;
          int secondsForMinutes = minutes*60;
          int totalSeconds = secondsForHour + secondsForMinutes + seconds;
          System.out.println(hour+"hr, "+minutes+"min and "+seconds
                  +"sec equals "+totalSeconds+" seconds" );
      }
}
