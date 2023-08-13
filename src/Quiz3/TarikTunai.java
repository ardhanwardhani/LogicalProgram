package Quiz3;

import java.util.Scanner;

public class TarikTunai {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int tarik;
        double saldo;
        double admin = 0.5;

        tarik = input.nextInt();
        saldo = input.nextDouble();

        double total = tarik + admin;

        if(tarik%5 == 0 && total <= saldo){
            saldo = saldo - total;
            System.out.printf("%.2f%n", saldo);
        } else{
            System.out.printf("%.2f%n", saldo);
        }
    }
}