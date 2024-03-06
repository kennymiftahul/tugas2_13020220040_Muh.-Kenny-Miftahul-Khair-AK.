import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan NIM: ");
        int nim = scanner.nextInt();

        System.out.print("Masukkan Nama: ");
        String nama = br.readLine();

        System.out.print("Masukkan Jurusan: ");
        String jurusan = br.readLine();

        System.out.print("Masukkan Fakultas: ");
        String fakultas = br.readLine();

        System.out.println("Data Anda:");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Fakultas: " + fakultas);

        // Menggabungkan JOptionPane
        String nimJOptionPane = JOptionPane.showInputDialog("Masukkan NIM: ");
        String namaJOptionPane = JOptionPane.showInputDialog("Masukkan Nama: ");
        String jurusanJOptionPane = JOptionPane.showInputDialog("Masukkan Jurusan: ");
        String fakultasJOptionPane = JOptionPane.showInputDialog("Masukkan Fakultas: ");

        System.out.println("Data Anda dari JOptionPane:");
        System.out.println("NIM: " + nimJOptionPane);
        System.out.println("Nama: " + namaJOptionPane);
        System.out.println("Jurusan: " + jurusanJOptionPane);
        System.out.println("Fakultas: " + fakultasJOptionPane);
    }
}