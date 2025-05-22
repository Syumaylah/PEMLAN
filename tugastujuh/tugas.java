package tugastujuh; 

import java.util.Scanner; // untuk mengimpor class Scanner agar bisa ambil input dari user

public class tugas { // untuk mendefinisikan class utama, namanya diganti biar nggak nabrak Exception Java

    public static void validateAge(int age) throws IllegalArgumentException { // untuk mendeklarasikan method validasi yang bisa lempar IllegalArgumentException
        if (age < 17) { // untuk mengecek apakah umur lebih kecil dari 17
            throw new IllegalArgumentException("Umur terlalu muda untuk mendaftar (minimal 17 tahun)."); // untuk melempar exception jika umur di bawah 17
        }
        System.out.println("Pendaftaran berhasil! Umur kamu memenuhi syarat."); // untuk menampilkan pesan kalau umur valid
    }

    public static void main(String[] args) { // method utama untuk menjalankan program
        Scanner p = new Scanner(System.in); // untuk membuat objek Scanner agar bisa ambil input dari user

        try { // untuk mencoba menjalankan blok kode yang bisa menyebabkan error
            System.out.print("Masukkan umur kamu: "); // untuk menampilkan permintaan input umur ke user
            int umur = p.nextInt(); // untuk membaca input angka dari user dan menyimpannya ke variabel umur

            validateAge(umur); // untuk memanggil method validateAge agar mengecek valid atau tidaknya umur
        } 
        catch (IllegalArgumentException e) { // untuk menangani error kalau umur tidak memenuhi syarat
            System.out.println("Gagal mendaftar:"); // untuk menampilkan pesan kesalahan ke layar
            e.printStackTrace(); // untuk menampilkan rincian error dari Java (lokasi, jenis error, dll)
        } 
        catch (Exception e) { // untuk menangani error lain, misalnya user masukin huruf
            System.out.println("Kesalahan input:"); // untuk menampilkan pesan error umum
            e.printStackTrace(); // untuk menampilkan rincian error dari Java
        } 
        finally { // blok ini akan dijalankan di akhir, baik terjadi error maupun tidak
            p.close(); // untuk menutup objek p
        }
    }
}
