import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        // Membuat scanner untuk input dari user
        Scanner input = new Scanner(System.in);

        // Meminta user untuk memasukkan tahun lahir
        System.out.print("Masukkan tahun lahir Anda: ");
        int tahunLahir = input.nextInt();

        // Mendapatkan tahun saat ini (misalkan 2024)
        int tahunSekarang = 2024;

        // Menghitung usia
        int usia = tahunSekarang - tahunLahir;

        // Menampilkan hasil usia
        System.out.println("Usia Anda adalah: " + usia + " tahun.");

        // Menutup scanner
        input.close();
    }
}
