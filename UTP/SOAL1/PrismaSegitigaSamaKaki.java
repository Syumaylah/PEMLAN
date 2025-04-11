package utp.shapes;

public class PrismaSegitigaSamaKaki extends BangunRuang {
    private double alas, kaki;

    public PrismaSegitigaSamaKaki(double alas, double kaki, double tinggi) {
        this.alas = alas;
        this.kaki = kaki;
        setTinggi(tinggi);
        setNama("Prisma Segitiga Sama Kaki");
    }

    public double getTinggiAlas() {
        return Math.sqrt(Math.pow(kaki, 2) - Math.pow(alas/2, 2));
    }

    public double getLuasAlas() {
        return (alas * getTinggiAlas()) / 2;
    }

    public double getKeliling() {
        return (2 * kaki + alas);
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