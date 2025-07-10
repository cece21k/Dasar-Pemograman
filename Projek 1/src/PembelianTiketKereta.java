import java.util.Scanner;

public class PembelianTiketKereta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        int Dark_Castle = 50000;
        int Wolf_Moon   = 40000;
        int Dragon_Forest  = 30000;
        int Sky_Castle    = 20000;
        System.out.println("Welcome To Royal Carriage");
        System.out.println("====================");
        System.out.println("Masukkan tujuan perjalanan: ");
        System.out.print(" 1. Dark_Castle\n 2. Wolf_Moon\n 3. Dragon_Forest\n 4. Sky_Castle\n pilih angka tujuan: ");
        int pilih_tujuan = in1.nextInt();

        System.out.println("Silahkan pilih kelas: ");
        System.out.print(" 1. VVIP\n 2. VIP\n 3. LOW\n pilih angka kelas: ");
        int kelas = in.nextInt();

        System.out.print("Masukkan tanggal keberangkatan: ");
        int tanggalKeberangkatan = in1.nextInt();

        if (pilih_tujuan == 1) {
            System.out.print(" Isikan jumlah tiket : ");
            int jumlah_tiket = in1.nextInt();
            int total_diskon = (kelas * jumlah_tiket * Dark_Castle * 15) / 100;
            int total_harga = (kelas * jumlah_tiket * Dark_Castle) - total_diskon;

            System.out.println("Harga tiket per orang : "+String.valueOf(Dark_Castle));
            System.out.println("Diskon                : 15% ("+total_diskon+")");
            System.out.println("Total Harga           : "+String.valueOf(total_harga));

        }else if (pilih_tujuan == 2) {
            System.out.print("Isikan jumlah tiket : ");
            int jumlah_tiket = in1.nextInt();
            int total_diskon = (kelas * jumlah_tiket * Dark_Castle * 20) / 100;
            int total_harga = (kelas * jumlah_tiket * Wolf_Moon) - total_diskon;

            System.out.println("Harga tiket per orang : "+String.valueOf(Wolf_Moon));
            System.out.println("Diskon                : 20% ("+total_diskon+")");
            System.out.println("Total Harga           : "+String.valueOf(total_harga));

        }else if (pilih_tujuan == 3) {
            System.out.print("Isikan jumlah tiket : ");
            int jumlah_tiket = in1.nextInt();
            int total_diskon = (kelas * jumlah_tiket * Dragon_Forest * 25) / 100;
            int total_harga = (kelas * jumlah_tiket * Wolf_Moon) - total_diskon;

            System.out.println("Harga tiket per orang : "+String.valueOf(Dragon_Forest));
            System.out.println("Diskon                : 25% ("+total_diskon+")");
            System.out.println("Total Harga           : "+String.valueOf(total_harga));

        }else if (pilih_tujuan == 4) {
            System.out.print("Isikan jumlah tiket : ");
            int jumlah_tiket = in1.nextInt();
            int total_diskon = (kelas * jumlah_tiket * Sky_Castle * 30) / 100;
            int total_harga = (kelas * jumlah_tiket * Wolf_Moon) - total_diskon;

            System.out.println("Harga tiket per orang : "+String.valueOf(Sky_Castle));
            System.out.println("Diskon                : 30% ("+total_diskon+")");
            System.out.println("Total Harga           : "+String.valueOf(total_harga));
        }else {
            System.out.println("Tujuan tidak ada");
        }

        System.out.println("\nInformasi Pembelian Tiket:");
        System.out.println("Tujuan: " + pilih_tujuan);
        System.out.println("Tanggal Keberangkatan: " + tanggalKeberangkatan);
        System.out.println("Kelas: " + kelas);


        System.out.println("Thank you");
        System.out.println("====================");
    }
}