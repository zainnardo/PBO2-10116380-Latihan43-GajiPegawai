/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan43.gajipegawai;

/**
 *
 * @author Epsilon
 */
public class GajiPegawai {
    
     private String nama;
    private String alamat;
    private int uangTranspot;
    private int uangTunjangan;
    private int gajiPokok;
    private int totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTranspot() {
        return uangTranspot;
    }

    public void setUangTranspot(int uangTranspot) {
        this.uangTranspot = uangTranspot;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return uangTunjangan + uangTranspot + gajiPokok;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }

    public int totalGaji(int uangTunjangan, int uangTranspot, int gajiPokok) {
        return uangTunjangan + uangTranspot + gajiPokok;
    }

    public void tampilData(String nama, String alamat, int uangTransport,
            int uangTunjangan, int gajiPokok, int totalGaji) {
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Uang Transpot : Rp. " + uangTranspot);
        System.out.println("Uang Tunjangan : Rp. " + uangTunjangan);
        System.out.println("Gaji Pokok : Rp. " + gajiPokok);
        System.out.println("TOTAL GAJI : Rp. " + totalGaji);
    }
    
}
