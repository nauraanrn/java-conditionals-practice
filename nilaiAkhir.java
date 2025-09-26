import java.util.Scanner;

public class nilaiAkhir {
    private static Scanner scn = new Scanner (System.in);
    public static void main(String[] args) {
        int skor;
        float nilaiTugas, nilaiKuis, nilaiUAS, nilaiAkhir;
        String nilaiHuruf;

        System.out.println("masukkan nilai tugas: ");
        nilaiTugas = scn.nextFloat();

        System.out.println("masukkan nilai kuis: ");
        nilaiKuis = scn.nextFloat();

        System.out.println("masukkan nilai UAS: ");
        nilaiUAS = scn.nextFloat();

        if (nilaiKuis > nilaiUAS) {
            nilaiAkhir = (0.4f * nilaiKuis) + (0.4f * nilaiUAS) + (0.2f * nilaiTugas); 
        } else {
            nilaiAkhir = (0.3f * nilaiKuis) + (0.5f * nilaiUAS) + (0.2f * nilaiTugas); 
        }

        if (nilaiAkhir >= 85 && nilaiAkhir <= 100) { 
            skor = 4; nilaiHuruf = "A: sangat baik";
        } else if (nilaiAkhir >= 75 && nilaiAkhir < 85) { 
            skor = 3; nilaiHuruf = "B: baik";
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 75) { 
            skor = 2; nilaiHuruf = "C: cukup";
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 65) { 
            skor = 1; nilaiHuruf = "D: kurang";
        } else { 
            skor = 0; nilaiHuruf = "E: gagal";
        }
        
        System.out.println("nilai tugas: " +nilaiTugas + ", nilai kuis: " +nilaiKuis + ", nilai UAS: " +nilaiUAS);
        System.out.println("nilai akhir anda: " +nilaiAkhir);
        System.out.println("skor anda: " +skor + ", " +nilaiHuruf);
    }
}
