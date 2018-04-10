package pl.edu.ur.oopl6.zad2;

public class Punkt {

    private int x;
    private int y;
    private int z;

    // Pole statyczne przechowujące w pamięci ilość obiektów klasy Punkt
    // Pole jest współdzielone dla wszystkich obiektów
   
    private static int counter;// Pole counter jest dzielone dla każdego obiektu. Jest ono inkrementowane w kontruktorze czyli w tym przypadku liczy ile zostało stworzonych obiektów.
    public static Punkt last_point; //Pole punkt przechowuje obiekt klasy Punkt. W tym wypadku jest to ostatni stworzony obiekt klasy Punkt.

    public Punkt(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        counter++;    
        last_point = this;
    }

    public static void PokazOstatniObiekt() {     //Ta metode wypisuje wspolrzedne ostatniego stworzonego punktu czyli wszystkie pola ostatniego obiektu klasy Punkt. 
        System.out.println("Klasa Punkt o współrzędnych (x = " + last_point.x
                + " y = " + last_point.y + ""
                + " z = " + last_point.z + "). Istnieje już"
                + " " + last_point.counter + " obiekt tej klasy.");
    }
    
    @Override
    public String toString(){  //Ta metoda zwraca wspolrzedne ostatniego stworzonego punktu czyli wszystkie pola ostatniego obiektu klasy Punkt
        String s = "Klasa Punkt o współrzędnych (x = " + last_point.x
                + " y = " + last_point.y + ""
                + " z = " + last_point.z + "). Istnieje już"
                + " " + last_point.counter + " obiekt tej klasy.";
        return s;
    }

}
