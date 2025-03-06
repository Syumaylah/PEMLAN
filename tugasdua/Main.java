package tugasdua;

public class Main { // Main.java
    public static void main(String[] args) {
        // membuat dua objek BankAccount dengan constructor berbeda
        BankAccount akun1 = new BankAccount("123456789", "Andi", "Tabungan"); // akun1 dibuat dengan constructor tanpa saldo (saldo otomatis 100 karena tabungan)
        BankAccount akun2 = new BankAccount("987654321", "Budi", 2000.0, "Giro"); // akun2 dibuat dengan constructor yang sudah memiliki saldo awal sebesar 2000

        // Menampilkan informasi akun sebelum transaksi
        System.out.println("Informasi Akun 1:"); // mencetak informasi akun 1
        akun1.displayInfo(); // menampilkan data akun1
        System.out.println("Informasi Akun 2:"); // mencetak informasi akun 2
        akun2.displayInfo(); // menampilkan data akun2

        System.out.println("=== Transaksi ==="); //mencetak transaksi
        akun1.deposit(500); // menambah saldo akun1 sebesar 500
        akun1.withdraw(200); // menarik saldo akun1 sebesar 200
        akun2.withdraw(2500); // mencoba menarik saldo akun2 sebesar 2500 (harus gagal)
        akun2.deposit(1000); // menambah saldo akun2 sebesar 1000

        akun2.transfer(akun1, 1500); // mentransfer 1500 dari akun2 ke akun1

        System.out.println("\n=== Informasi Akhir ==="); // mencetak Informasi Akhir
        akun1.displayInfo(); // menampilkan informasi akhir akun1
        akun2.displayInfo(); // menampilkan informasi akhir akun2
    }
}
