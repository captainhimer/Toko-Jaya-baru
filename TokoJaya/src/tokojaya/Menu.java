/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokoJaya;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author ZOELF
 */
public class Menu {

    public static void main(String[] args) {

        String warna, jenis, ketegori, menu, nama;
        int sepatu, tanggal, size, harga, jumlahbarang, diskon, total, merk;
        int pilihan = 0;

        {
            Scanner input = new Scanner(System.in);
            System.out.println("===== Selamat Datang di Program Toko JayaBaru =====");
            System.out.print("Silahkan masukkan nama Anda = ");
            nama = input.nextLine();
            System.out.print("Masukkan tanggal pembelian = ");
            tanggal = input.nextInt();
            System.out.println("Silahkan memilih merk sepatu anda ");
            System.out.println("1. Adidas");
            System.out.println("2. Nike");
            System.out.println("3. Vans");
            System.out.println("Pilihan Anda = ");
            pilihan = input.nextInt();
            switch (pilihan) {

                case 1:
                    System.out.println("Anda akan memilih sepatu merk Adidas");
                    System.out.println("Pilih kategori sepatu anda");
                    System.out.println("1. Sport");
                    System.out.println("2. Lari");
                    System.out.println("3. Pantofel");
                    System.out.print("******* Pilihan Anda ******** = ");
                    pilihan = input.nextInt();
                    switch (pilihan) {
                        case 1:
                            System.out.println("Pilih jenis sepatu anda");
                            System.out.println("1. Laki - laki ");
                            System.out.println("2. Perempuan ");
                            System.out.print("******* Pilihan Anda ********* = ");
                            pilihan = input.nextInt();
                            switch (pilihan) {
                                case 1:
                                    System.out.println("Pilih ukuran sepatu anda");
                                    System.out.println("1. 25");
                                    System.out.println("2. 26");
                                    System.out.println("3. 28");
                                    System.out.print("******* Pilihan Anda ********* = ");
                                    pilihan = input.nextInt();
                                    switch (pilihan) {
                                        case 1:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.print("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("*************************************");
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.println("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 900000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.print("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.println("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.println("Pilih ukuran sepatu anda");
                                    System.out.println("1. 25");
                                    System.out.println("2. 26");
                                    System.out.println("3. 28");
                                    System.out.print("******* Pilihan Anda ********* = ");
                                    pilihan = input.nextInt();
                                    switch (pilihan) {
                                        case 1:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.println("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.println("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.println("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.println("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;

                                    }
                                    break;

                                case 3:
                                    System.out.println("Pilih ukuran sepatu anda");
                                    System.out.println("1. 25");
                                    System.out.println("2. 26");
                                    System.out.println("3. 28");
                                    System.out.print("******* Pilihan Anda ********* = ");
                                    pilihan = input.nextInt();
                                    switch (pilihan) {
                                        case 1:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.println("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;

                                        case 2:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.println("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.println("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.print("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            }
                                            break;
                                    }
                                    break;

                            }
                            break;
                        case 2:
                            System.out.println("Pilih jenis sepatu anda");
                            System.out.println("1. Laki - laki ");
                            System.out.println("2. Perempuan ");
                            System.out.print("******* Pilihan Anda ********* = ");
                            pilihan = input.nextInt();
                            switch (pilihan) {
                                case 1:
                                    System.out.println("Pilih ukuran sepatu anda");
                                    System.out.println("1. 25");
                                    System.out.println("2. 26");
                                    System.out.println("3. 28");
                                    System.out.print("******* Pilihan Anda ********* = ");
                                    pilihan = input.nextInt();
                                    switch (pilihan) {
                                        case 1:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.print("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 1000000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.print("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 2000000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.print("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.print("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                    }
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Anda akan memilih sepatu merk Nike");
                    System.out.println("Pilih kategori sepatu anda");
                    System.out.println("1. Sport");
                    System.out.println("2. Lari");
                    System.out.println("3. Pantofel");
                    System.out.print("******* Pilihan Anda ******** = ");
                    pilihan = input.nextInt();
                    switch (pilihan) {
                        case 1:
                            System.out.println("Pilih jenis sepatu anda");
                            System.out.println("1. Laki - laki ");
                            System.out.println("2. Perempuan ");
                            System.out.print("******* Pilihan Anda ********* = ");
                            pilihan = input.nextInt();
                            switch (pilihan) {
                                case 1:
                                    System.out.println("Pilih ukuran sepatu anda");
                                    System.out.println("1. 25");
                                    System.out.println("2. 26");
                                    System.out.println("3. 28");
                                    System.out.print("******* Pilihan Anda ********* = ");
                                    pilihan = input.nextInt();
                                    switch (pilihan) {
                                        case 1:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.print("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("*************************************");
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.println("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 900000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.print("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.println("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.println("Pilih ukuran sepatu anda");
                                    System.out.println("1. 25");
                                    System.out.println("2. 26");
                                    System.out.println("3. 28");
                                    System.out.print("******* Pilihan Anda ********* = ");
                                    pilihan = input.nextInt();
                                    switch (pilihan) {
                                        case 1:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.println("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.println("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.println("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.println("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;

                                    }
                                    break;
                            }
                    }
                    break;
                case 3:
                    System.out.println("Anda akan memilih sepatu merk Vans");
                    System.out.println("Pilih kategori sepatu anda");
                    System.out.println("1. Sport");
                    System.out.println("2. Lari");
                    System.out.println("3. Pantofel");
                    System.out.print("******* Pilihan Anda ******** = ");
                    pilihan = input.nextInt();
                    switch (pilihan) {
                        case 1:
                            System.out.println("Pilih jenis sepatu anda");
                            System.out.println("1. Laki - laki ");
                            System.out.println("2. Perempuan ");
                            System.out.print("******* Pilihan Anda ********* = ");
                            pilihan = input.nextInt();
                            switch (pilihan) {
                                case 1:
                                    System.out.println("Pilih ukuran sepatu anda");
                                    System.out.println("1. 25");
                                    System.out.println("2. 26");
                                    System.out.println("3. 28");
                                    System.out.print("******* Pilihan Anda ********* = ");
                                    pilihan = input.nextInt();
                                    switch (pilihan) {
                                        case 1:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.print("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("*************************************");
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.println("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 900000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.print("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.println("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.println("Pilih ukuran sepatu anda");
                                    System.out.println("1. 25");
                                    System.out.println("2. 26");
                                    System.out.println("3. 28");
                                    System.out.print("******* Pilihan Anda ********* = ");
                                    pilihan = input.nextInt();
                                    switch (pilihan) {
                                        case 1:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.println("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.println("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.println("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Pilih Warna Sepatu Anda");
                                            System.out.println("1. Merah");
                                            System.out.println("2. Hijau");
                                            System.out.println("3. Hitam");
                                            System.out.println("4. Gold");
                                            System.out.print("==== Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();

                                            System.out.println("Jumlah Sepatu yang akan di Beli = ");
                                            jumlahbarang = input.nextInt();
                                            harga = 950000 * jumlahbarang;
                                            if (jumlahbarang == 1) {
                                                System.out.println("Anda Akan membeli 1 Pasang Sepatu");
                                                diskon = 00000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 2) {
                                                System.out.println("Anda Akan Membeli 2 Pasang Sepatu");
                                                diskon = 50000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                            } else if (jumlahbarang == 3) {
                                                System.out.println("Anda Akan Membeli 3 Pasang Sepatu");
                                                diskon = 100000;
                                                total = harga - diskon;
                                                System.out.println("*************************************");
                                                System.out.println("Nama = " + nama);
                                                System.out.println("Tanggal Pembelian = " + tanggal);
                                                System.out.println("Diskon Anda = " + diskon);
                                                Third nibba = new Third(harga, diskon, total, jumlahbarang);
                                                nibba.info();
                                                System.out.println("*************************************");
                                                break;
                                            }
                                            break;

                                    }
                                    break;
                            }
                    }
                    break;

            }
        }
    }
}

