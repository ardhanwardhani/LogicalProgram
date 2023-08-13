package Quiz3;

import java.util.Scanner;

public class CekMaxValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // variabel array
        int[] numbers = new int[3];

        // proses input dengan looping
        for(int i = 0; i < numbers.length; i++){
            int num = input.nextInt();
            if(num >= -30 && num <= 30){
                numbers[i] = num;
            }
        }

        int max = numbers[0];

        // mecari nilai maksimal dengan looping dan percabangan if
        for(int j = 0; j < numbers.length; j++){
            if(numbers[j] > max){
                max = numbers[j];
            }
        }

        // output
        System.out.print(max);
    }
}
