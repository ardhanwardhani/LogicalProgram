package Quiz4;

import java.util.Scanner;

public class AlayConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kalimat = input.nextLine();

        String hasil = convertToAlay(kalimat);

        System.out.println(hasil);
    }

    public static String convertToAlay(String kalimat) {
        String hasil = "";

        for (int i = 0; i < kalimat.length(); i++) {
            char karakter = kalimat.charAt(i);

            switch (karakter) {
                case 'A':
                case 'a':
                    hasil += "4";
                    break;
                case 'I':
                case 'i':
                    hasil += "1";
                    break;
                case 'Z':
                case 'z':
                    hasil += "2";
                    break;
                case 'E':
                case 'e':
                    hasil += "3";
                    break;
                case 'G':
                case 'g':
                    hasil += "6";
                    break;
                case 'J':
                case 'j':
                    hasil += "7";
                    break;
                case 'B':
                case 'b':
                    hasil += "8";
                    break;
                default:
                    hasil += karakter;
                    break;
            }
        }
        return hasil;
    }
}