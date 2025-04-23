package praktic.geometry.shapes; // Package untuk bentuk spesifik

import praktic.geometry.bases.CircularShape; // Import CircularShape
import praktic.geometry.interfaces.TwoDimensional; // Import interface 2D

public class Circle extends CircularShape implements TwoDimensional { // Kelas lingkaran

    public Circle() { // Konstruktor default
        setRadius(0); // Set radius ke 0 menggunakan setter
        setName("Circle"); // Set nama ke "Circle"
    }

    public Circle(double radius) { // Konstruktor dengan parameter radius
        setRadius(radius); // Set radius dari input
        setName("Circle"); // Set nama ke "Circle"
    }

    @Override
    public double getArea() { // Implementasi method getArea dari TwoDimensional
        return (PI_NUMERATOR / (double) PI_DENOMINATOR) * getRadius() * getRadius(); // Hitung dan kembalikan luas lingkaran (πr²)
    }

    @Override
    public double getPerimeter() { // Implementasi method getPerimeter dari TwoDimensional
        return 2 * (PI_NUMERATOR / (double) PI_DENOMINATOR) * getRadius(); // Hitung dan kembalikan keliling lingkaran (2πr)
    }

    @Override
    public void printInfo() { // Cetak informasi lingkaran
        System.out.println("Name            : " + getName()); // Tampilkan nama
        System.out.println("Area            : " + getArea()); // Tampilkan luas
        System.out.println("Perimeter       : " + getPerimeter()); // Tampilkan keliling
        System.out.println("======================================"); // Garis pembatas
    }
}