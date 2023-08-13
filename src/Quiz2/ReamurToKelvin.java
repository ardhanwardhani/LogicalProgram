package Quiz2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ReamurToKelvin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");

        // variabel
        double suhuReamur, suhuKelvin;

        // input
        suhuReamur = input.nextDouble();

        // logic
        if(suhuReamur >= -273 && suhuReamur <= 80){
            suhuKelvin = (suhuReamur * 1.25) + 273;
            System.out.print(decimal.format(suhuKelvin));
        }
    }
}