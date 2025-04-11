package utp.mains;

import utp.shapes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("Kalkulator Bangun Ruang");
        System.out.println("SYUMAYLAH");
        System.out.println("245150707111036");
        System.out.println("===========================================");

        System.out.println("Prisma Segitiga Sama Kaki");
        System.out.println("===========================================");
        System.out.print("Isikan alas     : ");
        double alas = input.nextDouble();
        System.out.print("Isikan kaki     : ");
        double kaki = input.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiPrisma = input.nextDouble();

        System.out.println("===========================================");

        PrismaSegitigaSamaKaki prisma = new PrismaSegitigaSamaKaki(alas, kaki, tinggiPrisma);
        prisma.printInfo();
        System.out.println("===========================================");

        System.out.println("Limas Persegi");
        System.out.println("===========================================");
        System.out.print("Isikan sisi     : ");
        double sisi = input.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiLimas = input.nextDouble();
        System.out.println("===========================================");

        LimasPersegi limas = new LimasPersegi(sisi, tinggiLimas);
        limas.printInfo();
        System.out.println("===========================================");

        System.out.println("Tabung");
        System.out.println("===========================================");
        System.out.print("Isikan radius   : ");
        double radius = input.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiTabung = input.nextDouble();
        System.out.println("===========================================");

        Tabung tabung = new Tabung();
        tabung.setRadius(radius);
        tabung.setTinggi(tinggiTabung);
        tabung.printInfo();

        System.out.println("===========================================");
    }
}
