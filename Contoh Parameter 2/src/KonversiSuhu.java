import java.util.Scanner;

public class KonversiSuhu {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam Celsius: ");
        double suhuCelsius = scanner.nextDouble();
        double suhuFahrenheit = konversiSuhuCelsiusToFahrenheit(suhuCelsius);
        System.out.println("Suhu dalam Fahrenheit:" + suhuFahrenheit);
        double suhuKelvin = konversiSuhuCelsiusToKelvin(suhuCelsius);
        System.out.println("Suhu dalam Kelvin: " + suhuKelvin);

        scanner.close();
    }
        public static double konversiSuhuCelsiusToFahrenheit ( double celsius){
            double fahrenheit = (celsius * 9 / 5) + 32;
            return fahrenheit;
        }
        public static double konversiSuhuCelsiusToKelvin ( double celsius){
            double kelvin = celsius + 273.15;
            return kelvin;
        }
}