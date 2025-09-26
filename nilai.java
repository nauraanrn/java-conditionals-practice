import java.util.Scanner;

public class nilai {
    private static Scanner scn = new Scanner (System.in);
    public static void main(String[] args) {
        float nilai;

        System.out.println("masukkan nilai: ");
        nilai = scn.nextFloat();

        if (nilai >= 75) {
            if (nilai >= 90){
                System.out.println("lulus dengan predikat tinggi");
            } else {
                System.out.println("lulus dengan predikat cukup");
            }
        } else {
            System.out.println("tidak lulus");
        }
    }
}
