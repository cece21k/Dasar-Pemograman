import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah buku yang dibeli: ");
        int jumlahBuku = input.nextInt();

        if (jumlahBuku <= 0) {
            System.out.println("Jumlah buku harus lebih dari 0.");
            input.close();
            return;
        }

        double hargaPerBuku = 100000;
        double totalPembayaranSebelumDiskon = jumlahBuku * hargaPerBuku;
        double diskon = 0.0;
            if (jumlahBuku >= 1 && jumlahBuku <= 5) {
                diskon = 0.10;
            } else if (jumlahBuku >= 6 && jumlahBuku <= 10) {
                diskon = 0.20;
            } else {
                diskon = 0.30;
            }

            double totalPembayaranSetelahDiskon = totalPembayaranSebelumDiskon - (diskon * totalPembayaranSebelumDiskon);

            System.out.println("Total pembayaran sebelum diskon: " + totalPembayaranSebelumDiskon);
            System.out.println("Diskon yang diberikan: " + (int)(diskon * 100) + "%");
            System.out.println("Total pembayaran setelah diskon: " + totalPembayaranSetelahDiskon);

                input.close();
            }
        }
