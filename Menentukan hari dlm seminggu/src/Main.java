import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nomor hari (1-7):");
        int nomorHari = input.nextInt();

        String namaHari;
        if (nomorHari == 1) {
            namaHari = "Senin";
        } else if (nomorHari == 2) {
            namaHari = "Selasa";
        } else if (nomorHari == 3) {
            namaHari = "Rabu";
        } else if (nomorHari == 4) {
            namaHari = "Kamis";
        } else if (nomorHari == 5) {
            namaHari = "Jum'at";
        } else if(nomorHari == 6) {
            namaHari = "Sabtu";
        } else if (nomorHari == 7) {
            namaHari = "Minggu";
        } else {
            namaHari = "Nomor hari tidak valid";
        }

        System.out.println("Hari ke-"+ nomorHari +"adalah"+ namaHari);
    }
}