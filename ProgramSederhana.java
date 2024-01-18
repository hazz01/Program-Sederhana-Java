import java.util.Scanner;

public class ProgramSederhana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai: ");
        int jumlahNilai = scanner.nextInt();

        var nilai = new int[jumlahNilai];

        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextInt();
        }

        var total = 0;

        for (int i = 0; i < jumlahNilai; i++) {
            total += nilai[i];
        }

        var rataRata = (double) total / jumlahNilai;

        var kategori = "";
        if (rataRata >= 80) {
            kategori = "A";
        } else if (rataRata >= 60) {
            kategori = "B";
        } else if (rataRata >= 40) {
            kategori = "C";
        } else {
            kategori = "D";
        }

        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Kategori: " + kategori);

    }
}
