/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class zad3 extends java.lang.Exception {
    public static void dzielenie(){
        Scanner input = new Scanner(System.in);
        try {
           System.out.println("Wpisz liczby:");
           int dzielna = input.nextInt();
           int dzielnik = input.nextInt();
           double wynik = dzielna / dzielnik;
            System.out.println(wynik);
        } catch (ArithmeticException e) 
        {
            System.err.println("pamietaj cholero nie dziel przez 0 ");
        }
    }
    
    public static void main(String[] args) {
        dzielenie();
    }
}
