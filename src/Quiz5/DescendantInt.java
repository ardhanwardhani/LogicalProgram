package Quiz5;

import java.util.Scanner;

public class DescendantInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // initialize variable array
        int[] nums = new int[3];

        // input nilai
        for(int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        int[] sortArray = new int[3];
        int nilaiTertinggi = 0;
        for(int j = 0;j < nums.length; j++){
            if(nums[j] >= -300 && nums[j] <= 300){
                if(nums[j] > nilaiTertinggi){
                    nilaiTertinggi = nums[j];
                    sortArray[j] = nilaiTertinggi;
                }
            }
        }
        for(int x = 0; x < sortArray.length; x++){
            System.out.print(sortArray[x]);
        }
    }
}
