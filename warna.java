import java.util.Scanner;

public class warna {
    private static Scanner scn = new Scanner (System.in);
    public static void main(String[] args) {
        int angka;

        System.out.println("masukkan angka: ");
        angka = scn.nextInt();
        switch (angka) {
            case 1:
            System.out.println("merah");
            break;

            case 2:
            System.out.println("kuning");
            break;

            case 3:
            System.out.println("hijau");
            break;
            
            default:
            System.out.println("pilihan tidak valid");
        }
        
        if (angka == 1) {
            System.out.println("merah");
        } else if (angka ==2) {
            System.out.println("kuning");
        } else if (angka == 3) {
            System.out.println("hijau");
        } else {
            System.out.println("pilihan tidak valid");
        }
    }
}
