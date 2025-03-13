package praktic.geometry.shapes;

public class Rectangle {
    private int id;
    private double panjang;
    private double lebar;

    public Rectangle(int id, double panjang, double lebar) {
        this.id = id;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getId() {
        return id;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getKeliling() {
        return 2 * (panjang + lebar);
    }

    public double getLuas() {
        return panjang * lebar;
    }

    public void printDeskripsi() {
        System.out.println("ID            : " + id);
        System.out.println("Panjang       : " + panjang);
        System.out.println("Keliling      : " + getKeliling());
        System.out.println("Luas          : " + getLuas());
    }

}
