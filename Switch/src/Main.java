import java.util.Scanner;

public class Main {  //program kalkulator sederhana
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan operator(+,-,*,/):");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Penjumlahan");
                // Implementasi penjumlahan
                break;
            case '-':
                System.out.println("Pengurangan");
                //Implementasi pengurangan
                break;
            case '*':
                System.out.println("Perkalian");
                // Implementasi perkalian
                break;
            case '/':
                System.out.println("Pembagian");
                //Implementasi pembagian
                break;
            default:
                System.out.println("Operator tidak valid");
        }
        scanner.close();
    }
}