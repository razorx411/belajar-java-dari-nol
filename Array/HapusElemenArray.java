import java.util.Scanner;

public class HapusElemenArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int data[] = {1, 0, 8, 9, 6, 7, 9, 8}, indeks, i;

        System.out.print("Isi Array : ");
        for (i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.print("\nHapus indeks = ");
        indeks = s.nextInt();

        for (i = indeks; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }

        data[data.length - 1] = 0;

        System.out.print("Hasilnya : ");
        for (i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
}