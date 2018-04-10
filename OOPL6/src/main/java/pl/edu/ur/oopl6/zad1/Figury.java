package pl.edu.ur.oopl6.zad1;

public class Figury {
    
    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Biblioteka obliczająca wielkość figur geometrycznych!!!");
    }
    
    /**
     * Metoda statyczna obliczająca pole koła
     */
   public static double PoleKola(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double PoleKwadratu(double a) {

        return Math.pow(a, 2);
    }

    public static double PoleProstokata(double a, double b) {

        return a * b;
    }

    public static double PoleStozka(double r, double l) {
        return Math.PI * Math.pow(r, 2) + Math.PI * r * l;
    }

    public static double PoleWalca(double r, double h) {
        return 2 * Math.PI * Math.pow(r, 2) + 2 * Math.PI * r * h;
    }

    public static double ObwodKola(double r) {
        return 2 * Math.PI * r;
    }
    public static double ObjetoscWalca(double r,double h) {
        return Math.PI*Math.pow(r,2)*h;
    }
    
   public static double ObjetoscStozka(double r,double h) {
        return   (Math.pow(r, 2) * Math.PI) * h * (1.0/3.0);
    }
}

