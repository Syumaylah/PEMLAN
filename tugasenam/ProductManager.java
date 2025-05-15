package Marketplace; // package tempat class productmanager berada

import java.util.*; // import semua class dari package java.util

public class ProductManager { // class untuk mengatur dan mengelola semua produk
    private List<Product<?>> products; // list untuk menyimpan semua produk
    private Set<String> categories; // set untuk menyimpan kategori produk yang unik
    private Queue<Product<?>> processedQueue; // queue untuk menyimpan produk yang sudah diproses

    public ProductManager() { // konstruktor untuk inisialisasi struktur data
        products = new ArrayList<>(); // buat arraylist untuk daftar produk
        categories = new HashSet<>(); // buat hashset untuk kategori unik
        processedQueue = new LinkedList<>(); // buat linkedlist untuk antrian produk
    }

    public void addProduct(Product<?> product) { // method untuk menambahkan produk
        products.add(product); // tambahkan produk ke list
        categories.add(product.getCategory().toString()); // tambahkan kategori ke set
    }

    public void removeProductById(int id) { // method untuk menghapus produk berdasarkan id
        products.removeIf(p -> p.getId() == id); // hapus jika id cocok
    }

    public void searchProduct(String name, Object category) { // method untuk mencari produk
        boolean found = false; // penanda apakah produk ditemukan
        for (Product<?> p : products) { // ulangi semua produk yang ada
            if (p.getName().equalsIgnoreCase(name) && // jika nama sama
                p.getCategory().toString().equals(category.toString())) { // dan kategori sama
                System.out.println(p); // tampilkan produk
                found = true; // tandai ditemukan
            }
        }
        if (!found) { // jika tidak ditemukan
            System.out.println("Produk tidak ditemukan."); // tampilkan pesan
        }
    }

    public void displayAllProducts() { // method untuk menampilkan semua produk
        List<Product<?>> sorted = new ArrayList<>(products); // salin semua produk ke list baru
        Collections.sort(sorted); // urutkan produk berdasarkan kategori
        for (Product<?> p : sorted) { // tampilkan satu per satu
            System.out.println(p); // cetak produk
        }
    }

    public void displayCategories() { // method untuk menampilkan kategori unik
        for (String c : categories) { // ulangi semua isi set kategori
            System.out.println(c); // tampilkan kategori
        }
    }

    public void addToProcessedQueue(Product<?> product) { // method untuk menambah produk ke antrian proses
        processedQueue.add(product); // tambahkan ke antrian
    }

    public void displayProcessedQueue() { // method untuk menampilkan isi antrian produk yang diproses
        for (Product<?> p : processedQueue) { // ulangi semua produk yang diproses
            System.out.println(p); // tampilkan produk
        }
    }
}
