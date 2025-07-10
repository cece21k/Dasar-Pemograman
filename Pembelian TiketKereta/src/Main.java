import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tujuan perjalanan (contoh: Jakarta - Surabaya): ");
        String tujuan = scanner.nextLine();

        System.out.print("Masukkan tanggal keberangkatan: ");
        String tanggalKeberangkatan = scanner.nextLine();

        System.out.print("Masukkan jumlah tiket: ");
        int jumlahTiket = scanner.nextInt();

        double hargaEksekutif = 300000;
        double hargaBisnis = 250000;
        double hargaEkonomi = 200000;

        double totalHarga = 0.0;
        System.out.println("Pilih kelas kereta (1. Eksekutif, 2. Bisnis, 3. Ekonomi): ");
        int kelas = scanner.nextInt();
        switch (kelas) {
            case 1:
                totalHarga = hitungHargaTiket(jumlahTiket, hargaEksekutif);
                break;
            case 2:
                totalHarga = hitungHargaTiket(jumlahTiket, hargaBisnis);
                break;
            case 3:
                totalHarga = hitungHargaTiket(jumlahTiket, hargaEkonomi);
                break;
            default:
                System.out.println("Kelas tidak valid.");
                return;
        }

        System.out.println("\nInformasi Pembelian Tiket:");
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Tanggal Keberangkatan: " + tanggalKeberangkatan);
        System.out.println("Jumlah Tiket: " + jumlahTiket);
        System.out.println("Kelas: " + getNamaKelas(kelas));
        System.out.println("Total Harga Sebelum Diskon: " + totalHarga);

        double diskon = hitungDiskon(jumlahTiket, tanggalKeberangkatan);
        if (diskon > 0) {
            System.out.println("Diskon: " + diskon);
            totalHarga -= diskon;
            System.out.println("Total Harga Setelah Diskon: " + totalHarga);
        } else {
            System.out.println("Tidak ada diskon diberikan.");
        }

        scanner.close();
    }

    private static double hitungHargaTiket(int jumlahTiket, double hargaPerTiket) {
        return jumlahTiket * hargaPerTiket;
    }

    private static double hitungDiskon(int jumlahTiket, String tanggalKeberangkatan) {
        double diskon = 0;

        if (jumlahTiket > 5) {
            diskon = 15 * hitungHargaTiket(jumlahTiket, 0);
        }

        if (tanggalKeberangkatan.equals("01-01-2023")) {
            diskon += 0.05 * hitungHargaTiket(jumlahTiket, 0);
        }

        return diskon;
    }

    private static String getNamaKelas(int kelas) {
        switch (kelas) {
            case 1:
                return "Eksekutif";
            case 2:
                return "Bisnis";
            case 3:
                return "Ekonomi";
            default:
                return "Tidak valid";
        }
    }
}
