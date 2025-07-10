import java.util.Scanner;

public class JavaArrays{
    public static void main(String[]args) {
        String[] car;
        String[] cars = {"Porche", "BMW", "Lamborghini"}; // inisialisasi Array
        int[] myNum = {10, 20, 30, 40};

        // mengakses elemen Array
        String[] carss = {"Volvo", "BMW", "Ford", "Lamborghini"};
        System.out.println(carss[0]); // outputs volvo

        // mengubah elemen Array
        String[] carrs = {"Volvo", "BMW", "Ford", "Mazda"};
        carrs[0] = "Opet";
        System.out.println(cars[0]);

        // Panjang Array
        String[] ccars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(ccars.length); // outputs 4


        // Melakukan pengulangan pada Array {menggunakan for loop}
        String[] caars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < caars.length; i++) {
            System.out.println(caars[i]);
        }

        //Menggunakan For-Each Loop
        String[] carrss = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String lcar : carrss) {
            System.out.println(lcar);
        }

        // Array Multidimensi
        // Membuat Array dua Dimensi
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};

        // Mengakses elemen
        int[][] myNumber = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(myNumber[1][2]); // ouputnya 7

        // Mengubah nilai elemen
        int[][] myNumberr = {{1,2,3,4},{5,6,7}};
        myNumberr[1][2] = 9;
        System.out.println(myNumberr[1][2]); // ouputnya 9 bukan 7
    }
}