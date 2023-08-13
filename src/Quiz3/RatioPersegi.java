package Quiz3;

import java.util.Scanner;

public class RatioPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r1 = input.nextInt();
        int r2 = input.nextInt();
        int r3 = input.nextInt();
        double s = input.nextDouble();

        double rat = (double) s / r1;

        double luas1 = rat * rat;
        double luas2 = (rat * r2) * (rat * r2);
        double luas3 = (rat * r3) * (rat * r3);

        double totalLuas = luas1 + luas2 + luas3;
        System.out.printf("%.2f%n", totalLuas);
    }
}