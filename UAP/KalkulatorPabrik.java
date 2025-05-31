package uap.mains;

import java.util.Scanner;  // import kelas scanner
import uap.models.Torus;  // import kelas torus
import uap.models.Sphere;  // import kelas sphere

public class KalkulatorPabrik {  // kelas utama program
    public static void main(String[] args) {  // method main
        Scanner p = new Scanner(System.in);  // membuat objek scanner

        System.out.println("=============================================");  // garis pemisah
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");  // judul program
        System.out.println("SYUMAYLAH");  // nama 
        System.out.println("245150707111036");  // NIM 
        System.out.println("=============================================");  // garis pemisah
        System.out.println("Donat dengan lubang");  // subjudul
        System.out.println("=============================================");  // garis pemisah
        System.out.print("Isikan Radius   : ");  // prompt input radius utama
        double majorRadius = p.nextDouble();  // membaca input radius utama
        System.out.print("Isikan radius   : ");  // prompt input radius minor
        double minorRadius = p.nextDouble();  // membaca input radius minor

        Torus torus = new Torus(majorRadius, minorRadius);  // membuat objek torus
        System.out.println("=============================================");  // garis pemisah
        torus.printInfo();  // mencetak info torus

        System.out.println("=============================================");  // garis pemisah
        System.out.println("Donat tanpa lubang");  // subjudul
        System.out.println("=============================================");  // garis pemisah
        
        System.out.print("Isikan radius   : ");  // prompt input radius
        double radius = p.nextDouble();  // membaca input radius

        Sphere sphere = new Sphere(radius);  // membuat objek sphere
        System.out.println("=============================================");  // garis pemisah
        sphere.printInfo();  // mencetak info sphere

        System.out.println("=============================================");  // garis pemisah
        p.close();  // menutup scanner
    }
}
