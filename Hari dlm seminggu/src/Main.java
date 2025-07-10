import java.util.Scanner;

public class Main { //Hari dalam seminggu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nomor hari (1-7):");
        int nomorHari = scanner.nextInt();

        switch (nomorHari) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jum'at");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                ;
                System.out.println("Nomor hari tidak valid");
        }
        scanner.close();
    }
}