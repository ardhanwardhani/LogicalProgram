package Quiz4;

import java.util.Scanner;
public class DeretBintang {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //variabel
        int panjang;


        // input
        panjang = input.nextInt();

        if (panjang >= 1 && panjang <= 10) {
            printStars(panjang);
        }
    }

    static void printStars(int panjang){
        for(int i = 1; i <= panjang; i++){
            for (int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
