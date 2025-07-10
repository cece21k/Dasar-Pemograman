import java.util.Scanner;

public class Main { // Grade Mahasiswa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah poin: ");
        int poin = scanner.nextInt();

        char grade;
        switch (poin) {
            case 100:
                grade = 'A';
                break;
            case 80:
                grade = 'B';
                break;
            case 60:
                grade = 'C';
                break;
            case 40:
                grade = 'D';
                break;
            default:
                grade = 'E';
        }
        System.out.println("Grade:"+grade);
        scanner.close();
    }
}