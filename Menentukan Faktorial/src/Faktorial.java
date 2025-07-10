import java.util.Scanner;
// Contoh 3: Menetukan Faktorial
public class Faktorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        int faktorial = 1;
        for (int i = 1;i<= angka; i++) {
            faktorial *=i;
        }
        System.out.println(" Faktorial dari" + angka + "adalah:" + faktorial);
    }
}