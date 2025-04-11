package utp.shapes;

public class Tabung extends BangunRuang {
    private double radius;
    private static final int PEMBILANG = 22;
    private static final int PENYEBUT = 7;

    public Tabung() {
        setNama("Tabung");
    }

    public void setRadius(double inputRadius) {
        radius = inputRadius;
    }

    public double getLuasAlas() {
        return (PEMBILANG * radius * radius) / (double) PENYEBUT;
    }

    public double getKeliling() {
        return (2 * PEMBILANG * radius) / (double) PENYEBUT;
    }

    @Override
    public double getLuasPermukaan() {
        return 2 * getLuasAlas() + getKeliling() * getTinggi();
    }

    @Override
    public double getVolume() {
        return getLuasAlas() * getTinggi();
    }
}
