public class Segitiga extends BangunDatar {
    public float alas;
    public float tinggi;

    @Override
    public float luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public float keliling() {
        return 3 * alas; // Asumsi keliling untuk segitiga sama sisi
    }
}