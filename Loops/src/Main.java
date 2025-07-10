public class Main {
    public static void main(String[] args){
        int i = 0;
        while (i<5) { // Pengulangan while untuk menjalankan sejumlah pernyataan selama kondisi tertentu masih benar
            System.out.println(i);
            i++; // i=sesuatu yg ingin kamu masukkan ke dalam while
        }

        int l = 0;
        do { // Do/While pengulangan ini akan menjalankan blok kode sekali sebelum memeriksa apakah kondisinya benar dan akan mengulangi pengulangan selama kondisi masih benar
            System.out.println(l);
            l++;
        }
        while (l<5);

        // Contoh kasus 1 > Menampilkan bilangan ganjil 1-10
        int r = 1;
        while (r<=10) {
            if(r%2!=0) {
                System.out.println(r);
            }
            r++;
        }
        // Contoh kasus 2 > Menjumlahkan bilangan 1-100
        int e = 1;
        int sum = 0;
        while (e<=100) {
            sum += e;
            e++;
        }
        System.out.println("Jumlah bilangan 1-100 adalah :"+ sum);

        // Contoh kasus 3 > Menampilkan perkalian tabel 5
        int w = 1;
        while (w<=10) {
            int hasil = 5*w;
            System.out.println("5x"+w+"="+hasil);
            w++;
        }

        // Contoh kasuh 4 > Menentukkan faktorial pada sebuah bilangan
        int bilangan = 5;
        int faktorial = 1;
        int p = 1;
        while (p<=bilangan){
            faktorial *= p;
            p++;
        }
        System.out.println("Faktorial dari" + bilangan +"adalah: "+ faktorial);

        // Contoh kasus 5 > Mencari bilangan prima
        int bilangann = 17;
        boolean isPrime = true;
        int o= 2;
        while (o<=bilangann / 2) {
            if (bilangann % o ==0) {
                isPrime = false;
                break;
            }
            o++;
        }
        if (isPrime) {
            System.out.println(bilangann +" adalah bilangan prima.");
        } else {
            System.out.println(bilangann +" bukan bilangan prima.");
        }

        // FOR > perulangan ini digunakan untuk menhitung persis berapa kali kita ingin menjalankan suatu blok kode, perulangan ini juga berguna karena bisa menghemat waktu, mengurangi kesalahan dan membuat kode lebih mudah.
        // Struktur dasar perulangan for:
        // for (inisialisasi; kondisi;iterasi) {}
        // blok kode yang akan dijalankan

        // Contoh 1: Menampilkan angka 0-4
        for (int k =0; k <5;k++) {
            System.out.println(k);
        }

        // Contoh 2: Menampilkan angka genap 0-10
        for (int f = 0; f <=10;f=f+2) {
            System.out.println(f);
        }

        // Contoh 3: Perulangan bersarang (Nested Loop)
        for (int m = 1;m<=2;m++) {
            System.out.println("Outer: "+m); // Menjalankan 2x
        // Inner Loop
        for (int j= 1; j<= 3; j++) {
            System.out.println(" Inner: " +j); // Menjalankan 6x > (2*3)
        }
        }
    }
}