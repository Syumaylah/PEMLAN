package uap.models;

import uap.bases.Shape; // import kelas Shape
import uap.interfaces.*; // import semua kelas yang ada di folder interfaces

public class Torus extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator { // kelas torus
    private double majorRadius; // variabel radius major
    private double minorRadius; // variabel radius minor

    public Torus() {} // konstruktor default

    public Torus(double majorRadius, double minorRadius) { // konstruktor dengan parameter
        this.majorRadius = majorRadius; // mengisi radius major
        this.minorRadius = minorRadius; // mengisi radius minor
    } 

    public double getVolume() { // method volume
        return 2 * PI * PI * majorRadius * minorRadius * minorRadius; // rumus volume torus 
    } 

    public double getSurfaceArea() { // method luas permukaan
        return 4 * PI * PI * majorRadius * minorRadius; // rumus luas permukaan torus
    } 

    public double getMass() { // method massa
        return THICKNESS * getSurfaceArea() * DENSITY; // rumus massa torus
    } 

    public double gramToKilogram() { // method konversi
        return getMass() / DENOMINATOR; // gram ke kilogram
    } 

    public double calculateCost() { // method biaya
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG; // hitung biaya kirim
    } 

    public void printInfo() { // method cetak info
        System.out.printf("Volume          : %.2f\n", getVolume()); // cetak volume
        System.out.printf("Luas permukaan  : %.2f\n", getSurfaceArea()); // cetak luas
        System.out.printf("Massa           : %.2f\n", getMass()); // cetak massa
        System.out.printf("Massa dalam kg  : %.2f\n", gramToKilogram()); // cetak kg
        System.out.printf("Biaya kirim     : Rp%.0f\n", calculateCost()); // cetak biaya
    } 
}
