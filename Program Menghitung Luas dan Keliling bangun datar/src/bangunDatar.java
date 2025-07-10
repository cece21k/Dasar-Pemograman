import java.util.Scanner;

public class bangunDatar {
    static double phi = 3.14;

    static double kelilingPersegi(double sisi) {
        return 4 * sisi;
    }

    static double luasPersegi(double sisi) {
        return sisi * sisi;
    }

    static double kelilingPersegiPanjang(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    static double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    static double kelilingJajarGenjang(double sisiJajar1, double sisiJajar2, double sisiJajar3, double sisiJajar4) {
        return sisiJajar1 + sisiJajar2 + sisiJajar3 + sisiJajar4;
    }

    static double luasJajarGenjang(double alasJajar, double tinggiJajar) {
        return alasJajar * tinggiJajar;
    }

    static double kelilingSegitiga(double sisi1, double sisi2, double sisi3) {
        return sisi1 + sisi2 + sisi3;
    }

    static double luasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    static double kelilingBelahKetupat(double sisiBK1, double sisiBK2, double sisiBK3, double sisiBK4) {
        return sisiBK1 + sisiBK2 + sisiBK3 + sisiBK4;
    }

    static double luasBelahKetupat(double d1, double d2) {
        return 0.5 * d1 * d2;
    }

    static double kelilingLayanglayang(double sisiL1, double sisiL2, double sisiL3, double sisiL4) {
        return sisiL1 + sisiL2 + sisiL3 + sisiL4;
    }

    static double luasLayanglayang(double diagonal1, double diagonal2) {
        return 0.5 * diagonal1 * diagonal2;
    }

    static double kelilingTrapesium(double sisiT1, double sisiT2, double sisiT3, double sisiT4) {
        return sisiT1 + sisiT2 + sisiT3 + sisiT4;
    }

    static double luasTrapesium(double sisiT1, double sisiT2, double tT) {
        return 2 * (sisiT1 + sisiT2) + tT;
    }

    static double kelilingJarijari(double jari) {
        return 2 * phi * jari;
    }

    static double luasJarijari(double jari) {
        return phi * jari * jari;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Pilih Bangun Datar :   \n1. Persegi \n2. Persegi Panjang \n3. Jajar Genjang \n4. Segitiga \n5. Belah Ketupat \n6. Layang-Layang \n7. Trapesium \n8. Lingkaran. ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1: // Persegi
                System.out.print("Masukkan sisi Persegi : ");
                double sisi = scanner.nextDouble();
                System.out.println("Keliling : " + kelilingPersegi(sisi));
                System.out.println("Luas : " + luasPersegi(sisi));
                break;
            case 2:// Persegi Panjang
                System.out.print("Masukkan Panjang Persegi : ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan Lebar Persegi Panjang : ");
                double lebar = scanner.nextDouble();
                System.out.println("Keliling : " + kelilingPersegiPanjang(panjang, lebar));
                System.out.println("Luas : " + luasPersegiPanjang(panjang, lebar));
                break;
            case 3: // Jajar Genjang
                System.out.print("Masukkan Sisi Jajar Genjang 1 : ");
                double sisiJajar1 = scanner.nextDouble();
                System.out.print(" Masukkan Sisi Jajar Genjang 2: ");
                double sisiJajar2 = scanner.nextDouble();
                System.out.print("Masukkan Sisi Jajar Genjang 3 : ");
                double sisiJajar3 = scanner.nextDouble();
                System.out.print("Masukkan Sisi Jajar Genjang 4 : ");
                double sisiJajar4 = scanner.nextDouble();
                System.out.println("Keliling : " + kelilingJajarGenjang(sisiJajar1, sisiJajar2, sisiJajar3, sisiJajar4));

                System.out.print("Masukkan Alas Jajar : ");
                double alasJajar = scanner.nextDouble();
                System.out.print("Masukkan Tinggi Jajar : ");
                double tinggiJajar = scanner.nextDouble();
                System.out.println("Luas : " + luasJajarGenjang(alasJajar, tinggiJajar));
                break;
            case 4: // Segitiga
                System.out.print("Masukkan Sisi Segitiga 1 : ");
                double sisi1 = scanner.nextDouble();
                System.out.print(" Masukkan Sisi Segitiga 2: ");
                double sisi2 = scanner.nextDouble();
                System.out.print("Masukkan Sisi Segitiga 3 : ");
                double sisi3 = scanner.nextDouble();
                System.out.println("Keliling : " + kelilingSegitiga(sisi1, sisi2, sisi3));

                System.out.print("Masukkan Alas Segitiga : ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan Tinggi Segitiga : ");
                double tinggi = scanner.nextDouble();
                System.out.println("Luas : " + luasSegitiga(alas, tinggi));
                break;
            case 5: // Belah Ketupat
                System.out.print("Masukkan Sisi Belah Ketupat 1 : ");
                double sisiBelah1 = scanner.nextDouble();
                System.out.print(" Masukkan Sisi Belah Ketupat 2: ");
                double sisiBelah2 = scanner.nextDouble();
                System.out.print("Masukkan Sisi Belah Ketupat 3 : ");
                double sisiBelah3 = scanner.nextDouble();
                System.out.print("Masukkan Sisi Belah Ketupat 4 : ");
                double sisiBelah4 = scanner.nextDouble();
                System.out.println("Keliling : " + kelilingBelahKetupat(sisiBelah1, sisiBelah2, sisiBelah3, sisiBelah4));
                // D = Diagonal
                System.out.print("Masukkan D1 Belah Ketupat : ");
                double d1 = scanner.nextDouble();
                System.out.print("Masukkan D2 Belah Ketupat : ");
                double d2 = scanner.nextDouble();
                System.out.println("Luas : " + luasBelahKetupat(d1, d2));
                break;
            case 6: // Layang-Layang
                System.out.print("Masukkan Sisi Layang-layang 1 : ");
                double sisiL1 = scanner.nextDouble();
                System.out.print(" Masukkan Sisi Layang-layang 2: ");
                double sisiL2 = scanner.nextDouble();
                System.out.print("Masukkan Sisi Layang-layang 3 : ");
                double sisiL3 = scanner.nextDouble();
                System.out.print("Masukkan Sisi Layang-layang 4 : ");
                double sisiL4 = scanner.nextDouble();
                System.out.println("Keliling : " + kelilingLayanglayang(sisiL1, sisiL2, sisiL3, sisiL4));
                // D = Diagonal
                System.out.print("Masukkan D1 Layang-layang : ");
                double d1L = scanner.nextDouble();
                System.out.print("Masukkan D2 Layang-layang : ");
                double d2L = scanner.nextDouble();
                System.out.println("Luas : " + luasLayanglayang(d1L, d2L));
                break;
            case 7: // Trapesium
                System.out.print("Masukkan Sisi Trapesium 1 : ");
                double sisiT1 = scanner.nextDouble();
                System.out.print(" Masukkan Sisi Trapesium 2: ");
                double sisiT2 = scanner.nextDouble();
                System.out.print("Masukkan Sisi Trapesium 3 : ");
                double sisiT3 = scanner.nextDouble();
                System.out.print("Masukkan Sisi Trapesium 4 : ");
                double sisiT4 = scanner.nextDouble();
                System.out.println("Keliling : " + kelilingTrapesium(sisiT1, sisiT2, sisiT3, sisiT4));

                System.out.print("Masukkan Sisi Trapesium 1 : ");
                double sT1 = scanner.nextDouble();
                System.out.print("Masukkan Sisi Trapesium 2 : ");
                double sT2 = scanner.nextDouble();
                System.out.print("Masukkan Tinggi Trapesium : ");
                double tT = scanner.nextDouble();
                System.out.println("Luas : " + luasTrapesium(sT1, sT2, tT));
                break;
            case 8: // Lingkaran
                System.out.print("Masukkan Jari-Jari Lingkaran : ");
                double jari = scanner.nextDouble();
                System.out.println("Keliling : " + kelilingJarijari(jari));
                System.out.println("Luas : " + luasJarijari(jari));
                break;
            default:
                System.out.println("Bangun Datar Tidak Valid.");
        }
        scanner.close();
    }
}