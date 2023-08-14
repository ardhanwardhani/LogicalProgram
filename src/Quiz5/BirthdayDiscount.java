package Quiz5;

import java.util.Scanner;

public class BirthdayDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tglLahir;
        double harga,discount;

        harga = input.nextDouble();
        tglLahir = input.nextInt();

        double totalPurchase = harga;

        if(harga >= 50000){
            discount = (double) (2 * tglLahir * harga) / 100;
            totalPurchase =  harga - discount;
        }

        System.out.printf("%.2f%n", totalPurchase);

    }
}
