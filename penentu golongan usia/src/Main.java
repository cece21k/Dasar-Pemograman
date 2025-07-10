import java.util.Scanner;

public class Main { //Golongan usia
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan umur:");
        int umur = scanner.nextInt();

        String golongan;
        switch (umur) {
            case 0:
            case 1:
            case 2:
                golongan = "Balita";
                break;
            case 3:
            case 4:
            case 5:
                golongan = "Anak-anak";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                golongan = "Kanak-kanak";
                break;
            case 10:
            case 11:
            case 12:
                golongan = "Remaja";
            default:
                golongan = "Dewasa";
        }
        System.out.println("Golongan usia:" + golongan);
        scanner.close();
    }
}