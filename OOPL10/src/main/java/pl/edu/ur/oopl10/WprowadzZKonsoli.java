package pl.edu.ur.oopl10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class WprowadzZKonsoli {
    static public void wprowadzInt() {
        Scanner input = new Scanner(System.in); 
         try {
            System.out.println("Podaj int");
            int zad5 = input.nextInt();
            FileReader fr = new FileReader("zad5.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            FileWriter fwo = new FileWriter("zad5.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(zad5);
            bwo.newLine();
            bwo.close();
        } catch (FileNotFoundException z) {
            System.out.print("Wyjątek  braku pliku ");
            System.out.println(z.getMessage());
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void wprowadzChar() {
        Scanner input = new Scanner(System.in); 
         try {
             System.out.println("Podaj char");
           char zad5 = input.next().charAt(0);
            FileReader fr = new FileReader("zad5.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            FileWriter fwo = new FileWriter("zad5.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(zad5);
            bwo.newLine();
            bwo.close();
        } catch (FileNotFoundException z) {
            System.out.print("Wyjątek  braku pliku ");
            System.out.println(z.getMessage());
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void wprowadzString() {
        Scanner input = new Scanner(System.in); 
         try {
             System.out.println("Podaj string");
           String zad5 = input.nextLine();
            FileReader fr = new FileReader("zad5.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            FileWriter fwo = new FileWriter("zad5.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(zad5);
            bwo.newLine();
            bwo.close();
        } catch (FileNotFoundException z) {
            System.out.print("Wyjątek  braku pliku ");
            System.out.println(z.getMessage());
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void wprowadzLong() {
        Scanner input = new Scanner(System.in); 
         try {
             System.out.println("Podaj long");
           long zad5 = input.nextLong();
            FileReader fr = new FileReader("zad5.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            FileWriter fwo = new FileWriter("zad5.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write((int) zad5);
            bwo.newLine();
            bwo.close();
        } catch (FileNotFoundException z) {
            System.out.print("Wyjątek  braku pliku ");
            System.out.println(z.getMessage());
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void wprowadzShort() {
        Scanner input = new Scanner(System.in); 
         try {
             System.out.println("Podaj short");
           short zad5 = input.nextShort();
            FileReader fr = new FileReader("zad5.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            FileWriter fwo = new FileWriter("zad5.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(zad5);
            bwo.newLine();
            bwo.close();
        } catch (FileNotFoundException z) {
            System.out.print("Wyjątek  braku pliku ");
            System.out.println(z.getMessage());
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void wprowadzFloat() {
        Scanner input = new Scanner(System.in); 
         try {
             System.out.println("Podaj float");
          float zad5 = input.nextFloat();
            FileReader fr = new FileReader("zad5.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            FileWriter fwo = new FileWriter("zad5.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write((int) zad5);
            bwo.newLine();
            bwo.close();
        } catch (FileNotFoundException z) {
            System.out.print("Wyjątek  braku pliku ");
            System.out.println(z.getMessage());
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void wprowadzDouble() {
        Scanner input = new Scanner(System.in); 
         try {
             System.out.println("Podaj double");
          double zad5 = input.nextDouble();
            FileReader fr = new FileReader("zad5.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            FileWriter fwo = new FileWriter("zad5.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write((int) zad5);
            bwo.newLine();
            bwo.close();
        } catch (FileNotFoundException z) {
            System.out.print("Wyjątek  braku pliku ");
            System.out.println(z.getMessage());
        } catch (Exception w) {
            System.out.print("Wyjątek: ");
            System.out.println(w.getMessage());
        }
    }
}