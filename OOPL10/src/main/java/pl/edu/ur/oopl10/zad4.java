/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;
import java.util.Random;
/**
 *
 * @author Luki
 */
public class zad4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int counter  = 0;
        while(counter != 3) {
            int randomNum1 = -10 + rand.nextInt((10 - -10) + 1);
            int randomNum2 = -10 + rand.nextInt((10 - -10) + 1);
            if(randomNum2 == 0) {
                counter++;
                System.out.println("nie dziele przez zero: " + counter);
            } 
            else {
              double divide = randomNum1/randomNum2; 
              System.out.println("Wynik dzielenia: " + divide);
            }
        }
    }
}