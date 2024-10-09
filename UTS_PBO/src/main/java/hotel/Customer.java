/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author lenovo
 */
// Kelas ini merepresentasikan Customer dengan kemampuan memesan kamar dan melihat detail reservasi
public class Customer implements LevelAkses {

    // Implementasi metode aksesMenu dari interface LevelAkses
    @Override
    public void aksesMenu() {
        System.out.println("Customer dapat memesan kamar dan melihat detail reservasi.");
    }

    // Metode untuk memesan kamar oleh customer
    public void pesanKamar(Hotel hotel, String tipeKamar, String namaCustomer) {
        // Mengecek apakah kamar tersedia
        Kamar kamar = hotel.cekKetersediaanKamar(tipeKamar);
        if (kamar != null) { // Jika kamar tersedia
            // Buat reservasi baru
            Reservasi reservasi = new Reservasi(kamar, namaCustomer);
            hotel.buatReservasi(reservasi);
            System.out.println("Reservasi berhasil untuk " + namaCustomer + " di kamar tipe " + tipeKamar);
        } else {
            System.out.println("Kamar tipe " + tipeKamar + " tidak tersedia.");
        }
    }

    // Metode untuk melihat detail reservasi berdasarkan ID
    public void lihatDetailReservasi(Hotel hotel, int idReservasi) {
        // Mengambil reservasi dari sistem hotel
        Reservasi reservasi = hotel.lihatDetailReservasi(idReservasi);
        if (reservasi != null) { // Jika reservasi ditemukan
            System.out.println("Detail Reservasi:");
            System.out.println("ID: " + reservasi.getIdReservasi());
            System.out.println("Nama Customer: " + reservasi.getNamaCustomer());
            System.out.println("Tipe Kamar: " + reservasi.getKamar().getTipe());
            System.out.println("Harga: " + reservasi.getKamar().getHarga());
        } else {
            System.out.println("Reservasi tidak ditemukan.");
        }
    }
}