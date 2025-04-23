package praktic.geometry.shapes; // Package untuk bentuk spesifik

import praktic.geometry.bases.CircularShape; // Import CircularShape
import praktic.geometry.interfaces.ThreeDimensional; // Import interface 3D
import praktic.geometry.interfaces.Weightable; // Import interface Weightable

public class Sphere extends CircularShape implements ThreeDimensional, Weightable { // Kelas bola
    private double mass; // Massa bola

    public Sphere() { // Konstruktor default
        setRadius(0); // Set radius ke 0 melalui setter
        this.mass = 0; // Set massa ke 0
        setName("Sphere"); // Set nama ke "Sphere"
    }

    public Sphere(double radius, double mass) { // Konstruktor dengan parameter
        setRadius(radius); // Set radius dari parameter
        this.mass = mass; // Set massa dari parameter
        setName("Sphere"); // Set nama ke "Sphere"
    }

    @Override
    public double getSurfaceArea() { // Implementasi luas permukaan
        return 4 * (PI_NUMERATOR / (double) PI_DENOMINATOR) * getRadius() * getRadius(); // Hitung luas permukaan bola (4πr²)
    }

    @Override
    public double getVolume() { // Implementasi volume
        return (4.0 / 3.0) * (PI_NUMERATOR / (double) PI_DENOMINATOR) * getRadius() * getRadius() * getRadius(); // Hitung volume bola ((4/3)πr³)
    }

    @Override
    public double getWeight() { // Hitung berat
        return mass * g; // Rumus berat (massa x gravitasi)
    }

    @Override
    public void printInfo() { // Cetak informasi bola
        System.out.println("Name            : " + getName()); // Tampilkan nama
        System.out.println("Surface area    : " + getSurfaceArea()); // Tampilkan luas permukaan
        System.out.println("Volume          : " + getVolume()); // Tampilkan volume
        System.out.println("Weight          : " + getWeight()); // Tampilkan berat
        System.out.println("======================================"); // Garis pembatas
    }
}



