package praktic.geometry.shapes;

public class Rectangle {
    private int id; //variabel buat simpan id persegi panjang
    private double panjang; //variabel buat simpan panjang persegi panjang
    private double lebar; //variabel buat simpan lebar persegi panjang

    public Rectangle(int id, double panjang, double lebar) { //konstruktor buat inisialisasi objek Rectangle
        this.id = id; //simpan ID yang diinput ke variabel id
        this.panjang = panjang; //simpan panjang yang diinput ke variabel panjang
        this.lebar = lebar; //simpan lebar yang diinput ke variabel lebar
    }

    public int getId() { //method buat ambil ID persegi panjang
        return id; //balikin nilai ID
    }

    public double getPanjang() { //method buat ambil panjang persegi panjang
        return panjang; //balikin nilai panjang
    }

    public double getLebar() { //method buat ambil lebar persegi panjang
        return lebar; //balikin nilai lebar
    }

    public double getKeliling() { //method buat hitung keliling persegi panjang
        return 2 * (panjang + lebar); //rumus keliling = 2 * (panjang + lebar)
    }

    public double getLuas() { //method buat hitung luas persegi panjang
        return panjang * lebar; //rumus luas = panjang * lebar
    }

    public void printDeskripsi() { //method buat cetak deskripsi persegi panjang
        System.out.println("ID            : " + id); //cetak ID persegi panjang
        System.out.println("Panjang       : " + panjang); //cetak panjang persegi panjang
        System.out.println("Keliling      : " + getKeliling()); //cetak keliling persegi panjang
        System.out.println("Luas          : " + getLuas()); //cetak luas persegi panjang
    }
}
