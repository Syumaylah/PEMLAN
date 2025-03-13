package praktic.geometry.shapes;

public class Circle {
    private int id; //variabel untuk simpan id lingkaran
    private double radius; //variabel untuk simpan radius lingkaran
    private final int pembilang = 22; //konstanta untuk pembilang pi
    private final int penyebut = 7; //konstanta untuk penyebut pi

    public Circle() { //konstruktor kosong

    }

    public void setId(int id) { //method untuk set id lingkaran
        this.id = id; //id yang diinput ke variabel id
    }

    public void setRadius(double radius) { //method untuk set radius lingkaran
        this.radius = radius; //simpan radius yang diinput ke variabel radius
    }

    public double getKeliling() { //method untuk hitung keliling lingkaran
        return 2 * (pembilang / (double) penyebut) * radius; //rumus keliling lingkaran = 2 * pi * r
    }

    public double getLuas() { //method untuk hitung luas lingkaran
        return (pembilang / (double) penyebut) * radius * radius; //rumus luas lingkaran = pi * r^2
    }

    public void printDeskripsi() { //method untuk cetak deskripsi lingkaran
        System.out.println("ID            : " + id); //cetak ID lingkaran
        System.out.println("Radius        : " + radius); //cetak radius lingkaran
        System.out.println("Keliling      : " + getKeliling()); //cetak keliling lingkaran
        System.out.println("Luas          : " + getLuas()); //cetak luas lingkaran
    }
}
