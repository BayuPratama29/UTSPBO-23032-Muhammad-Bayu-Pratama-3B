/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author lenovo
 */
public class Reservasi {
    private static int counter = 0;
    private int idReservasi;
    private Kamar kamar;
    private String namaCustomer;

    // Konstruktor Reservasi
    public Reservasi(Kamar kamar, String namaCustomer) {
        this.idReservasi = ++counter;
        this.kamar = kamar;
        this.namaCustomer = namaCustomer;
    }

    // Getter
    public int getIdReservasi() {
        return idReservasi;
    }

    public Kamar getKamar() {
        return kamar;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }
}
