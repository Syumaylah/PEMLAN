package praktic.inheritance.mains; 

import praktic.inheritance.transportation.Bus; // Mengimpor kelas Bus dari package transportation
import praktic.inheritance.transportation.Train; // Mengimpor kelas Train dari package transportation
import praktic.inheritance.transportation.Taxi; // Mengimpor kelas Taxi dari package transportation

public class Main { // Mendeklarasikan kelas Main sebagai titik masuk program
    public static void main(String[] args) { // Metode utama yang akan dijalankan saat program dimulai
        
        // Simulasi Bus
        Bus bus = new Bus("Bus TransJakarta", 50, "Terminal A - Terminal B"); // Membuat objek Bus dengan nama, kapasitas, dan rute tertentu
        bus.startJourney(); // Memulai perjalanan bus
        bus.boardPassengers(30); // Menambahkan 30 penumpang ke dalam bus
        bus.boardPassengers(20); // Menambahkan 20 penumpang ke dalam bus
        bus.calculateFare(5); // Menghitung tarif perjalanan berdasarkan 5 pemberhentian
        bus.stopJourney(); // Menghentikan perjalanan bus
        bus.dropPassengers(50); // Menurunkan 50 penumpang dari bus
        System.out.println("\n--------------------------------------------\n"); // Mencetak garis pemisah

        // Simulasi Kereta
        Train train = new Train("Kereta Commuter Line", 200, "Stasiun Kota - Stasiun Pusat"); // Membuat objek Train
        train.startJourney(); // Memulai perjalanan kereta
        train.boardPassengers(150); // Menambahkan 150 penumpang ke dalam kereta
        train.calculateFare(); // Menghitung tarif perjalanan kereta
        train.stopJourney(); // Menghentikan perjalanan kereta
        train.dropPassengers(150); // Menurunkan 150 penumpang dari kereta
        System.out.println("\n--------------------------------------------\n"); // Mencetak garis pemisah

        // Simulasi Taksi
        Taxi taxi = new Taxi("Taksi BlueBird", 4, "Bandara - Hotel"); // Membuat objek Taxi
        taxi.startJourney(); // Memulai perjalanan taksi
        taxi.boardPassengers(3); // Menambahkan 3 penumpang ke dalam taksi
        taxi.calculateFare(10); // Menghitung tarif perjalanan berdasarkan 10 km
        taxi.stopJourney(); // Menghentikan perjalanan taksi
        taxi.dropPassengers(3); // Menurunkan 3 penumpang dari taksi
        System.out.println("\n--------------------------------------------\n"); // Mencetak garis pemisah

        // Simulasi dengan kapasitas penuh untuk Bus
        Bus bus2 = new Bus("Bus TransJakarta", 50, "Terminal A - Terminal B"); // Membuat objek Bus baru
        bus2.startJourney(); // Memulai perjalanan bus
        bus2.boardPassengers(30); // Menambahkan 30 penumpang
        bus2.boardPassengers(100); // Mencoba menambahkan 100 penumpang (melebihi kapasitas)
        bus2.calculateFare(5); // Menghitung tarif berdasarkan 5 pemberhentian
        bus2.stopJourney(); // Menghentikan perjalanan bus
        bus2.dropPassengers(30); // Menurunkan 30 penumpang
        bus2.dropPassengers(50); // Menurunkan 50 penumpang (melebihi yang tersisa)
        System.out.println("\n--------------------------------------------\n"); // Mencetak garis pemisah

        // Simulasi dengan kapasitas penuh untuk Train
        Train train2 = new Train("Kereta Commuter Line", 200, "Stasiun Kota - Stasiun Pusat"); // Membuat objek Train baru
        train2.startJourney(); // Memulai perjalanan kereta
        train2.boardPassengers(150); // Menambahkan 150 penumpang
        train2.boardPassengers(300); // Mencoba menambahkan 300 penumpang (melebihi kapasitas)
        train2.calculateFare(); // Menghitung tarif perjalanan
        train2.stopJourney(); // Menghentikan perjalanan kereta
        train2.dropPassengers(150); // Menurunkan 150 penumpang
        train2.dropPassengers(200); // Menurunkan 200 penumpang (melebihi yang tersisa)
        System.out.println("\n--------------------------------------------\n"); // Mencetak garis pemisah

        // Simulasi dengan kapasitas penuh untuk Taxi
        Taxi taxi2 = new Taxi("Taksi BlueBird", 4, "Bandara - Hotel"); // Membuat objek Taxi baru
        taxi2.startJourney(); // Memulai perjalanan taksi
        taxi2.boardPassengers(3); // Menambahkan 3 penumpang
        taxi2.boardPassengers(10); // Mencoba menambahkan 10 penumpang (melebihi kapasitas)
        taxi2.calculateFare(10); // Menghitung tarif perjalanan berdasarkan 10 km
        taxi2.stopJourney(); // Menghentikan perjalanan taksi
        taxi2.dropPassengers(3); // Menurunkan 3 penumpang
        taxi2.dropPassengers(4); // Menurunkan 4 penumpang (melebihi yang tersisa)
    }
}
