# Repositry ini berisi kumpulan program logika sederhana menggunakan Java

# Quiz 1
## 1. CalcBankInterest
Description :
Program ini untuk menghitung bunga pinjaman

Input :
```json
100000
10
```
Output:
```json
110000.00
```
## 2. DeretAngka
Description :
Program ini untuk menampilkan deret angka

Input :
```json
1
5
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
1
6
0
```
Output:
```json
ganjil
genap
nol
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
1
3

2
5
```
Output :
```json
4000
3000
```
## 2. DeretMenurun
Description :
Program ini untuk menampilkan deret angka secara menurun

Input :
```json
1
5
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
4
10
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

50
```

## Quiz 4
## AlayConverter
Description :
program ini berfungsi untuk mengkonversi kalimat menjadi kalimat alay dengan ketentuan:
- I/i = 1
- Z/z = 2
- E/e = 3
- A/a = 4
- G/g = 6
- J/j = 7
- B/b = 8

Input :
```
Ini contoh program sederhana
Saya ingin menjadi software developer
```
Output :
```
1n1 contoh pro6r4m s3d3rh4n4
S4y4 1n61n m3n74d1 softw4r3 d3v3lop3r
```

## DeretBintang
Description :
Program ini berfungsi untuk menampilkan deret bintang sesuai input user

Input :
```
5
```
Output :
```
* 
* * 
* * * 
* * * * 
* * * * *
```

## DiscountCalculator
Description :
program ini berfungsi untuk menghitung disount sebuah pembelian dengan ketentuan:
- 10000 <= Harga Barang <= 1000000
- 1 <= Qty Barang <= 100
- Discount sebesar 15% dari total pembelian jika Qty Barang kelipatan 3 DAN 4

Input :
```
100000
12

50000
3
```
Output :
```
1020000.00

150000.00
```

## ProgramKarcis
Description :
Program ini untuk menentukan jenis sanksi di tempat parkir dengan ketentuan:
- Jika kasusnya Tidak membawa STNK maka diharuskan membawa STNK terlebih dahulu
- Jika kasusnya kehilangan karcis dan terjadi kurang dari 4 kali, maka sanksu berupa penyerahan KTP
- Jika kasusnya kehlangan karcis dan lebih dari 3 kali makan sanksinya adalah denda 10000

Input :
```
1
3

2
1

1
5
```
Output :
```
Serahkan KTP anda !!!

Ambil STNK dulu !!!

Bayar Denda 10000 !!!
```

## SatnightParkir
Description :
Program ini berfungsi untuk menghtiung biaya parkir di malam minggu dengan ketentuan:
- Input 0 < durasi parkir <= 24
- Jika durasi lebih dari 8 jam maka kendaraan disegel
- Biaya parkir mobil 5jam pertama = 1500, setelah 5 jam 500/jam
- Biaya parkir motor 5jam pertama = 1000, setelah 5 jam 500/jam

Input :
```
1
4

2
6

1
9
```
Output :
```
6000

6500

Disegel
```