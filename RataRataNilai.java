import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        int totalNilai = 0;
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            int nilai = scanner.nextInt();
            totalNilai += nilai;
        }

        double rataRata = (double) totalNilai / jumlahMahasiswa;
        System.out.println("Maka, Rata-rata Nilainya adalah " + rataRata);

        // Tambahkan credit
        System.out.println("\nDeveloped by Furkotun Najiyah");
    }
}
