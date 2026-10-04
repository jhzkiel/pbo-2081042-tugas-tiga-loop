import java.util.Scanner;

public class TigaLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Batas deret (n) : ");
        int n = input.nextInt();

        System.out.println();
        System.out.println("===== SATU DERET, TIGA LOOP =====");

        // ---------- BAGIAN 1: tiga versi deret 1..n ----------
        System.out.print("for      : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("while    : ");
        int j = 1;
        while (j <= n) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        System.out.print("do-while : ");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= n);
        System.out.println();

        // ---------- BAGIAN 2: meleset satu (off-by-one) ----------
        System.out.println();

        int kurang = 0;
        for (int i = 1; i < n; i++) {
            kurang++;
        }
        int kurangSama = 0;
        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }
        System.out.println("i <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");

        // ---------- BAGIAN 3: saring deret 1..10 dengan continue dan break ----------
        System.out.print("Disaring :");
        int dicetak = 0; // menghitung berapa kali print benar-benar tercapai
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // lewati angka genap
            }
            if (i > 7) {
                break; // berhenti kalau i > 7
            }
            System.out.print(" " + i);
            dicetak++;
        }
        System.out.println();
        System.out.println("Sampai println  : " + dicetak + " kali");

        input.close();
    }

    /*
     * ---------- HASIL PERCOBAAN (ketentuan 2) ----------
     * Percobaan 1, n = 5:
     *
     * Batas deret (n) : 5
     *
     * ===== SATU DERET, TIGA LOOP =====
     * for      : 1 2 3 4 5
     * while    : 1 2 3 4 5
     * do-while : 1 2 3 4 5
     *
     * i <  n berputar : 4 kali
     * i <= n berputar : 5 kali
     * Disaring : 1 3 5 7
     * Sampai println  : 4 kali
     *
     * Percobaan 2, n = 0:
     *
     * Batas deret (n) : 0
     *
     * ===== SATU DERET, TIGA LOOP =====
     * for      :
     * while    :
     * do-while : 1
     *
     * i <  n berputar : 0 kali
     * i <= n berputar : 0 kali
     * Disaring : 1 3 5 7
     * Sampai println  : 4 kali
     *
     * Kesimpulan: do-while mengecek kondisinya sesudah badan loop dijalankan,
     * jadi badannya pasti jalan minimal sekali (makanya saat n = 0 hanya
     * do-while yang masih mencetak 1).
     *
     * ---------- PENJELASAN (ketentuan 5) ----------
     * Loop tidak berhenti di i = 8 karena 8 genap, jadi continue jalan duluan
     * dan langsung lompat ke putaran berikutnya sebelum sempat sampai ke
     * pengecekan break. Break baru tercapai saat i = 9 (ganjil dan > 7).
     * Karena continue ada di atas break, angka genap tidak pernah
     * menyentuh kondisi break.
     */
}