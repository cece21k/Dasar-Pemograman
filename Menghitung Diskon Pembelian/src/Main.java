import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total belanja: ");
        int totalBelanja = input.nextInt();

        int diskon = 0;
        if (totalBelanja >= 100000) {
            diskon = 10;

        }
        int totalBayar = totalBelanja - totalBelanja * diskon / 100;
        System.out.println("Totalyang harus dibayar setelah diskon:"+ totalBayar);
    }
}