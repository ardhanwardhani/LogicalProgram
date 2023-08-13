# Repositry ini berisi kumpulan program logika sederhana menggunakan Java

# Quiz 1
## 1. CalcBankInterest
Description :
Program ini untuk menghitung bunga pinjaman

Input :
```json
100000 // pinjaman
10 // persentase bunga
```
Output:
```json
110000.00 // total ynag harus dikembalikan
```
## 2. DeretAngka
Description :
Program ini untuk menampilkan deret angka

Input :
```json
1 // nilai awal
5 // nilai akhir
```
Output:
```json
1 2 3 4 5
```

## 3. GanjilGenap
Description :
Program ini untuk menampilkan keterangan apakah sebuah angka termasuk angka ganjil atau angka genap

Input :
```json
1 // nilai pertama
6 // nilai kedua
0 // nilai ketiga
```
Output:
```json
ganjil // keterangan nilai pertama
genap // keterangan nilai kedua
nol // keterangan nilai ketiga
```

## 4. Multiple
Description :
Program ini untuk mengkalikan angka yang diinput

Input :
```json
2
6
```
Output:
```json
4
12
```

## 5. WujudBenda
Description :
Program ini untuk menampilkan keterangan jenis suatu benda berdasarkan suhunya

Input :
```json
80
150
-150
```
Output:
```json
berwujud cair
berwujud non cair
berwujud non cair
```

## Quiz2
## 1. BiayaParkir
Description :
Program ini untuk menghitung biaya parkir berdasarkan jenis kendaraan dan durasi dengan ketentuan seperti berikut:
Jenis Kendaraan:
- Mobil
- Motor

Biaya Parkir 1 jam pertama :
- Mobil = 2000
- Motor = 1000

Tarif lanjutan :
- Mobil = 1000
- Motor = 500

Input :
```json
// test case pertama
1
3
// test case kedua
2
5
```
Output :
```json
4000 // result test case pertama
3000 // result test case kedua
```
## 2. DeretMenurun
Description :
Program ini untuk menampilkan deret angka secara menurun

Input :
```json
1 // nilai awal
5 // nilai akhir
```
Output:
```json
1
2
3
4
5
```
## 3. ReamurToKelvin
Description :
Program ini untuk mengkonversi suhu Reamur ke Kelvin dengan rumus:
Kelvin = Reamur x 1.25 + 273

Input :
```json
50
-100
```
Output :
```json
335.50
148.00
```
## 4. VolumeTabung
Description :
Program ini untuk menghitung volume sebuah tabung dengan rumus:
3.14 x r2 x t 
r = jari-jari
t = tinggi
Input :
```json
4 // r
10 // t
```
Output :
```json
502.40
```

## Quiz 3
## CekMaxValue
Description :
Program ini berfungsi untuk mencari nilai tertinggi dari sebuah array

Input :
```json
1
3
5
```
Output :
```json
5
```
## CekTangkiBensin
Description :
Program ini berfungsi untuk mengecek tanki bensi berdasarkan uang yang dimiliki dan tanki bensin. Dengan ketentuan:
- Harga Bensin/liter = 7600
- 7600 <= uang <= 76000
- 1 <= kapasitas <= 10
Input :
```json
30000
2

20000
5
```
Output :
```json
3.95
Bensin Berlebih

2.63
```
## KelipatanTigaEmpat
Description :
Program ini berfungsi untuk mengeek apakah sebuah nilai merupakan kelipatan 3 DAN 4 dengan ketentuan jika iya menampilkan angka 1, jika bukan menampilkan angka 0.

Input :
```json
12
6
```
Output :
```json
1
0
```
## RatioPersegi
Description :
Program ini berfungsi untuk menghitung total luas tiga persegi berdasarkan ratio dan sisinya. R1:R2:R3.

Input :
```json
1
2
3
2

3
2
1
9
```
Output :
```json
56.00

54.00
```
## TarikTunai
Description :
Program ini berfungsi untuk menghitung sisa saldo setelah di tarik tunai dengan ketentuan:
- Tarik Tunai kelipatan 5
- Admin 0.5
- Saldo >= Tarik Tunai + Admin
- Jika saldo tidak mencukupi mengembalikan nilai saldo
Input :
```json
100
110

50
50
```
Output :
```json
9.50

50 // mengembalikan saldo awal
```