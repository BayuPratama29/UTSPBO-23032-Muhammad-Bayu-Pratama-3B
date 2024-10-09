/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author lenovo
 */
import java.util.*;

public class Hotel {
    // Daftar kamar yang tersedia di hotel
    private List<Kamar> kamarList;
    // Daftar reservasi yang dibuat
    private List<Reservasi> reservasiList;

    // Konstruktor hotel menginisialisasi list kamar dan reservasi
    public Hotel() {
        kamarList = new ArrayList<>();
        reservasiList = new ArrayList<>();
    }

    // Metode untuk menambahkan kamar ke daftar kamar hotel
    public void tambahKamar(Kamar kamar) {
        kamarList.add(kamar);
    }

    // Metode untuk mengecek ketersediaan kamar berdasarkan tipe
    public Kamar cekKetersediaanKamar(String tipe) {
        for (Kamar kamar : kamarList) {
            if (kamar.getTipe().equalsIgnoreCase(tipe) && kamar.isAvailable()) {
                return kamar; // Mengembalikan kamar jika tersedia
            }
        }
        return null; // Mengembalikan null jika kamar tidak tersedia
    }

    // Metode untuk membuat reservasi dan mengubah status kamar menjadi tidak tersedia
    public void buatReservasi(Reservasi reservasi) {
        reservasiList.add(reservasi);
        reservasi.getKamar().setAvailable(false); // Tandai kamar sebagai tidak tersedia
    }

    // Metode untuk melihat detail reservasi berdasarkan ID reservasi
    public Reservasi lihatDetailReservasi(int idReservasi) {
        for (Reservasi reservasi : reservasiList) {
            if (reservasi.getIdReservasi() == idReservasi) {
                return reservasi; // Mengembalikan reservasi jika ditemukan
            }
        }
        return null; // Mengembalikan null jika tidak ditemukan
    }

    // Metode untuk menampilkan semua reservasi yang ada
    public void lihatSemuaReservasi() {
        if (reservasiList.isEmpty()) {
            System.out.println("Tidak ada reservasi yang ditemukan.");
        } else {
            for (Reservasi reservasi : reservasiList) {
                System.out.println("ID Reservasi: " + reservasi.getIdReservasi());
                System.out.println("Nama Customer: " + reservasi.getNamaCustomer());
                System.out.println("Tipe Kamar: " + reservasi.getKamar().getTipe());
                System.out.println("Harga: " + reservasi.getKamar().getHarga());
                System.out.println("-----------------------------------");
            }
        }
    }
}