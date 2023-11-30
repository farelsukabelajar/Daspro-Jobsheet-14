import java.util.Scanner;

public class Tugas1 {

    /*
     * Fungsi rekursif
     */
    static void deretRekursif(int n) {

        if (n >= 0) {
            System.out.print(n + " ");
            deretRekursif(n - 1);
        }
    }

    /*
     * Fungsi iteratif
     */
    static void deretIteratif(int n) {

        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    /*
     * Fungsi main
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input nilai
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        // Memanggil fungsi rekursif
        System.out.print("Deret Descending Rekursif: ");
        deretRekursif(n);
        System.out.println();

        // Memanggil fungsi iteratif
        System.out.print("Deret Descending Iteratif: ");
        deretIteratif(n);
        System.out.println();

        sc.close();
    }
}
