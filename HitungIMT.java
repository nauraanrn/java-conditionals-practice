import java.util.Scanner;

public class HitungIMT {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);

        System.out.print("Berat badan (kg) : ");
        float berat = scn.nextFloat();

        System.out.print("Tinggi badan (m) : ");
        float tinggi = scn.nextFloat();

        float imt = berat / (tinggi * tinggi);

        if (imt <= 18.5) {
            System.out.printf("IMT = %-10.2f %20s\n", imt, "Termasuk kurus");
        } else if (imt > 18.5 && imt <= 25) {
            System.out.printf("IMT = %-10.2f %20s\n", imt, "Termasuk normal");
        } else if (imt > 25 && imt <= 30) {
            System.out.printf("IMT = %-10.2f %20s\n", imt, "Termasuk gemuk");
        } else {
            System.out.printf("IMT = %-10.2f %20s\n", imt, "Termasuk kegemukan");
        }
    }
}
