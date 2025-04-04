package praktic.inheritance.transportation;

public class Taxi extends Vehicle { // Mendeklarasikan kelas Taxi yang merupakan turunan dari Vehicle
    public static final int FARE_PER_KM = 5000; // Konstanta tarif per kilometer

    public Taxi(String name, int capacity, String route) { // Konstruktor kelas Taxi
        super(name, capacity, route); // Memanggil konstruktor kelas induk (Vehicle)
    }

    public void calculateFare(int distance) { // Metode untuk menghitung tarif perjalanan berdasarkan jarak tempuh
        int totalFare = distance * FARE_PER_KM; // Menghitung total tarif perjalanan
        System.out.println("Total penumpang: " + currentPassengers); // Menampilkan jumlah penumpang
        System.out.println("Total jarak perjalanan: " + distance + " km"); // Menampilkan jarak perjalanan
        System.out.println("Tarif per km: Rp " + FARE_PER_KM); // Menampilkan tarif per km
        System.out.println("Total tarif perjalanan taksi: Rp " + totalFare); // Menampilkan total tarif perjalanan taksi
    }
}