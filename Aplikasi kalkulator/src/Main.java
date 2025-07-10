import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        Double angka1 = input.nextDouble();

        System.out.print("Masukkan operator (+,-,*,/):");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan angka kedua:");
        double angka2 = input.nextDouble();

        double hasil = 0;

        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
            } else {
                System.out.println("Error: Pembagian oleh nol tidak di perbolehkan.");
                return;
            }
        } else {
            System.out.println("Error: Operator tidak valid.");
            return;
        }
        System.out.println("Hasil:" + hasil);
    }
}