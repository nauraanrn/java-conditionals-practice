import java.util.Scanner;

public class HitungUpahKerja {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);

        System.out.print("Jam kerja  : ");
        int jam_kerja = scn.nextInt();

        int upah, lembur, denda, total;

        if (jam_kerja < 50) {
            upah = jam_kerja * 5000;
            lembur = 0;
            denda = (50 - jam_kerja) * 1000;
            total = upah + lembur - denda;
        } else if (jam_kerja <= 60) {
            upah = jam_kerja * 5000;
            lembur = 0;
            denda = 0;
            total = upah + lembur - denda;
        } else {
            upah = jam_kerja * 5000;
            lembur = (jam_kerja - 60) * 1000;
            denda = 0;
            total = upah + lembur - denda;
        }

        System.out.printf("%-10s = Rp %d\n", "Upah", upah);
        System.out.printf("%-10s = Rp %d\n", "Lembur", lembur);
        System.out.printf("%-10s = Rp %d\n", "Denda", denda);
        System.out.println("-------------------------");
        System.out.printf("%-10s = Rp %d\n", "Total", total);
    }
}
