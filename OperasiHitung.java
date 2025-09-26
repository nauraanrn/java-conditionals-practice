import java.util.Scanner;

public class OperasiHitung {
    private static Scanner scn = new Scanner (System.in);
    public static void main(String[] args) {
        int operator1, operator2, hasilJumlah, hasilKurang, hasilKali;
        float hasilBagi;

        System.out.printf("%-30s: ", "Masukkan operator pertama");
        operator1 = scn.nextInt();

        System.out.printf("%-30s: ", "Masukkan operator kedua");
        operator2 = scn.nextInt();

        hasilJumlah = operator1 + operator2;
        hasilKurang = operator1 - operator2;
        hasilKali = operator1 * operator2;
        hasilBagi = (float) operator1 / operator2;

        System.out.printf("%-30s: %d\n", "Hasil penjumlahan", hasilJumlah);
        System.out.printf("%-30s: %d\n", "Hasil pengurangan", hasilKurang);
        System.out.printf("%-30s: %d\n", "Hasil perkalian", hasilKali);
        System.out.printf("%-30s: %.1f\n", "Hasil pembagian", hasilBagi);
    }
}
