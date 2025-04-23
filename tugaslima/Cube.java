package praktic.geometry.shapes; // Package untuk bentuk spesifik

import praktic.geometry.bases.Shape; // Import Shape
import praktic.geometry.interfaces.ThreeDimensional; // Import interface 3D
import praktic.geometry.interfaces.Weightable; // Import interface Weightable

public class Cube extends Shape implements ThreeDimensional, Weightable { // Kelas kubus
    private double edge; // Sisi kubus
    private double mass; // Massa kubus

    public Cube() { // Konstruktor default
        this.edge = 0; // Sisi default 0
        this.mass = 0; // Massa default 0
        setName("Cube"); // Set nama
    }

    public Cube(double edge, double mass) { // Konstruktor dengan parameter
        this.edge = edge; // Set sisi
        this.mass = mass; // Set massa
        setName("Cube"); // Set nama
    }

    @Override
    public double getSurfaceArea() { // Hitung luas permukaan
        return 6 * edge * edge; // Rumus luas permukaan kubus
    }

    @Override
    public double getVolume() { // Hitung volume
        return edge * edge * edge; // Rumus volume kubus
    }

    @Override
    public double getWeight() { // Hitung berat
        return mass * g; // Rumus berat (massa x gravitasi)
    }

    @Override
    public void printInfo() { // Cetak informasi kubus
        System.out.println("Name            : " + getName()); // Tampilkan nama
        System.out.println("Surface area    : " + getSurfaceArea()); // Tampilkan luas permukaan
        System.out.println("Volume          : " + getVolume()); // Tampilkan volume
        System.out.println("Weight          : " + getWeight()); // Tampilkan berat
        System.out.println("======================================"); // Garis pembatas
    }
}