package Quiz1;

import java.util.Scanner;

public class WujudBenda {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int suhu;

        suhu = input.nextInt();

        if(suhu >= -150 && suhu <= 150){
            if(suhu >= 0 && suhu <= 100){
                System.out.print("berwujud cair");
            }else {
                System.out.print("berwujud non cair");
            }
        }
    }
}