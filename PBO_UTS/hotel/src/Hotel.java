import java.util.*;

public class Hotel {
    private List<Kamar> kamarList;
    private List<Reservasi> reservasiList;

    // Konstruktor Hotel
    public Hotel() {
        kamarList = new ArrayList<>();
        reservasiList = new ArrayList<>();
    }

    // Method untuk menambahkan kamar
    public void tambahKamar(Kamar kamar) {
        kamarList.add(kamar);
    }

    // Method untuk mengecek ketersediaan kamar
    public Kamar cekKetersediaanKamar(String tipe) {
        for (Kamar kamar : kamarList) {
            if (kamar.getTipe().equalsIgnoreCase(tipe) && kamar.isAvailable()) {
                return kamar;
            }
        }
        return null; // Kamar tidak tersedia
    }

    // Method untuk melakukan reservasi
    public void buatReservasi(Reservasi reservasi) {
        reservasiList.add(reservasi);
        reservasi.getKamar().setAvailable(false); // Tandai kamar sebagai tidak tersedia
    }

    // Method untuk melihat detail pesanan berdasarkan ID reservasi
    public Reservasi lihatDetailReservasi(int idReservasi) {
        for (Reservasi reservasi : reservasiList) {
            if (reservasi.getIdReservasi() == idReservasi) {
                return reservasi;
            }
        }
        return null; // Tidak ditemukan reservasi
    }
}
