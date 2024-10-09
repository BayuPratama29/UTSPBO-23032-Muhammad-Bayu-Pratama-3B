/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author lenovo
 */
// Kelas ini merepresentasikan objek Kamar dengan atribut tipe, harga, dan status ketersediaan
public class Kamar {
    private String tipe;
    private double harga;
    private boolean available;

    // Konstruktor untuk menginisialisasi objek Kamar dengan tipe dan harga tertentu
    public Kamar(String tipe, double harga) {
        this.tipe = tipe;
        this.harga = harga;
        this.available = true; // Kamar secara default tersedia
    }

    // Getter untuk mengambil tipe kamar
    public String getTipe() {
        return tipe;
    }

    // Getter untuk mengambil harga kamar
    public double getHarga() {
        return harga;
    }

    // Mengecek apakah kamar tersedia
    public boolean isAvailable() {
        return available;
    }

    // Mengubah status ketersediaan kamar
    public void setAvailable(boolean available) {
        this.available = available;
    }
}