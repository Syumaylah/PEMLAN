package uap.models;

import uap.bases.Shape; // import kelas Shape
import uap.interfaces.*; // import semua kelas yang ada di folder interfaces

public class Sphere extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator { // kelas sphere
    private double radius; // variabel radius

    public Sphere() {} // konstruktor default

    public Sphere(double radius) { // konstruktor dengan parameter
        this.radius = radius; // mengisi nilai radius
    } 

    public double getVolume() { // method hitung volume
        return (4.0 / 3.0) * PI * radius * radius * radius; // rumus volume bola
    } 

    public double getSurfaceArea() { // method hitung luas permukaan
        return 4 * PI * radius * radius; // rumus luas permukaan bola

    } 

    public double getMass() { // method hitung massa
        return THICKNESS * getSurfaceArea() * DENSITY; // rumus massa
    } 

    public void printInfo() { // method cetak info
        System.out.printf("Volume          : %.2f\n", getVolume()); // cetak volume
        System.out.printf("Luas permukaan  : %.2f\n", getSurfaceArea()); // cetak luas
        System.out.printf("Massa           : %.2f\n", getMass()); // cetak massa
        System.out.printf("Massa dalam kg  : %.2f\n", gramToKilogram()); // cetak massa kg
        System.out.printf("Biaya kirim     : Rp%.0f\n", calculateCost()); // cetak biaya
    } // akhir method

    public double gramToKilogram() { // method konversi satuan
        return getMass() / DENOMINATOR; // gram ke kilogram
    } 

    public double calculateCost() { // method hitung biaya
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG; // hitung biaya kirim
    }
}
