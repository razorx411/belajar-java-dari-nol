/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajararray;

import java.util.Scanner;

/**
 *
 * @author Hafid Fathurrohman
 */
public class BelajarArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double nilai[] = new double [5];
        for (int i=0; i<5; i++){
            System.out.println("Input Nilai = ");
            nilai[i]=s.nextDouble();
        }
        System.out.println("DAFTAR RATING TERBARU 5 PENGGUNA WEB ILMU2");
        for (int i=0; i<5; i++){
            System.out.println((i+1)+". "+nilai[i]);
        }
    }
    
}
