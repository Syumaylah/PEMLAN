package Marketplace; // package utama untuk class marketplace

public class Marketplace { // class utama sebagai simulasi program marketplace
    public static void main(String[] args) { // method main sebagai titik awal program
        ProductManager manager = new ProductManager(); // buat objek manager produk

        manager.addProduct(new Product<>(1, "Laptop", "Elektronik", 10000000)); // tambah produk laptop
        manager.addProduct(new Product<>(2, "Kemeja", "Pakaian", 250000)); // tambah produk kemeja
        manager.addProduct(new Product<>(3, "HP", "Elektronik", 5000000)); // tambah produk hp
        manager.addProduct(new Product<>(4, "Buku", "Edukasi", 75000)); // tambah produk buku
        manager.addProduct(new Product<>(5, "TV", "Elektronik", 3000000)); // tambah produk tv

        System.out.println("=== Semua Produk (Urut Kategori) ==="); // tampilkan judul bagian
        manager.displayAllProducts(); // tampilkan semua produk

        System.out.println("\n=== Cari Produk: HP, Elektronik ==="); // tampilkan pencarian
        manager.searchProduct("HP", "Elektronik"); // cari produk berdasarkan nama dan kategori

        System.out.println("\n=== Kategori Unik ==="); // tampilkan bagian kategori
        manager.displayCategories(); // tampilkan semua kategori unik

        System.out.println("\n=== Tambah Produk ke Antrian Diproses ==="); // tampilkan bagian proses antrian
        Product<?> produkDiproses = new Product<>(6, "Meja", "Furniture", 450000); // buat produk yang akan diproses
        manager.addToProcessedQueue(produkDiproses); // tambahkan ke antrian

        System.out.println("Produk berikut telah ditambahkan ke antrian proses:"); // tampilkan info produk yang ditambahkan
        System.out.println(produkDiproses); // tampilkan produk

        System.out.println("\n=== Daftar Produk yang Sudah Diproses (Antrian) ==="); // tampilkan bagian antrian proses
        manager.displayProcessedQueue(); // tampilkan semua produk dalam antrian

        System.out.println("\n=== Hapus Produk dengan ID 2 ==="); // tampilkan info penghapusan
        manager.removeProductById(2); // hapus produk dengan id 2
        manager.displayAllProducts(); // tampilkan semua produk setelah dihapus
    }
}
