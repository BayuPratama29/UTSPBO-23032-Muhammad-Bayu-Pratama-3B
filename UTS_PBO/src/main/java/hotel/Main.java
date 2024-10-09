/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;

public class Main {
    private static Hotel hotel = new Hotel(); // Membuat objek hotel
    private static Scanner scanner = new Scanner(System.in); // Scanner untuk input dari user

    public static void main(String[] args) {
        // Menambahkan beberapa kamar ke sistem hotel
        hotel.tambahKamar(new Kamar("Standard", 500000));
        hotel.tambahKamar(new Kamar("Deluxe", 800000));
        hotel.tambahKamar(new Kamar("Suite", 1200000));

        // Menampilkan menu utama
        menuUtama();
    }

    // Menu utama yang menampilkan opsi Admin, Customer, atau keluar
    private static void menuUtama() {
        while (true) {
            System.out.println("\n=========================");
            System.out.println("   Aplikasi Reservasi Hotel");
            System.out.println("=========================");
            System.out.println("1. Masuk sebagai Admin");
            System.out.println("2. Masuk sebagai Customer");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Menghapus newline

            switch (pilihan) {
                case 1:
                    menuAdmin(); // Memanggil menu untuk Admin
                    break;
                case 2:
                    menuCustomer(); // Memanggil menu untuk Customer
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan aplikasi kami!");
                    return; // Keluar dari aplikasi
                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }
    }

    // Menu untuk Admin dengan opsi menambah kamar atau melihat reservasi
    private static void menuAdmin() {
        Admin admin = new Admin();
        admin.aksesMenu();
        while (true) {
            System.out.println("\n=== Menu Admin ===");
            System.out.println("1. Tambah Kamar");
            System.out.println("2. Lihat Semua Reservasi");
            System.out.println("3. Kembali ke Menu Utama");
            System.out.print("Pilih opsi: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Menghapus newline

            switch (pilihan) {
                case 1:
                    // Menambah kamar baru dengan tipe dan harga
                    System.out.print("Masukkan tipe kamar: ");
                    String tipe = scanner.nextLine();
                    System.out.print("Masukkan harga kamar: ");
                    double harga = scanner.nextDouble();
                    Kamar kamar = new Kamar(tipe, harga);
                    admin.tambahKamar(hotel, kamar); // Admin menambahkan kamar ke sistem hotel
                    break;
                case 2:
                    // Melihat semua reservasi
                    admin.lihatSemuaReservasi(hotel);
                    break;
                case 3:
                    // Kembali ke menu utama
                    return;
                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }
    }

    // Menu untuk Customer dengan opsi memesan kamar atau melihat detail reservasi
    private static void menuCustomer() {
        Customer customer = new Customer();
        customer.aksesMenu();
        while (true) {
            System.out.println("\n=== Menu Customer ===");
            System.out.println("1. Pesan Kamar");
            System.out.println("2. Lihat Detail Reservasi");
            System.out.println("3. Kembali ke Menu Utama");
            System.out.print("Pilih opsi: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Menghapus newline

            switch (pilihan) {
                case 1:
                    // Memesan kamar baru
                    System.out.print("Masukkan tipe kamar yang ingin dipesan: ");
                    String tipeKamar = scanner.nextLine();
                    System.out.print("Masukkan nama customer: ");
                    String namaCustomer = scanner.nextLine();
                    customer.pesanKamar(hotel, tipeKamar, namaCustomer); // Customer memesan kamar
                    break;
                case 2:
                    // Melihat detail reservasi berdasarkan ID
                    System.out.print("Masukkan ID Reservasi: ");
                    int idReservasi = scanner.nextInt();
                    customer.lihatDetailReservasi(hotel, idReservasi);
                    break;
                case 3:
                    // Kembali ke menu utama
                    return;
                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }
    }
}
    