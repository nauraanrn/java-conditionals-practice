import java.util.Scanner;

public class konversiSuhu {
    private static Scanner scn = new Scanner (System.in);
    public static void main(String[] args) {
        int f, c;

        c = scn.nextInt();

        f = ( c * 9/5 ) + 32;

        System.out.println(f);
    }
}
