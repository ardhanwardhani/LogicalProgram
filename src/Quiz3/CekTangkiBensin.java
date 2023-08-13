package Quiz3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CekTangkiBensin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");

        int hargaBensin = 7600;
        int uang = 0;
        double kapasitas;

        uang = input.nextInt();
        kapasitas = input.nextDouble();

        double purchase = (double) uang/hargaBensin;

        if((uang >= 7600 && uang <= 76000) && (kapasitas >= 1 && kapasitas <= 10)){
            if(purchase > kapasitas){
                System.out.println(decimal.format(purchase));
                System.out.println("Bensin Berlebih");
            }else {
                System.out.println(decimal.format(purchase));
            }
        }
    }
}
