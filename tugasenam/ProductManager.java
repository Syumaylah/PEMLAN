package Marketplace; // Package tempat class ProductManager berada

import java.util.*; // Import semua class util dari Java

// Kelas buat ngatur semua produk
public class ProductManager {
    private List<Product<?>> products; // List buat nyimpan semua produk
    private Set<String> categories; // Set buat nyimpan kategori unik
    private Queue<Product<?>> processedQueue; // Queue buat nyimpan produk yang diproses

    public ProductManager() { // Konstruktor buat inisialisasi list dan queue
        products = new ArrayList<>(); // Inisialisasi ArrayList buat produk
        categories = new HashSet<>(); // Inisialisasi HashSet buat kategori unik
        processedQueue = new LinkedList<>(); // Inisialisasi LinkedList buat antrian
    }

    public void addProduct(Product<?> product) { // Method buat nambahin produk ke list
        products.add(product); // Tambah produk ke list
        categories.add(product.getCategory().toString()); // Tambah kategori produk ke set
    }

    public void removeProductById(int id) { // Method buat hapus produk berdasarkan ID
        products.removeIf(p -> p.getId() == id); // Hapus produk kalau ID-nya cocok
    }

    public void searchProduct(String name, Object category) {
        boolean found = false;
        for (Product<?> p : products) {
            if (p.getName().equalsIgnoreCase(name) && 
                p.getCategory().toString().equals(category.toString())) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Produk tidak ditemukan.");
        }
    }

    public void displayAllProducts() {
        List<Product<?>> sorted = new ArrayList<>(products);
        Collections.sort(sorted);
        for (Product<?> p : sorted) {
            System.out.println(p);
        }
    }

    public void displayCategories() { // Method buat tampilin kategori unik
        for (String c : categories) { // Loop tiap kategori
            System.out.println(c); // Cetak kategori
        }
    }

    public void addToProcessedQueue(Product<?> product) { // Method buat tambah ke antrian
        processedQueue.add(product); // Tambahkan ke antrian
    }

    public void displayProcessedQueue() { // Method buat tampilin antrian
        for (Product<?> p : processedQueue) { // Loop tiap produk di antrian
            System.out.println(p); // Cetak produk
        }
    }
}
