package Quiz1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcBankInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat numformat = new DecimalFormat("0.00");

        int biayaAwal, bunga;
        double total;
        biayaAwal = input.nextInt();
        bunga = input.nextInt();

        if((biayaAwal >= 0 && biayaAwal <= 150000) && (bunga >= 0 && bunga <= 100)){
            total = (double) biayaAwal + ((biayaAwal * bunga) / 100);
            System.out.print(numformat.format(total));
        }
    }
}
