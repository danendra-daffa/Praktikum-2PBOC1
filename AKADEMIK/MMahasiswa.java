/* Nama File    : MMahasiswa.java
 * Deskripsi    : berisi main dalam class Mahasiswa
 * Pembuat      : Muhammad Danendra Daffa 
 * Tanggal      : 20/02/2025
 */

public class MMahasiswa {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("APW", "12345", "Informatika");
        Kendaraan k1 = new Kendaraan("B 3175 ULF", "Motor");
        Mahasiswa m1 = new Mahasiswa("daffa", "24060123140164", "Informatika", d1, k1);
        m1.setNama("danendra daffa");
        m1.setNim("24060123140164");
        m1.setProdi("Informatika");
        m1.setDosenWali(d1);
        m1.setKendaraan(k1);
        System.out.println("Nama Mahasiswa : " + m1.getNama());
        System.out.println("NIM : " + m1.getNim());
        System.out.println("Prodi : " + m1.getProdi());
        System.out.println("Dosen Wali : " + m1.getDosenWali().getNama());
        System.out.println("Kendaraan : " + m1.getKendaraan().getNoPlat());
    }
}