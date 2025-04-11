package utp.shapes;

public class LimasPersegi extends BangunRuang {
    private double sisi;

    public LimasPersegi(double sisi, double tinggi) {
        this.sisi = sisi;
        setTinggi(tinggi);
        setNama("Limas Persegi");
    }

    public double getTinggiSegitiga() {
        return Math.sqrt((sisi * sisi) / 4 + getTinggi() * getTinggi());
    }

    public double getLuasSegitiga() {
        return (sisi * getTinggiSegitiga()) / 2;
    }

    public double getLuasAlas() {
        return sisi * sisi;
    }

    @Override
    public double getLuasPermukaan() {
        return 4 * getLuasSegitiga() + getLuasAlas();
    }

    @Override
    public double getVolume() {
        return getLuasAlas() * getTinggi() / 3;
    }
}
