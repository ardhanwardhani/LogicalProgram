package Quiz2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VolumeTabung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");

        double r, t, volume;

        r = input.nextDouble();
        t = input.nextDouble();

        if((r > 0 && r <= 100) && (t > 0 && t <= 100)){
            volume = 3.14 * Math.pow(r, 2)  * t;
            System.out.print(decimal.format(volume));
        }
    }
}
