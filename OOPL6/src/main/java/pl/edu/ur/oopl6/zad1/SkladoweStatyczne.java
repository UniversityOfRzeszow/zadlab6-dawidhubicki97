package pl.edu.ur.oopl6.zad1;

public class SkladoweStatyczne {

    public static void main(String[] args) {
        // TODO zad 3
        
        System.out.printf("Pole kola: %.3f ",Figury.PoleKola(0.5));
        System.out.printf("Obwod kola: %.3f ",Figury.ObwodKola(0.5));
        System.out.printf("Pole kwadratu: %.3f ",Figury.PoleKwadratu(5));
        System.out.printf("Pole prostokata: %.3f ",Figury.PoleProstokata(5, 3));
       System.out.printf("Pole Stozka: %.3f ",Figury.PoleStozka(5, 10));
       System.out.printf("Pole Walca %.3f ",Figury.PoleWalca(10, 20));
         System.out.printf("Pole Walca %.3f ",Figury.ObjetoscWalca(10, 20));
         System.out.printf("Pole Walca %.3f ",Figury.ObjetoscStozka(10, 20));
    }
    
}
