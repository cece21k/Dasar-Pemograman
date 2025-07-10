public class Main {
    static void myMethod() { //kode yang akan dieksekusi
        System.out.println("Saya baru saja dieksekusi!");
    }

    public static void main(String[]args){
        myMethod(); //
        myMethod(); // bisa di panggil beberapa kali
        myMethod();
    }
}