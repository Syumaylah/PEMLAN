package praktic.geometry.mains; 

import praktic.geometry.shapes.Circle; // import kelas Circle
import praktic.geometry.shapes.Cube; // import kelas Cube
import praktic.geometry.shapes.Sphere; // import kelas Sphere
import praktic.geometry.shapes.Square; // import kelas Square

import java.util.Scanner; // import Scanner untuk input dari pengguna

// kelas main
public class ShapeCalculator { // deklarasi kelas ShapeCalculator
    public static void main(String[] args) { // method utama 
        Scanner p = new Scanner(System.in); // membuat objek Scanner untuk input dari pengguna

        System.out.println("======================================"); // menampilkan garis pemisah
        System.out.println("Shape Calculator"); // menampilkan judul aplikasi
        System.out.println("SYUMAYLAH"); // menampilkan nama
        System.out.println("245150707111036"); // menampilkan NIM
        System.out.println("======================================"); // menampilkan garis pemisah

        System.out.println("2D Circle"); // menampilkan bagian Circle 2D
        System.out.println("======================================"); // menampilkan garis pemisah
        System.out.print("Enter radius    : "); // meminta input radius untuk lingkaran
        double circleRadius = p.nextDouble(); // menyimpan input radius
        System.out.println("======================================"); // menampilkan garis pemisah

        Circle circle = new Circle(circleRadius); // membuat objek Circle dengan radius
        circle.printInfo(); // menampilkan informasi tentang Circle

        System.out.println("2D Square"); // menampilkan bagian Square 2D
        System.out.println("======================================"); // menampilkan garis pemisah
        System.out.print("Enter side      : "); // meminta input sisi persegi
        double squareSide = p.nextDouble(); // menyimpan input sisi
        System.out.println("======================================"); // menampilkan garis pemisah

        Square square = new Square(squareSide); // membuat objek Square dengan sisi
        square.printInfo(); // menampilkan informasi tentang Square

        System.out.println("3D Weightable Cube"); // menampilkan bagian Cube 3D yang memiliki massa
        System.out.println("======================================"); // menampilkan garis pemisah
        System.out.print("Enter edge      : "); // meminta input panjang sisi kubus
        double cubeEdge = p.nextDouble(); // menyimpan panjang sisi kubus
        System.out.print("Enter mass      : "); // meminta input massa kubus
        double cubeMass = p.nextDouble(); // menyimpan massa kubus
        System.out.println("======================================"); // menampilkan garis pemisah

        Cube cube = new Cube(cubeEdge, cubeMass); // membuat objek Cube dengan sisi dan massa
        cube.printInfo(); // menampilkan informasi tentang Cube

        System.out.println("3D Weightable Sphere"); // menampilkan bagian Sphere 3D yang memiliki massa
        System.out.println("======================================"); // menampilkan garis pemisah
        System.out.print("Enter radius    : "); // meminta input radius bola
        double sphereRadius = p.nextDouble(); // menyimpan radius bola
        System.out.print("Enter mass      : "); // meminta input massa bola
        double sphereMass = p.nextDouble(); // menyimpan massa bola
        System.out.println("======================================"); // menampilkan garis pemisah

        Sphere sphere = new Sphere(sphereRadius, sphereMass); // membuat objek Sphere dengan radius dan massa
        sphere.printInfo(); // menampilkan informasi tentang Sphere

        p.close(); // menutup Scanner
    } 
}
