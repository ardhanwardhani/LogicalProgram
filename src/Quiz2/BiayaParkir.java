package Quiz2;

import java.util.Scanner;

public class BiayaParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tipeKendaraan, durasi;

        tipeKendaraan = input.nextInt();
        durasi = input.nextInt();

        if(tipeKendaraan == 1){
            parkirMobil(durasi);
        } else if (tipeKendaraan == 2) {
            parkirMotor(durasi);
        }
    }

    static void parkirMobil(int durasi){
        int total = 0;
        int biayaMobil = 2000;

        if(durasi > 0 && durasi <= 24){
            if (durasi == 1){
                total = biayaMobil * durasi;
            } else if (durasi >= 2) {
                durasi = durasi - 1;
                biayaMobil = 1000;
                total = (biayaMobil * durasi) + 2000;
            }
        }
        System.out.print(total);
    }

    static void parkirMotor(int durasi){
        int total = 0;
        int biayaMotor = 1000;

        if(durasi > 0 && durasi <= 24){
            if (durasi == 1){
                total = biayaMotor * durasi;
            } else if (durasi >= 2) {
                durasi = durasi - 1;
                biayaMotor = 500;
                total = (biayaMotor * durasi) + 1000;
            }
        }
        System.out.print(total);
    }
}