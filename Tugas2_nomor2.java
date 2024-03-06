import java.util.Scanner;

public class Tugas2_nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total detik: ");
        long totalDetik = input.nextLong();

        long detikSekarang = totalDetik % 60;
        long totalMenit = totalDetik / 60;
        long menitSekarang = totalMenit % 60;
        long totalJam = totalMenit / 60;
        long jamSekarang = totalJam % 24;

        System.out.println("Waktu: " + jamSekarang + ":" + menitSekarang + ":" + detikSekarang);

        input.close();
    }
}