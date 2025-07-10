// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) { //method
        double a = -9.81; // Percepatan (m/s^2) //variabel
        double t = 10; // Waktu (s)
        double vi = 0; // Kecepatan awal (m/s)
        double xi = 0; // Posisi Awal (m)

        double x = 0.5 * a * Math.pow(t, 2) + vi * t + xi; // Posisi Akhir //statesment

        System.out.println("Posisi objek setelah 10 detik jatuh adalah: " + x + " meter");
    }
}