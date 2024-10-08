public class Kamar {
    private String tipe;
    private double harga;
    private boolean available;

    // Konstruktor Kamar
    public Kamar(String tipe, double harga) {
        this.tipe = tipe;
        this.harga = harga;
        this.available = true;
    }

    // Getter dan Setter
    public String getTipe() {
        return tipe;
    }

    public double getHarga() {
        return harga;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
