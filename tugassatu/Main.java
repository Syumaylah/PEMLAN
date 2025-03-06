package tugassatu;

public class Main {
    public static void main(String[] args) {
        // deklarasi variabel
        Kucing kucing1, kucing2; // deklarasi variabel objek Kucing

        // instansiasi objek kucing pertama yitu anggora
        kucing1 = new Kucing(); // membuat objek baru dari kelas Kucing
        kucing1.jenis = "anggora"; // mengisi atribut jenis dengan anggora
        kucing1.bulu = "putih"; // mengisi atribut bulu dengan putih
        kucing1.umur = 3; // mengisi atribut umur dengan 3 

        // instansiasi objek kucing kedua persia
        kucing2 = new Kucing(); //membuat objek baru dari kelas Kucing
        kucing2.jenis = "persia"; // mengisi atribut jenis dengan persia
        kucing2.bulu = "coklat"; // mengisi atribut bulu dengan coklat
        kucing2.umur = 2; // mengisi atribut umur dengan 2 

        System.out.println("Spesifikasi yang dimiliki Kucing anggora:"); //mencetak dan menampilkan spesifikasi yang dimiliki kucing anggora
        kucing1.menampilkanobj(); // memanggil method menampilkanobj() untuk menampilkan atribut kucing1

        // menampilkan suara kucing anggora
        System.out.print("Suara: "); // mencetak suara menggunakan print agar tidak pindah baris
        kucing1.suara(); // Memanggil method suara() untuk menampilkan suara kucing

        System.out.println("\nSpesifikasi yang dimiliki Kucing persia:"); // menampilkan spesifikasi kucing persia
        kucing2.menampilkanobj(); // memanggil method menampilkanobj() untuk menampilkan atribut kucing2

        // menampilkan suara kucing persia
        System.out.print("Suara: "); // mencetak suara menggunakan print agar tidak pindah baris
        kucing2.suara(); // Memanggil method suara() untuk menampilkan suara kucing
    }
}
