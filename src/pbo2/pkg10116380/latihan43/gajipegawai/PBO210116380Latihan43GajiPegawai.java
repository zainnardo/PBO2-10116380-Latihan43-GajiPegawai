/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan43.gajipegawai;

/**
 * @author 
 * Nama  : Zain Achmad Rizqullah
 * Nim   : 10116380
 * Kelas : PBO2
 * Deskripsi Program : program ini tentang menghitung gaji pegawai
 */
public class PBO210116380Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("--------------------");
        GajiPegawai pegwai = new GajiPegawai();
        pegwai.setNama("Rizki Adam Kurniawan");
        pegwai.setAlamat("Jalan Semar dlm 4 No 72/66");
        pegwai.setUangTranspot(250000);
        pegwai.setUangTunjangan(300000);
        pegwai.setGajiPokok(4500000);
        pegwai.setTotalGaji(pegwai.getTotalGaji());
        pegwai.tampilData(pegwai.getNama(), pegwai.getAlamat(), 
            pegwai.getUangTranspot(), pegwai.getUangTunjangan(),
            pegwai.getGajiPokok(), pegwai.getTotalGaji());
        
    }
    
}
