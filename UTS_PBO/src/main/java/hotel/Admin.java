/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hotel;

/**
 *
 * @author lenovo
 */
// Kelas ini merepresentasikan Admin dengan kemampuan menambah kamar dan mengakses menu admin
public class Admin implements LevelAkses {

    // Implementasi metode aksesMenu dari interface LevelAkses
    @Override
    public void aksesMenu() {
        System.out.println("Admin dapat mengelola kamar dan melihat semua reservasi.");
    }

    // Metode untuk menambahkan kamar ke dalam sistem hotel
    public void tambahKamar(Hotel hotel, Kamar kamar) {
        hotel.tambahKamar(kamar); // Memanggil metode tambahKamar di kelas Hotel
        System.out.println("Kamar baru berhasil ditambahkan.");
    }

    // Metode untuk melihat semua reservasi di sistem
    public void lihatSemuaReservasi(Hotel hotel) {
        hotel.lihatSemuaReservasi(); // Panggil metode untuk melihat semua reservasi di hotel
    }
}