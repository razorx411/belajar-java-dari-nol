import java.util.Scanner;

/**
 *
 * @author Hafid Fathurrohman
 */
public class BelajarArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int nilai[], x, jumlah = 0;
        double rata2;

        System.out.print("Input x = ");
        x = s.nextInt();

        nilai = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.print("Input Nilai = ");
            nilai[i] = s.nextInt();
        }

        for (int i = 0; i < x; i++) {
            jumlah = jumlah + nilai[i];
        }

        rata2 = (double) jumlah / x;

        System.out.println("NILAI RATA2: " + rata2);
    }
}
