package praktic.geometry.mains;

import java.util.Scanner;

import praktic.geometry.shapes.Circle;
import praktic.geometry.shapes.Rectangle;

public class Main {
    static String BLUE = "\u001B[34m";

    public static void printGaris() {
        System.out.println("=====================================");
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        printGaris();
        System.out.print(BLUE + "Nama : ");
        String nama = p.nextLine();
        System.out.print("NIM  : ");
        String nim = p.nextLine();
        printGaris();
    
        System.out.println("Circle");

        printGaris();

        System.out.print("Isikan ID     : ");
        int id = p.nextInt();
        System.out.print("Isikan Radius : ");
        double radius = p.nextDouble();

        Circle lingkaran = new Circle();
    
        lingkaran.setId(id);
        lingkaran.setRadius(radius);
    
        printGaris();
        lingkaran.printDeskripsi(); 
        printGaris();

        System.out.println("Rectangle");

        printGaris();
        System.out.print("Isikan ID     : ");
        int idRectangle = p.nextInt();
        System.out.print("Isikan Panjang: ");
        double panjang = p.nextDouble();
        System.out.print("Isikan Lebar  : ");
        double lebar = p.nextDouble();

        Rectangle persegiPanjang = new Rectangle(idRectangle, panjang, lebar);


        printGaris();
        persegiPanjang.printDeskripsi();
        printGaris();
    
        p.close();
    }
}
