package cariarray;


import java.util.Scanner;


public class CariArray{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int NPM[] = {165,166,167,168,169,170};
        int pilih, npm;
        boolean ketemu = false;
        do{
            System.out.println("Cari NPM");
            System.out.println("1. YES\n2. NO");
            System.out.println("Pilih = ");
            pilih = s.nextInt();
            if(pilih==1){
                System.out.print("Masukkan NPM = ");
                npm = s.nextInt();
                for (int i=0; i<NPM.length; i++){
                    if (npm==NPM[i]){
                        ketemu=true;
                        break;
                    }
                }
                if (ketemu) //ketemu bernilai true
                    System.out.println("NPM ada");
                else
                    System.out.println("NPM tidak ada T_T");
            }
            ketemu=false;
        }
        while(pilih!=2);
    }
}
