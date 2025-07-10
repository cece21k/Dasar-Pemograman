// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int w = 5;
        int t = 6;
        System.out.println(w+t); //untuk nilai numerik,karakter+ berfungsi sebagai operator mtk dgn variabel int(integer)

int q =5; //contoh 1
int r = 6;
int g = 50;
System.out.println(q+r+g); //mendeklarasikan banyak variabel

        int f = 5, j = 6, l = 50;
        System.out.println(f+j+l); //contoh 2


        int x,y,z;
        x = y = z = 50;
        System.out.println(x+y+z); //satu nilai untuk banyak variabel

        //identifier dalam java

        int menitPerJam = 60; //bagus

        int m = 60; // oke but tidak mudah dipahami apa itu m

        //tipe data dalam java
        int myNum = 5; // Bilangan bulat
        float myFloatNum = 5.99f; // Bilangan desimal
        char myLetter = 'D'; // karakter
        boolean myBool = true; // Boolean
        String myText = "Hello"; // Teks

        // Tipe data integer
        // Byte

        byte myNum1 = 100;
        System.out.println(myNum1);

        // Short
        short myNum2 = 5000;
        System.out.println(myNum2);

        // Int
        int myNum3 = 100000;
        System.out.println(myNum3);

        // Long
        long myNum4 = 150000000000L;
        System.out.println(myNum4);

// Tipe data floating point
float myNum5 = 5.75f; // Float
System.out.println(myNum5);

// double
double myNum6 = 19.99d;
System.out.println(myNum6);

// e adalah angka ilmiah for show pangkat 10
float f1 = 35e3f; //f1 akan bernilai 35000 (35*10^3)
double d1 =12E4d; //d1 akan bernilai 120000 (12*10^4)
System.out.println(f1);
System.out.println(d1);

// Data Boolean
        boolean apakahJavaMenyenangkan = true;
        boolean apakahIkanEnak = false;

        System.out.println(apakahJavaMenyenangkan); // Output true
        System.out.println(apakahIkanEnak); // Output false


        // Karakter dalam Java
        char nilaiSaya = 'B';
        System.out.println(nilaiSaya);

        // dengan nilai ASCII
        char variabelSaya1 = 65, variabelSaya2 = 66, variabelSaya3 = 67;
        System.out.println(variabelSaya1);
        System.out.println(variabelSaya2);
        System.out.println(variabelSaya3);

        //string tipe digunakan untuk urutan karakter (teks)
        String sapaan = "Hello Wanita rich Bitch";
        System.out.println(sapaan);



    }
}