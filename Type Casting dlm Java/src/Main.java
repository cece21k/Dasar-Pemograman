// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int angkaInt = 9;
        double angkaDouble = angkaInt;  // pengecoran otomatis: int double

        System.out.println(angkaInt); //Output 9
        System.out.println(angkaDouble); //Output 9.0

        int x = 100 + 50;// operator dlm java

        int total1 = 100+50; // 150 (100+50)
        int total2 = total1 + 250; // 400 (150+250)
        int total3 = total2 + total2; //800 (400+400)


        String salam = "Annyeong"; // String dalam java
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // panjang string
        System.out.println("Panjang string txt adalah:"+txt.length());

        String teks = "Halo Bts";
        System.out.println(teks.toUpperCase()); //Output "HALO BTS"
        System.out.println(teks.toLowerCase()); // Output "halo bts"

        String tekss = "Tolong temukan dimana 'temukan'terjadi!";
        System.out.println(tekss.indexOf("temukan")); //Output 7

        //penggabungan string
        String namaDepan = "Nisa";
        String namaBelakang = "Sofiani";
        System.out.println(namaDepan+""+namaBelakang);

        //Bisa Juga dgn metode Concat()
        String namaaDepan = "Nisa";
        String namaaBelakang = "Sofiani";
        System.out.println(namaaDepan.concat(namaaBelakang));

        // Menambahkan angka dan string dalam java
        int p = 10;
        int k = 20;
        int o = p+k; // o akan menjadi 30 (sebuah bilangan bulat/anka)
        //dgn string
        String u = "10";
        String i = "20";
        String g = u+i; // g akan menjadi "1020" (sebuah string)

        //string dan angka
        String r = "10";
        int y = 20;
        String z = r+y;//z akan menjadi "1020"(sebuah string)

        //String karakter khusus
        String txtt = "We are the so-called \"Vikings\" from the north.";
        String txxt = "It\'s alright.";
        String ttxt = "The character\\is called backslash.";

        //Java Math
        Math.max(5,10);
        Math.min(5,10);
        Math.sqrt(64);
        Math.abs(-4.7);
        Math.random();
        int ankaAcak = (int)(Math.random()*101); //0 hingga 100

        // Java Booleans
        boolean apakahJavaMenyenangkan = true;
        boolean apakahIkanEnak = false;

        System.out.println(apakahJavaMenyenangkan); // Output true
        System.out.println(apakahIkanEnak); // Output False

        //ekspresi boolean
        int m = 10;
        int n= 9;
        System.out.println(m>n); // menggambarkan true, karna 10 lebih tinggi dari 9
        //atau
        System.out.println(10>9);

        int v = 10;
        System.out.println(v==10);
        System.out.println(10==15);

        //contoh
        int usiaSaya = 20;
        int batasUsiaMemilih = 15;
        System.out.println(usiaSaya >= batasUsiaMemilih);

        int usiaSayaa = 20;
        int batasUsiaMemilihh = 15;

        if (usiaSayaa >= batasUsiaMemilihh){
            System.out.println("Cukup tua untuk memilih!");
        } else {
            System.out.println("Belum cukup tua untuk memilih");
        }



    }
}