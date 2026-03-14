public class Main {
    public static void main(String[] args) {
       
        // Inisialisasi Objek
        BangunDatar bd = new BangunDatar();
        
        Persegi persegi = new Persegi();
        persegi.sisi = 5;
        
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 7;
        
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 10;
        segitiga.tinggi = 8;
        
        // Menampilkan Hasil
        System.out.println("=== Hasil Perhitungan ===");
        System.out.println("Luas Persegi: " + persegi.luas());
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Luas Segitiga: " + segitiga.luas());
    }
}