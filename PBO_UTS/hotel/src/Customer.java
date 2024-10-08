public class Customer implements LevelAkses {

    @Override
    public void aksesMenu() {
        System.out.println("Customer dapat memesan kamar dan melihat detail reservasi.");
    }

    // Method untuk memesan kamar
    public void pesanKamar(Hotel hotel, String tipeKamar, String namaCustomer) {
        Kamar kamar = hotel.cekKetersediaanKamar(tipeKamar);
        if (kamar != null) {
            Reservasi reservasi = new Reservasi(kamar, namaCustomer);
            hotel.buatReservasi(reservasi);
            System.out.println("Reservasi berhasil untuk " + namaCustomer + " di kamar tipe " + tipeKamar);
        } else {
            System.out.println("Kamar tipe " + tipeKamar + " tidak tersedia.");
        }
    }

    // Method untuk melihat detail reservasi
    public void lihatDetailReservasi(Hotel hotel, int idReservasi) {
        Reservasi reservasi = hotel.lihatDetailReservasi(idReservasi);
        if (reservasi != null) {
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