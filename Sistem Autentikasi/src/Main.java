import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username = "user123";
        String password = "pass123";

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan username:");
        String inputUsername = input.next();
        System.out.print("Masukkan password:");
        String inputPassword = input.next();

        if (inputUsername.equals(username)&& inputPassword.equals(password))
        {
            System.out.println("Autentikasi berhasil. Selamat datang, "+ username +"!");
        } else {
            System.out.println("Autentikasi gagal. Silakan coba lagi.");
        }
    }
}