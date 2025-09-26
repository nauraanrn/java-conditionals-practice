import java.util.Scanner;

public class HitungListrik {
    public static Scanner scn = new Scanner (System.in);
    public static void main(String[] args) {
        String nama, kelurahan;
        int kwhAwal, kwhAkhir, biaya, ppjPersen, pemakaian, tarif;
        float ppj, total;

        System.out.println("Program penghitung pemakaian listrik sederhana");
        System.out.printf("%-35s: ", "Masukkan nama");
        nama = scn.nextLine();

        System.out.printf("%-35s: ", "Kelurahan");
        kelurahan = scn.nextLine();

        System.out.printf("%-35s: ", "Masukkan posisi awal Kwh Meter");
        kwhAwal = scn.nextInt();

        System.out.printf("%-35s: ", "Masukkan posisi akhir Kwh Meter");
        kwhAkhir = scn.nextInt();

        System.out.printf("%-35s: ", "Masukkan biaya beban saat ini");
        biaya = scn. nextInt();

        System.out.printf("%-35s: ", "Masukkan PPJ (dalam persen)");
        ppjPersen = scn.nextInt();

        pemakaian = kwhAkhir - kwhAwal;
        tarif = biaya * pemakaian;
        ppj = (ppjPersen / 100f) * tarif;
        total = tarif + ppj;

        System.out.println("==================== PLN Java ====================");
        System.out.printf("%-20s: %s\n", "Nama", nama);
        System.out.printf("%-20s: %s\n", "Kelurahan", kelurahan);
        System.out.printf("%-20s: %d kWh Meter\n", "Pemakaian bulan ini", pemakaian);
        System.out.printf("%-20s: Rp %,d,-\n", "Tarif Listrik", tarif);
        System.out.printf("%-20s: Rp %,d,-\n", "PPJ " + ppjPersen + "%", (int) ppj);
        System.out.printf("%-20s: Rp %,d,-\n", "Total Bayar", (int) total);
    }
}
