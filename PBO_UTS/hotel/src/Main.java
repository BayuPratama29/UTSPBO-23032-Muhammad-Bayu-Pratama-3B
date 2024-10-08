import java.util.Scanner;

public class Main {
    private static Hotel hotel = new Hotel();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Menambahkan beberapa kamar
        hotel.tambahKamar(new Kamar("Standard", 500000));
        hotel.tambahKamar(new Kamar("Deluxe", 800000));
        hotel.tambahKamar(new Kamar("Suite", 1200000));

        // Menampilkan menu utama
        menuUtama();
    }

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
            scanner.nextLine(); // Clear newline

            switch (pilihan) {
                case 1:
                    menuAdmin();
                    break;
                case 2:
                    menuCustomer();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan aplikasi kami!");
                    return; // Keluar dari aplikasi
                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void menuAdmin() {
        Admin admin = new Admin();
        admin.aksesMenu();
        while (true) {
            System.out.println("\n=== Menu Admin ===");
            System.out.println("1. Tambah Kamar");
            System.out.println("2. Lihat Semua Reservasi (Belum diimplementasikan)");
            System.out.println("3. Kembali ke Menu Utama");
            System.out.print("Pilih opsi: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan tipe kamar: ");
                    String tipe = scanner.nextLine();
                    System.out.print("Masukkan harga kamar: ");
                    double harga = scanner.nextDouble();
                    Kamar kamar = new Kamar(tipe, harga);
                    admin.tambahKamar(hotel, kamar);
                    break;
                case 2:
                    // Menampilkan semua reservasi (belum diimplementasikan)
                    System.out.println("Fitur ini belum diimplementasikan.");
                    break;
                case 3:
                    return; // Kembali ke menu utama
                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }
    }

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
            scanner.nextLine(); // Clear newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan tipe kamar yang ingin dipesan: ");
                    String tipeKamar = scanner.nextLine();
                    System.out.print("Masukkan nama Anda: ");
                    String namaCustomer = scanner.nextLine();
                    customer.pesanKamar(hotel, tipeKamar, namaCustomer);
                    break;
                case 2:
                    System.out.print("Masukkan ID reservasi: ");
                    int idReservasi = scanner.nextInt();
                    customer.lihatDetailReservasi(hotel, idReservasi);
                    break;
                case 3:
                    return; // Kembali ke menu utama
                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }
    }
}