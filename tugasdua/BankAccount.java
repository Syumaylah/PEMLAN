package tugasdua;

public class BankAccount { // BankAccount.java
    // Deklarasi atribut untuk menyimpan informasi rekening
    private String noRek; // Menyimpan nomor rekening
    private String namaPemilik; // Menyimpan nama pemilik rekening
    private double saldo; // Menyimpan saldo rekening
    private String jenisAkun; // Menyimpan jenis akun (Tabungan atau Giro)

    public BankAccount(String noRek, String namaPemilik, double saldo, String jenisAkun) { // Constructor pertama: digunakan jika saldo awal diberikan
        this.noRek = noRek; // Menyimpan nomor rekening dari parameter ke atribut class
        this.namaPemilik = namaPemilik; // Menyimpan nama pemilik dari parameter ke atribut class
        this.saldo = saldo; // Menyimpan saldo awal dari parameter ke atribut class
        this.jenisAkun = jenisAkun; // Menyimpan jenis akun dari parameter ke atribut class
    }

    public BankAccount(String noRek, String namaPemilik, String jenisAkun) { // Constructor kedua: digunakan jika saldo awal tidak diberikan
        this.noRek = noRek; // Menyimpan nomor rekening dari parameter ke atribut class
        this.namaPemilik = namaPemilik; // Menyimpan nama pemilik dari parameter ke atribut class
        this.jenisAkun = jenisAkun; // Menyimpan jenis akun dari parameter ke atribut class
        this.saldo = jenisAkun.equalsIgnoreCase("Tabungan") ? 100.0 : 500.0; // Jika jenis akun "Tabungan" saldo awal 100, jika "Giro" saldo awal 500.
    }

    // Method untuk menampilkan informasi rekening
    public void displayInfo() { // Method untuk menampilkan informasi rekening
        System.out.println("Nomor Rekening: " + noRek); // Cetak nomor rekening
        System.out.println("Nama Pemilik: " + namaPemilik); // Cetak nama pemilik rekening
        System.out.println("Saldo: Rp" + saldo); // Cetak saldo rekening
        System.out.println("Jenis Akun: " + jenisAkun); // Cetak jenis akun (Tabungan/Giro)
        System.out.println("--------------------------------------");
    }

    public void deposit(double nominal) { // Method untuk melakukan deposit (menambahkan saldo)
        if (nominal <= 0) { // Cek jika nominal yang dimasukkan kurang dari atau sama dengan 0
            System.out.println("Nominal deposit harus lebih dari 0!"); // Tampilkan pesan error jika nominal tidak valid
        } else { 
            saldo += nominal; // Tambahkan nominal ke saldo yang ada
            System.out.println("Berhasil deposit Rp" + nominal + ". Saldo sekarang: Rp" + saldo); // Cetak pesan sukses dan saldo terbaru
        }
    }

    public void withdraw(double nominal) { // Method untuk withdraw
        if (nominal <= 0) { // Cek apakah nominal penarikan kurang dari atau sama dengan 0
            System.out.println("Nominal penarikan harus lebih dari 0!"); // Jika ya, tampilkan pesan error
        } else if (saldo < nominal) { // Cek apakah saldo cukup untuk melakukan penarikan
            System.out.println("Saldo tidak mencukupi!"); // Jika saldo kurang, tampilkan pesan error
        } else {
            saldo -= nominal; // Kurangi saldo dengan nominal yang ditarik
            System.out.println("Berhasil tarik tunai Rp" + nominal + ". Saldo sekarang: Rp" + saldo); // Cetak pesan sukses dan saldo terbaru
        }
    }

    public void transfer(BankAccount tujuan, double nominal) { // Method untuk melakukan transfer ke rekening lain
        if (nominal <= 0) { // Cek apakah nominal transfer kurang dari atau sama dengan 0
            System.out.println("Nominal transfer harus lebih dari 0!"); // Jika ya, tampilkan pesan error
        } else if (saldo < nominal) { // Cek apakah saldo cukup untuk transfer
            System.out.println("Saldo tidak mencukupi untuk transfer!"); // Jika saldo kurang, tampilkan pesan error
        } else {
            saldo -= nominal; // Kurangi saldo pengirim
            tujuan.saldo += nominal; // Tambahkan saldo ke rekening tujuan
            System.out.println("Transfer Rp" + nominal + " ke " + tujuan.namaPemilik + " berhasil."); // Cetak pesan sukses transfer
            System.out.println("Saldo sekarang: Rp" + saldo); // Cetak saldo pengirim setelah transfer
        }
    }
}
