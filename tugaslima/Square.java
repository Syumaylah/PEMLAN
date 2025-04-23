package praktic.geometry.shapes; // Package untuk bentuk spesifik

import praktic.geometry.bases.Shape; // Import Shape
import praktic.geometry.interfaces.TwoDimensional; // Import interface 2D

public class Square extends Shape implements TwoDimensional { // Kelas persegi
    private double side; // Sisi persegi

    public Square() { // Konstruktor default
        this.side = 0; // Sisi default 0
        setName("Square"); // Set nama
    }

    public Square(double side) { // Konstruktor dengan parameter
        this.side = side; // Set sisi
        setName("Square"); // Set nama
    }

    @Override
    public double getArea() { // Hitung luas
        return side * side; // Rumus luas persegi
    }

    @Override
    public double getPerimeter() { // Hitung keliling
        return 4 * side; // Rumus keliling persegi
    }

    @Override
    public void printInfo() { // Cetak informasi persegi
        System.out.println("Name            : " + getName()); // Tampilkan nama
        System.out.println("Area            : " + getArea()); // Tampilkan luas
        System.out.println("Perimeter       : " + getPerimeter()); // Tampilkan keliling
        System.out.println("======================================"); // Garis pembatas
    }
}
