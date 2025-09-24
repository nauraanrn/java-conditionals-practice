import java.io.*;
import java.util.*;

public class Biaya {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);

        int kodeFakultas, biayaDasar = 0;
        String namaFakultas = "", status;
        double ipk, potonganIPK = 0, hargaDiskon, totalBiaya;
        boolean beasiswa;
        
        ipk = scn.nextFloat();
        kodeFakultas = scn.nextInt();
        beasiswa = scn.nextBoolean();

        switch (kodeFakultas) {
            case 1:
                namaFakultas = "IJK";
                biayaDasar = 7500000;
                potonganIPK = 0.10;
                break;
            case 2:
                namaFakultas = "MNO";
                biayaDasar = 6000000;
                potonganIPK = 0.15;
                break;
            case 3:
                namaFakultas = "XYZ";
                biayaDasar = 8000000;
                potonganIPK = 0.20;
                break;
        }

        if (ipk >= 3.75) {
            hargaDiskon = biayaDasar * (1 - potonganIPK);
        } else {
            hargaDiskon = biayaDasar;
        }

        if (beasiswa) {
            totalBiaya = hargaDiskon - 2000000;
        } else {
            totalBiaya = hargaDiskon;
        }

        if (totalBiaya <= 5000000) {
            status = "Sangat Terjangkau";
        } else if (totalBiaya > 500000 && totalBiaya <= 7000000) {
            status = "Terjangkau";
        } else {
            status = "Sangat Mahal";
        }

        System.out.println("Fakultas: " + namaFakultas);
        System.out.println("Total Biaya Kuliah: Rp" + (int) totalBiaya);
        System.out.println("Status: " + status);
    }
}