import java.util.Scanner;

public class Main { //Menu makanan
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Makanan:");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Soto Ayam");
        System.out.println("4. Gado-Gado");
        System.out.println("Pilih menu (1-4):");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memiih Nasi Goreng");
                break;
            case 2:
                System.out.println("Anda memiih Mie Goreng");
                break;
            case 3:
                System.out.println("Anda memiih Soto Ayam");
                break;
            case 4:
                System.out.println("Anda memiih Gado-Gado");
                break;
            default:
                System.out.println("Menu tidak valid");
        }
        scanner.close();
    }
}