public class PerhitunganLuas {
    static int hitungLuas(int sisi) {
        return sisi * sisi;
    }
    static double hitungLuas(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public static void main(String[] args) {
        int luasPersegi = hitungLuas(5);
        System.out.println("Luas Persegi:" + luasPersegi);
        double luasLingkaran = hitungLuas(3.5);
        System.out.println("Luas Lingkaran:" + luasLingkaran);
    }
}