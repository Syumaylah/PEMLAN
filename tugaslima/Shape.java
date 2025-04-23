package praktic.geometry.bases; // Package untuk kelas dasar bentuk

public abstract class Shape { // Kelas abstrak dasar untuk semua bentuk
    private String name; // Variabel untuk menyimpan nama bentuk

    public Shape() { // Konstruktor default
        this.name = "Shape"; // Set nama default
    }

    public void setName(String inputName) { // Method untuk mengatur nama
        this.name = inputName; // Set nama ke input
    }

    public String getName() { // Method untuk mengambil nama
        return name; // Kembalikan nama
    }

    public abstract void printInfo(); // Method abstrak untuk mencetak info
}
