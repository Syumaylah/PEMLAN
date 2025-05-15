package Marketplace; // Package tempat class Product berada

// Kelas generik Product, bisa pakai kategori tipe apapun asal Comparable
public class Product<T extends Comparable<T>> implements Comparable<Product<T>> {
    private int id; // Variabel buat simpan ID produk
    private String name; // Variabel buat nama produk
    private T category; // Variabel buat kategori (tipe generic)
    private double price; // Variabel buat harga produk

    // Konstruktor buat isi semua data produk
    public Product(int id, String name, T category, double price) {
        this.id = id; // Simpan ID produk
        this.name = name; // Simpan nama produk
        this.category = category; // Simpan kategori produk
        this.price = price; // Simpan harga produk
    }

    public int getId() { // Getter buat ambil ID produk
        return id; // Balikin nilai ID
    }

    public String getName() { // Getter buat ambil nama produk
        return name; // Balikin nama
    }

    public T getCategory() { // Getter buat ambil kategori
        return category; // Balikin kategori
    }

    public double getPrice() { // Getter buat ambil harga produk
        return price; // Balikin harga
    }

    @Override
    public String toString() { // Override toString buat cetak produk
        return "ID: " + id + ", Nama: " + name + ", Kategori: " + category + ", Harga: Rp" + String.format("%,.2f", price); // Format tampilan
    }

    @Override
    public int compareTo(Product<T> other) { // Override method compareTo buat sorting
        return this.category.compareTo(other.category); // Bandingkan kategori antar produk
    }
}
