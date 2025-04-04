package praktic.inheritance.transportation;

public class Train extends Vehicle { // Mendeklarasikan kelas Train yang merupakan turunan dari Vehicle
    public static final int FIXED_FARE = 10000; // Konstanta tarif tetap per penumpang

    public Train(String name, int capacity, String route) { // Konstruktor kelas Train
        super(name, capacity, route); // Memanggil konstruktor kelas induk (Vehicle)
    }

    public void calculateFare() { // Metode untuk menghitung tarif perjalanan kereta
        int totalFare = currentPassengers * FIXED_FARE; // Menghitung total tarif perjalanan
        System.out.println("Total penumpang: " + currentPassengers); // Menampilkan jumlah penumpang
        System.out.println("Tarif tetap per penumpang: Rp " + FIXED_FARE); // Menampilkan tarif tetap per penumpang
        System.out.println("Total tarif perjalanan kereta: Rp " + totalFare); // Menampilkan total tarif perjalanan kereta
    }
}