package praktic.geometry.bases; // Package untuk kelas dasar bentuk

public abstract class CircularShape extends Shape { // Kelas abstrak untuk bentuk lingkaran
    private double radius; // Radius bentuk lingkaran
    protected static final int PI_NUMERATOR = 22; // Pembilang untuk PI
    protected static final int PI_DENOMINATOR = 7; // Penyebut untuk PI

    public CircularShape() { // Konstruktor default
        this.radius = 0; // Inisialisasi radius ke 0
    }

    public void setRadius(double inputRadius) { // Method untuk mengatur radius
        this.radius = inputRadius; // Set radius dari input
    }

    public double getRadius() { // Method untuk mengambil radius
        return radius; // Kembalikan radius
    }
}
