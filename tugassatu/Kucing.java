package tugassatu;

// deklarasi kelas
public class Kucing {
    // atribut yang dimiliki oleh kelas Kucing
    public String bulu; // menyimpan warna bulu kucing dengan tipe data String
    public String jenis; // menyimpan jenis kucing (anggora dan persia) dengan tipe data String
    public int umur; // menyimpan umur kucing dengan tipe data Integer

    public void menampilkanobj() { // method untuk menampilkan objek Kucing
        System.out.println("Jenis: " + jenis); // mencetak dan menampilkan jenis kucing
        System.out.println("Bulu: " + bulu); // mencetak dan menampilkan warna bulu kucing
        System.out.println("Umur: " + umur + " tahun"); // mencetak dan menampilkan umur kucing dalam tahun
    }

    public void suara() { // method untuk menampilkan suara kucing
        System.out.println("meow"); // mencetak suara kucing "meow"
    }
}