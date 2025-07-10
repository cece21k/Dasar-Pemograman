import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Masukkan angka pertama : ");
        int angka1 = input.nextInt ();
        System.out.print(" Masukkan angka kedua : ");
        int angka2 = input.nextInt ();
        System.out.print("Masukkan operator (+,-,*,/): ");
        char operator =input.next().charAt(0);
        int hasil = red(angka1, angka2, operator);
        if (hasil == 0) {
            System.out.println("Operator yang dimasukkan tidak valid!");
        } else {
            System.out.println("Hasil operasi: " + hasil);
        }
    }

    public static int red(int a, int b, char operator) {
        int hasil =0;
        if (operator == '+') {
            hasil = a + b;
        } else if (operator == '-') {
            hasil = a - b;
        } else if (operator == '*') {
            hasil = a * b;
        } else if (operator == '/') {
            if (b==0) {
                System.out.println("Tidak bisa melakukan pembagian dengan nilai nol!");
            } else {
                hasil = a / b;
            }
        }
        return hasil;
    }
}