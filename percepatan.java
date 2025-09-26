import java.util.Scanner;

public class percepatan {
    private static Scanner scn = new Scanner (System.in);
    public static void main(String[] args) {
        //deklarasi variabel
        int v0, v1, deltaT;
        float percepatan;

        //input
        v0 = scn.nextInt();
        v1 = scn.nextInt();
        deltaT = scn.nextInt();

        //proses
        percepatan = (float) (v1 - v0 ) / deltaT;

        //output
        System.out.println(percepatan);
    }
}
