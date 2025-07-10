import java.util.Scanner;
// Contoh 1: Menentukan bilangan prima
public class BilanganPrima {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan batas atas: ");
        int batas = scanner.nextInt();

        System.out.println("Bilangan prima antara 2 dan " + batas + ":");
        for (int i = 2; i <= batas; i++) {
            boolean isPrima = true;
            for (int j = 2; j<i; j++) {
                if (i % j == 0) {
                    isPrima = false;
                    break;
                }
            }
            if (isPrima) {
                System.out.print(i+"");
            }
        }
    }
}