package praktic.inheritance.transportation; 

public class Vehicle { // Mendeklarasikan kelas Vehicle sebagai kelas induk
    protected String name; // Nama kendaraan
    protected int capacity; // Kapasitas maksimum kendaraan
    protected String route; // Rute perjalanan kendaraan
    protected int currentPassengers; // Jumlah penumpang saat ini dalam kendaraan

    public Vehicle(String name, int capacity, String route) { // Konstruktor kelas Vehicle untuk inisialisasi properti kendaraan
        this.name = name; // Menginisialisasi nama kendaraan
        this.capacity = capacity; // Menginisialisasi kapasitas kendaraan
        this.route = route; // Menginisialisasi rute kendaraan
        this.currentPassengers = 0; // Menetapkan jumlah penumpang awal menjadi 0
    }

    public void boardPassengers(int count) { // Metode untuk menaikkan penumpang ke kendaraan
        if (currentPassengers + count <= capacity) { // Mengecek apakah masih ada kapasitas tersisa
            currentPassengers += count; // Menambahkan penumpang jika kapasitas mencukupi
            System.out.println(count + " penumpang naik ke dalam " + name); // Menampilkan jumlah penumpang yang naik
        } else {
            System.out.println("Kapasitas penuh! Tidak dapat menaikkan " + count + " penumpang"); // Menampilkan pesan jika kapasitas penuh
        }
    }

    public void dropPassengers(int count) { // Metode untuk menurunkan penumpang dari kendaraan
        if (currentPassengers >= count) { // Mengecek apakah jumlah penumpang yang ingin turun tersedia
            currentPassengers -= count; // Mengurangi jumlah penumpang
            System.out.println(count + " penumpang turun dari " + name); // Menampilkan jumlah penumpang yang turun
        } else {
            System.out.println("Tidak ada cukup penumpang untuk turun"); // Menampilkan pesan jika tidak cukup penumpang untuk turun
        }
    }

    public void startJourney() { // Metode untuk memulai perjalanan kendaraan
        System.out.println(name + " memulai perjalanan di " + route); // Menampilkan pesan perjalanan dimulai
    }

    public void stopJourney() { // Metode untuk menghentikan perjalanan kendaraan
        System.out.println(name + " mencapai tujuan akhir dan berhenti"); // Menampilkan pesan bahwa kendaraan telah berhenti di tujuan
    }

    public void calculateFare() { // Metode untuk menghitung tarif perjalanan (akan di-override oleh subclass)
        // Method ini akan di-override oleh subclass
    }

    public int getCurrentPassengers() { // Metode untuk mendapatkan jumlah penumpang saat ini
        return currentPassengers; // Mengembalikan jumlah penumpang saat ini
    }
}
