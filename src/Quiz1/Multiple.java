package Quiz1;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x, result;
        x = input.nextInt();

        if(x >= 0 && x <= 100){
            result = x * 2;
            System.out.println(result);
        }
    }
}
