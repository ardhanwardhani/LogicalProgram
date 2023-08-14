package Quiz5;

import java.util.Scanner;
public class HolesAlphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kalimat = input.next();

        if(kalimat.length() <= 50){
            int holes = 0;
            for(int i = 0; i < kalimat.length(); i++){
                char huruf = kalimat.charAt(i);

                switch (huruf){
                    case 'A':
                    case 'D':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                        holes += 1;
                        break;
                    case 'B':
                        holes += 2;
                        break;
                    default:
                        holes += 0;
                        break;
                }
            }
            System.out.println(holes);
        }
    }
}
