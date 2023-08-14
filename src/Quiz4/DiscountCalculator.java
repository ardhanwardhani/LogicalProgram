package Quiz4;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qtyBarang, discount = 15;
        double hargaBarang, total;

        hargaBarang = input.nextDouble();
        qtyBarang = input.nextInt();

        if((hargaBarang >= 10000 && hargaBarang <= 1000000) && (qtyBarang >= 1 && qtyBarang <= 100)){
            if(qtyBarang % 3 == 0 && qtyBarang % 4 == 0){
                total = (hargaBarang * qtyBarang) - ((hargaBarang * qtyBarang * discount)/100);
            }else {
                total = hargaBarang * qtyBarang;
            }
            System.out.printf("%.2f%n", total);
        }
    }
}
