package Quiz4;

import java.util.Scanner;

public class SatnightParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tipeKendaraan, durasi;
        // input 1 = mobil, 2 = motor
        tipeKendaraan = input.nextInt();

        // durasi > 0 & <= 24, jika > 8 disegel
        durasi = input.nextInt();

        if (durasi > 0 && durasi <= 24){
            if (durasi > 8){
                System.out.println("Disegel");
            }else {
                if(tipeKendaraan == 1){
                    parkirMobil(durasi);
                } else if (tipeKendaraan == 2) {
                    parkirMotor(durasi);
                }
            }
        }else {
            System.out.println("Input durasi tidak valid");
        }
    }
    static void parkirMobil(int durasi){
        int total;
        int biayaMobil = 1500;

        if (durasi > 5 && durasi <= 8){
            int hargaLanjutan =  500;
            int durasiTambahan = durasi - 5;
            total = (biayaMobil * durasi) + (hargaLanjutan * durasiTambahan);
            System.out.print(total);
        } else{
            total = biayaMobil * durasi;
            System.out.print(total);
        }
    }

    static void parkirMotor(int durasi) {
        int total;
        int biayaMotor = 1000;


        if (durasi > 5 && durasi <= 8) {
            int hargaLanjutan = 500;
            int durasiTambahan = durasi - 5;
            total = (biayaMotor * durasi) + (hargaLanjutan * durasiTambahan);
            System.out.print(total);
        } else {
            total = biayaMotor * durasi;
            System.out.print(total);
        }

    }
}