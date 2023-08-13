package Quiz1;

import java.util.Scanner;

public class DeretAngka {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x, y;
        x = input.nextInt();
        y = input.nextInt();

        for(int i = x; i <= y; i++){
            System.out.print(i + " ");
        }
    }
}
