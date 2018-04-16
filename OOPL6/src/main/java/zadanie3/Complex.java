/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie3;

import java.util.Scanner;

/**
 *
 * @author Dawid
 */
public class Complex {

    double R;
    double I;

  
    public static double sprzezenie(double I) {
        I = -I;
        return I;
    }
  public static double modul(double Re, double Im) {
        return Math.sqrt(Math.pow(Re, 2) + Math.pow(Im, 2));
    }
    public static double kat(double R, double I) {
        double cos = R / modul(R, I);
        double sin = I / modul(R, I);

        if (Math.toDegrees(Math.asin(sin)) > 0 && Math.toDegrees(Math.acos(cos)) > 0) {
            return Math.toDegrees(Math.asin(sin));
        } else if (Math.toDegrees(Math.asin(sin)) > 0 && Math.toDegrees(Math.acos(cos)) < 0) {
            return Math.toDegrees(Math.asin(sin) + (Math.PI / 2));
        } else if (Math.toDegrees(Math.asin(sin)) < 0 && Math.toDegrees(Math.acos(cos)) < 0) {
            return Math.toDegrees(Math.asin(sin) + (Math.PI * 3 / 2));
        } else {
            return Math.toDegrees(Math.asin(sin) + (Math.PI * 2));
        }
    }

    public static void naWykladnicza(double R, double I) {
        System.out.println("z1 w postaci wykladniczej: " + modul(R, I) + "*e^(" + kat(R, I) + "*i)");
       
    }

    public static void naAlgebraiczna(double modul, double kąt) {
         System.out.println("z1 w postaci algebraicznej: " + (modul * Math.cos(Math.toRadians(kąt))) + "+(" + (modul * Math.sin(Math.toRadians(kąt))) + ")i");
        
    }

    

    public static double algDodawanieUroj(double I1, double I2) {
        return I1 + I2;
    }

    public static void algDodawanieRzecz(double R1, double R2, double I1, double I2) {
        System.out.println("Algebraicznie dodawanie to " + (R1 + R2) + "+(" + (I1 + I2) + ")i");
      
    }

    public static void algOdejm(double R1, double I1, double R2, double I2) {
        System.out.println("Algebraicznie odejmowanie to " + (R1 - R2) + "+(" + (I1 - I2) + ")i");
        
    }

    public static void algMnoz(double R1, double I1, double R2, double I2) {
       System.out.println("Algebraicznie mnozenie to " + (R1 * R2 - I1 * I2) + "+(" + (R2 * I1 + R1 * I2) + ")i");
       
    }

  
public static double wykDodaw(double modul1, double kat1, double modul2, double kat2) {
        Math.toRadians(kat1);
        Math.toRadians(kat2);
        double x = modul1 * Math.cos(kat1) + modul2 * Math.cos(kat2);
        double y = modul1 * Math.sin(kat1) + modul2 * Math.sin(kat2);
        return kat(x, y);
    }
    public static String wykDziel(double mod1, double kat1, double mod2, double kat2) {
        double mod = mod1 / mod2;
        double kat = kat1 - kat2;
        String wynik = "Wykladniczo dzielenie to " + mod + "*e^(" + kat + "*i)";
        return wynik;
    }
  public static String algDziel(double R1, double I1, double R2, double I2) {
        String wynik = "Algebraicznie dzielenie to " + (R1 * R2 - I1 * I2) / (Math.pow(R2, 2) + Math.pow(I2, 2)) + "+(" + (R1 * (-I2) + I1 * R2) / (Math.pow(R2, 2) + Math.pow(I2, 2)) + ")i";
        return wynik;
    }
  

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Podaj Re1");
        double R = c.nextDouble();
        System.out.println("Podaj Im1");
        double I = c.nextDouble();
    }

}