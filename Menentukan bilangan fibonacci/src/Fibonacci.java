import java.util.Scanner;
// Contoh 4: Menentukkan Bilangan Fibonacci > 0&1
public class Fibonacci {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan Fibonacci yang diinginkan: ");
        int jumlah = scanner.nextInt();

        int a = 0, b = 1;

        System.out.println("Bilangan Fibonacci:");

        for (int i = 1;i <= jumlah; i++) {
            System.out.print(a+"");
            int jumlahBerikutnya = a+b;
            a = b;
            b = jumlahBerikutnya;
        }
    }
}