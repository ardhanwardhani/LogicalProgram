package Quiz3;

import java.util.Scanner;

public class KelipatanTigaEmpat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cek;

        int num = input.nextInt();

        if(num % 3 == 0 && num % 4 == 0){
            cek = 1;
        }else {
            cek = 0;
        }

        System.out.print(cek);
    }
}
