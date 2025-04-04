package praktic.inheritance.transportation; 

public class Bus extends Vehicle { // Mendeklarasikan kelas Bus yang merupakan turunan dari Vehicle
    public static final int FARE_PER_STOP = 2000; // Konstanta tarif per halte

    public Bus(String name, int capacity, String route) { // Konstruktor kelas Bus
        super(name, capacity, route); // Memanggil konstruktor kelas induk (Vehicle)
    }

    public void calculateFare(int stops) { // Metode untuk menghitung tarif perjalanan berdasarkan jumlah pemberhentian
        int totalFare = currentPassengers * stops * FARE_PER_STOP; // Menghitung total tarif perjalanan
        System.out.println("Total penumpang: " + currentPassengers); // Menampilkan jumlah penumpang
        System.out.println("Total pemberhentian: " + stops); // Menampilkan jumlah pemberhentian
        System.out.println("Tarif per halte: Rp " + FARE_PER_STOP); // Menampilkan tarif per halte
        System.out.println("Total tarif perjalanan bus: Rp " + totalFare); // Menampilkan total tarif perjalanan bus
    }
}
