import java.util.Scanner;

public class HitungLuasKeliling {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);

        System.out.println("Perhitungan Luas dan Keliling yang tersedia");
        System.out.println("Menu :");
        System.out.println("1. Menghitung luas dan keliling persegi panjang");
        System.out.println("2. Menghitung luas dan keliling lingkaran");
        System.out.println("3. Menghitung luas dan keliling segitiga");

        System.out.print("Pilihan anda : ");
        int pilihan = scn.nextInt();
        

        switch (pilihan) {
            case 1:
                System.out.println();
                System.out.print("Masukkan a : ");
                int a = scn.nextInt();
                System.out.print("Masukkan b : ");
                int b = scn.nextInt();

                int keliling_persegi_panjang = 2 * (a + b);
                int luas_persegi_panjang = a * b;
                
                System.out.println();
                System.out.println("Keliling persegi panjang : " +keliling_persegi_panjang);
                System.out.println("Luas persegi panjang : " +luas_persegi_panjang);
            break;
            case 2:
                System.out.println();
                System.out.print("Masukkan r : ");
                int r = scn.nextInt();

                double keliling_lingkaran = 2 * Math.PI * r;
                double luas_lingkaran = Math.PI * r * r;

                System.out.println();
                System.out.printf("Keliling lingkaran : %.2f\n", keliling_lingkaran);
                System.out.printf("Luas lingkaran : %.2f\n", luas_lingkaran);
            break;
            case 3:
                System.out.println();
                System.out.print("Masukkan a (alas) : ");
                int sisiA = scn.nextInt();
                System.out.print("Masukkan b (tinggi) : ");
                int sisiB = scn.nextInt();
                System.out.print("Masukkan sisi c (sisi miring) : ");
                int sisiC = scn.nextInt();

                int keliling_segitiga = sisiA + sisiB + sisiC;
                double luas_segitiga = 0.5 * sisiA * sisiB;

                System.out.println();
                System.out.println("Keliling segitiga : " + keliling_segitiga);
                System.out.println("Luas segitiga : " + luas_segitiga);
            break;

            default: 
                System.out.println("Data tidak ditemukan, program dihentikan ... ");
        }
    }
}
