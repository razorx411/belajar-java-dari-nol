
package belajar;

import java.util.Scanner;

/**
 *
 * @author Hafid Fathurrohman
 */
public class BELAJAR {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nilai[] = new int [5];
        for (int i=0; i<5; i++){
            System.out.println("Input Nilai = ");
            nilai[i]=s.nextInt();
        }
        System.out.println("DAFTAR NILAI MAHASISWA");
        for (int i=0; i<5; i++){
            System.out.println((i+1)+". "+nilai[i]);
        }
    }
}

