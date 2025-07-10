import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();

        if (beratBadan <18.5) {
            System.out.println("Berat badan kurang, Kategori: Kurus");
        } else if(beratBadan <24.5) {
            System.out.println("Berat badan normal,Kategori: Normal");
        } else if (beratBadan <50.0) {
            System.out.println("Berat badan berlebih, Kategori: Gemuk");
        } else {
            System.out.println("Obesitas, Kategori: Obesitas");
        }
    }
}