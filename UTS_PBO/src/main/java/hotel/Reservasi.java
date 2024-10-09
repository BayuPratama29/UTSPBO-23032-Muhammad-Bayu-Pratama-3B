/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author lenovo
 */
// Kelas ini digunakan untuk merepresentasikan data reservasi
public class Reservasi {
    private static int counter = 0; // Penghitung otomatis untuk ID reservasi
    private int idReservasi;
    private Kamar kamar; // Kamar yang dipesan
    private String namaCustomer; // Nama pelanggan yang memesan

    // Konstruktor untuk membuat reservasi baru
    public Reservasi(Kamar kamar, String namaCustomer) {
        this.idReservasi = ++counter; // Setiap kali reservasi dibuat, ID bertambah otomatis
        this.kamar = kamar;
        this.namaCustomer = namaCustomer;
    }

    // Getter untuk mendapatkan ID reservasi
    public int getIdReservasi() {
        return idReservasi;
    }

    // Getter untuk mendapatkan kamar yang dipesan
    public Kamar getKamar() {
        return kamar;
    }

    // Getter untuk mendapatkan nama customer yang memesan
    public String getNamaCustomer() {
        return namaCustomer;
    }
}
