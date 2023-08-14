package Quiz4;

import java.util.Scanner;

public class ProgramKarcis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kasus, qtyKasus;

        // input
        kasus = input.nextInt();
        qtyKasus = input.nextInt();

        /*  Kasus
        *  1. Kehilangan karcis motor
        *  2. Tidak membawa STNK
        */

        // logic nested if
        if(kasus == 1){
            if(qtyKasus < 4 ){
                System.out.print("Serahkan KTP anda !!!");
            } else if (qtyKasus >= 4) {
                System.out.print("Bayar Denda 10000 !!!");
            }
        }else{
            System.out.print("Ambil STNK dulu !!!");
        }
    }
}