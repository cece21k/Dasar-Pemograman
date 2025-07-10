// Contoh kasus 2: Continue Statement
public class ContinueExample {
    public static void main(String[]args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int skipNumber = 5;

        for (int number : numbers) {
            if (number == skipNumber) {
                System.out.println("Melewati angka"+ skipNumber);
                continue; // lewati angka tertentu dan lanjutkan ke iterasi berikutnta
            }
            if (number % 2!=0) {
                System.out.println("Bilangan Ganjil:" + number);
            }
        }
    }
}