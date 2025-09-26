import java.util.Scanner;

public class nilaiIPK {
    private static Scanner scn = new Scanner (System.in);
    public static void main(String[] args) {
        float ipk;
        String keterangan;

        System.out.println("masukkan nilai IPK anda: ");
        ipk = scn.nextFloat();
        
        if (ipk >= 3.5 && ipk <= 4.0) { 
            keterangan = "sangat memuaskan";
        } else if (ipk >=3.0 && ipk <3.5) {
            keterangan = "memuaskan";
        } else if (ipk >= 2.5 && ipk < 3.0) {
            keterangan = "baik sekali";
        } else if (ipk >= 2.0 && ipk < 2.5) {
            keterangan = "baik";
        } else {
            keterangan = "kurang";
        }

        System.out.println("IPK: " +ipk);
        System.out.println("keterangan: " +keterangan);
    }
}
