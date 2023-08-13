package Quiz2;

import java.util.Scanner;
public class DeretMenurun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;

        x = input.nextInt();
        y = input.nextInt();

        if((x >= 0 && x<= y) && (y >= x && y <= 100)) {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        }
    }
}
