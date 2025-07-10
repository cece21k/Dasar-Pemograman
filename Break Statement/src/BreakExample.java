// contoh kasus 1: Break Statement
public class BreakExample {
    public static void main(String[]args) {
        int[] numbers = {1,3,5,7,9,11,13,15};
        int targetNumber = 7;

        for (int number : numbers) {
            if (number == targetNumber) {
                System.out.println("Angka " + targetNumber + "ditemukan!");
                break; // berhenti mencari begitu angka ditemukan
            }
        }
    }
}