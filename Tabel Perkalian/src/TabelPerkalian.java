import java.util.Scanner;
// Contoh 2 : Tabel Perkalian
public class TabelPerkalian {
    public static void main(String[]args) {
        System.out.println("Tabel Perkalian 5: ");

        for (int i = 1;i <= 10; i++) {
            int hasil = 5*i;
            System.out.println("5x" + i + "=" + hasil);
        }
    }
}