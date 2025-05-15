package Marketplace; // package tempat class product berada

public class Product<T extends Comparable<T>> implements Comparable<Product<T>> { // class generik product dengan tipe kategori yang bisa dibandingkan
    private int id; // variabel untuk menyimpan id produk
    private String name; // variabel untuk menyimpan nama produk
    private T category; // variabel untuk menyimpan kategori produk (generic)
    private double price; // variabel untuk menyimpan harga produk

    // konstruktor untuk mengisi data produk saat dibuat
    public Product(int id, String name, T category, double price) {
        this.id = id; // simpan id produk
        this.name = name; // simpan nama produk
        this.category = category; // simpan kategori produk
        this.price = price; // simpan harga produk
    }

    public int getId() { // getter untuk mengambil id produk
        return id; // kembalikan nilai id
    }

    public String getName() { // getter untuk mengambil nama produk
        return name; // kembalikan nama produk
    }

    public T getCategory() { // getter untuk mengambil kategori produk
        return category; // kembalikan kategori
    }

    public double getPrice() { // getter untuk mengambil harga produk
        return price; // kembalikan harga
    }

    @Override
    public String toString() { // method untuk menampilkan info produk
        return "ID: " + id + ", Nama: " + name + ", Kategori: " + category + ", Harga: Rp" + String.format("%,.2f", price); // tampilkan semua info produk
    }

    @Override
    public int compareTo(Product<T> other) { // method pembanding untuk sorting
        return this.category.compareTo(other.category); // bandingkan berdasarkan kategori
    }
}
