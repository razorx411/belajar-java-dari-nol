
//@Hafid Fathurrohman
public class MaksMinArray {
    public static void main(String[] args) {
        int[] nilai = {1,3,5,7,9,1000};
        int maks, min;
        
        maks = nilai[0];
        min = nilai[0];
        
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > maks) {
                maks = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        
        System.out.println("Nilai Max : " + maks);
        System.out.println("Nilai Min : " + min);
    }
}

