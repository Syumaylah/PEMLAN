package utp.shapes;

public abstract class BangunRuang {
    private String nama;
    private double tinggi;

    public BangunRuang() {

    }

    public void setNama(String inputNama) {
        nama = inputNama;
    }

    public String getNama() {
        return nama;
    }

    public void setTinggi(double inputTinggi) {
        tinggi = inputTinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    protected abstract double getLuasPermukaan();

    protected abstract double getVolume();

    public void printInfo() {
        System.out.println("Nama\t\t: " + getNama());
        System.out.printf("Luas permukaan\t: %.2f\n", getLuasPermukaan());
        System.out.printf("Volume\t\t: %.2f\n", getVolume());
    }
}
