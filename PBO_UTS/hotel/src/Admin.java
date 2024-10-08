public class Admin implements LevelAkses {

    @Override
    public void aksesMenu() {
        System.out.println("Admin dapat mengelola kamar dan melihat semua reservasi.");
    }

    // Method untuk menambahkan kamar
    public void tambahKamar(Hotel hotel, Kamar kamar) {
        hotel.tambahKamar(kamar);
        System.out.println("Kamar baru berhasil ditambahkan.");
    }
}