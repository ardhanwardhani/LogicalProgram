package Quiz1;

import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num;

        num = input.nextInt();

        if(num >= 0 && num <= 100){
            if(num == 0){
                System.out.print("nol");
            } else if(num % 2 == 0){
                System.out.print("genap");
            }else {
                System.out.println("ganjil");
            }
        }
    }
}