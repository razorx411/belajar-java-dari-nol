//Hafid Fathurrohman
public class BalikArray {
    public static void main(String[] args) {
        int asal[] = {1,0,8,9};
        int bantuan[] = new int[4];
        int j = 0;

        System.out.print("AWAL : ");
        for (int i = 0; i < asal.length; i++) {
            System.out.print(asal[i] + " ");
        }
        System.out.println("");

        for (int i = asal.length - 1; i >= 0; i--) {
            bantuan[j] = asal[i];
            j++;
        }

        asal = bantuan;
        System.out.print("AKHIR : ");
        for (int i = 0; i < asal.length; i++) {
            System.out.print(asal[i] + " ");
        }
        System.out.println("");
    }
}


