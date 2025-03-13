package praktic.geometry.mains;

import java.util.Scanner; //import Scanner buat input dari user

import praktic.geometry.shapes.Circle; //import class Circle dari package shapes
import praktic.geometry.shapes.Rectangle; //import class Rectangle dari package shapes

public class Main {
    static String BLUE = "\u001B[34m"; //variabel buat warna biru

    public static void printGaris() { //method untuk cetak garis pemisah
        System.out.println("=====================================");
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in); //scanner buat ambil input dari user

        printGaris(); //cetak garis biar output rapi
        System.out.print(BLUE + "Nama : "); //cetak teks "Nama" dengan warna biru
        String nama = p.nextLine(); //ambil input nama dari user
        System.out.print("NIM  : "); //cetak teks "NIM"
        String nim = p.nextLine(); //ambil input NIM dari user
        printGaris(); //cetak garis buat pemisah output
    
        System.out.println("Circle"); //menampilkan judul "Circle"
        printGaris(); //cetak garis pemisah

        System.out.print("Isikan ID     : "); //cetak "Isikan ID :" 
        int id = p.nextInt(); //ambil input id dari user
        System.out.print("Isikan Radius : "); //cetak "Isikan Radius : "
        double radius = p.nextDouble(); //ambil input radius dari user

        Circle lingkaran = new Circle(); //buat objek lingkaran
    
        lingkaran.setId(id); //set id lingkaran sesuai input user
        lingkaran.setRadius(radius); //set radius lingkaran sesuai input user
    
        printGaris(); //cetak garis pemisah
        lingkaran.printDeskripsi(); //panggil method printDeskripsi buat cetak detail lingkaran
        printGaris(); //cetak garis pemisah

        System.out.println("Rectangle"); //menampilkan judul "Rectangle"
        printGaris(); //cetak garis pemisah

        System.out.print("Isikan ID     : "); //cetak "Isikan ID :" 
        int idRectangle = p.nextInt(); //ambil input ID dari user
        System.out.print("Isikan Panjang: "); //cetak "Isikan Panjang : "
        double panjang = p.nextDouble(); //ambil input panjang dari user
        System.out.print("Isikan Lebar  : "); //cetak "Isikan Lebar : "
        double lebar = p.nextDouble(); //ambil input lebar dari user

        Rectangle persegiPanjang = new Rectangle(idRectangle, panjang, lebar); //buat objek persegi panjang

        printGaris(); //cetak garis pemisah
        persegiPanjang.printDeskripsi(); //panggil method printDeskripsi buat cetak detail persegi panjang
        printGaris(); //cetak garis pemisah
    
        p.close(); //tutup scanner 
    }
}
