package lelang;

public class SistemLelang {
    public static void main(String[] args) {
        
        Peserta[] peserta = {
            new Peserta("Andi", 9000000),
            new Peserta("Budi", 25000000),
            new Peserta("Iwan", 30000000),
            new Peserta("Dina", 10000000),
            new Peserta("Eka", 5000000)
        };

        // Elektronik 1
        Elektronik e1 = new Elektronik("Kamera DSLR Canon", 4000000, 2);
        e1.mulaiLelang();
        peserta[1].tawar(e1, 4500000); 
        peserta[3].tawar(e1, 5000000); 
        peserta[0].tawar(e1, 5500000); 
        peserta[1].tawar(e1, 6000000); 
        e1.tutupLelang();
        peserta[2].tawar(e1, 6500000); 
        System.out.println();
        System.out.println("=====================================");
        System.out.println();
        
        Seni s1 = new Seni("Lukisan Abstrak Modern", 8000000, "Seniman Lokal");
        s1.mulaiLelang();
        peserta[4].tawar(s1, 7000000); 
        peserta[1].tawar(s1, 9000000); 
        peserta[2].tawar(s1, 10000000); 
        s1.tutupLelang();
        System.out.println();
        System.out.println("=====================================");
        System.out.println();

        Elektronik e2 = new Elektronik("Smart TV 55 Inch", 7000000, 2);
        e2.mulaiLelang();
        peserta[2].tawar(e2, 7500000); 
        peserta[1].tawar(e2, 8000000);
        peserta[3].tawar(e2, 8500000); 
        peserta[2].tawar(e2, 8000000); 
        peserta[4].tawar(e2, 9000000); 
        peserta[2].tawar(e2, 9500000); 
        e2.tutupLelang();
        System.out.println();
        System.out.println("=====================================");
        System.out.println();

        Seni s2 = new Seni("Patung Liberty Mini", 3000000, "Unknown Artist");
        s2.mulaiLelang();
        peserta[4].tawar(s2, 4000000); 
        peserta[3].tawar(s2, 4500000); 
        peserta[1].tawar(s2, 5000000); 
        peserta[4].tawar(s2, 4500000); 
        s2.tutupLelang();
        peserta[0].tawar(s2, 5500000);
    }
}
