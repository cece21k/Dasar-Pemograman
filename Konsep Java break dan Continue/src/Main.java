public class Main {
    public static void main(String[] args) {
        for (int i = 0; i<10; i++) { // Break Statement
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        for (int p = 0; p<10; p++) { // Continue Statement
            if (p == 4) {
                continue;
            }
            System.out.println(p);
        }
        // Penggunaan Break dan Continue dalam While Loop
        int l = 0; // Contoh Break pada While Loop
        while (l < 10) {
            if (l == 4) {
                l++;
                continue;
            }
            System.out.println(l);
            l++;
        }

        int k = 0; // Contoh Continue pada While Loop
        while (k<10) {
            if (k == 4) {
                k++;
                continue;
            }
            System.out.println(k);
            k++;
        }
    }
}