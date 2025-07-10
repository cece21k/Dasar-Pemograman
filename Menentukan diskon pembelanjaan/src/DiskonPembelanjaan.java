import java.util.Scanner;
// Contoh 5: Menentukan Diskon Pembelanjaan
public class DiskonPembelanjaan {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan total belanja:");
        int totalBelanja = scanner.nextInt();

        System.out.println("Diskon Pembelanjaan:");

        for (int i = 10; i>= 1; i--) {
            int diskon = totalBelanja *i /100;
            int totalSetelahDiskon = totalBelanja - diskon;
            System.out.println("Diskon "+ i + "%: Rp" + diskon + ", Total: Rp" + totalSetelahDiskon);
        }
    }
}