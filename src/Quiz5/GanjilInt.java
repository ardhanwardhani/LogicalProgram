package Quiz5;

import java.util.Scanner;

public class GanjilInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] data = new int[4][4];
        int ganjil = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                data[i][j] = input.nextInt();
                if(!(data[i][j] % 2 == 0)){
                    ganjil += 1;
                }
            }
        }

        System.out.println(ganjil);
    }
}