import java.util.Scanner;

public class StudiKasus1 {
    private static Scanner scn = new Scanner (System.in);
    public static void main(String[] args) {
        int gaji, usia;
        String status;

        System.out.println("masukkkan gaji anda: ");
        gaji = scn.nextInt();

        System.out.println("masukkan usia anda: ");
        usia = scn.nextInt();
        scn.nextLine();

        System.out.println("masukkan status anda: ");
        status = scn.nextLine();

        if (gaji >= 7000000 && status.equals("tetap") && usia >=20 && usia <= 60) {
            System.out.println("Rekening yang tersedia: Silver dan Premium");
        } else if (gaji >= 3000000 && gaji <= 7000000 && status.equals("tetap") && usia >=20 && usia <= 60) {
            System.out.println("Rekening yang tersedia: Silver");
        } else {
            System.out.println("Anda tidak layak membuka rekening");
        }
    }
}
