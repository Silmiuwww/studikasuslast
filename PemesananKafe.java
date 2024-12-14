import java.util.Scanner;

public class PemesananKafe {

        static String [] menukafe = {"kopi Hitam", "Latte","Teh Tarik","Mie goreng"};
        static int [] hargamenu = {15000,22000,12000,18000};
        static String [][] pesanan = new String[50][5];
        static int jmlPesanan = 0;
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int piliMenu;
    
            while (true) {
                System.out.println("===== MENU KAFE =====");
                System.out.println("1. Tambahkan Pesanan");
                System.out.println("2. Tampilkan Daftar Pesanan");
                System.out.println("3. Keluar");
                System.out.print("Pilih Menu: ");
                piliMenu = sc.nextInt();
                sc.nextLine();
    
                if (piliMenu == 1) {
                    tambahkanPesanan();
                }else if (piliMenu == 2) {
                    tampilkanPesanan();
                }else if (piliMenu == 3) {
                    System.out.println("Terimakasih Telah Memesan Pesanan kami");
                    break;
                }else {
                    System.out.println("Piliham tidak valid. Silahkan coba lagi");
                }
            }
        }
    
        public static void tambahkanPesanan() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan nama pelanggan: ");
            String namaPelanggan = sc.nextLine();
        
            System.out.print("Masukkan nomor meja: ");
            int nomorMeja = sc.nextInt();
            sc.nextLine();
        
            System.out.println("===== MENU KAFE =====");
            for (int i = 0; i < menukafe.length; i++) {
                System.out.println((i + 1) + ". " + menukafe[i] + " - Rp " + hargamenu[i]);
            }
    
            int totalPesananHarga = 0;
        
            while (true) {
                System.out.print("Pilih menu (pilih 0 untuk keluar) : ");
                int pilihamMenu = sc.nextInt();
        
                if (pilihamMenu == 0) {
                    System.out.println("Pesanan selesai ditambahkan.");
                    System.out.println("Total harga pesanan: " + totalPesananHarga);
                    return;
                } else if (pilihamMenu < 1 || pilihamMenu > menukafe.length) {
                    System.out.println("Nomor menu tidak valid, coba lagi.");
                    continue;
                }
        
                System.out.print("Masukkan jumlah item: ");
                int jumlahItem = sc.nextInt();
        
                if (jumlahItem <= 0) {
                    System.out.println("Jumlah item harus lebih dari 0, coba lagi.");
                    continue;
                }
        
                String namaMenu = menukafe[pilihamMenu - 1];
                int hargaSatuan = hargamenu[pilihamMenu - 1];
                int totalHarga = jumlahItem * hargaSatuan;
    
                totalPesananHarga += totalHarga;
        
                pesanan[jmlPesanan][0] = namaPelanggan;
                pesanan[jmlPesanan][1] = Integer.toString(nomorMeja);
                pesanan[jmlPesanan][2] = namaMenu;
                pesanan[jmlPesanan][3] = Integer.toString(jumlahItem);
                pesanan[jmlPesanan][4] = Integer.toString(totalHarga);
        
                jmlPesanan++;
                System.out.println("Pesanan berhasil ditambahkan.");
                System.out.println("Total harga pesanan: " + totalHarga);
            }
        }
        public static void tampilkanPesanan() {
            System.out.println("\n===== DAFTAR PESANAN =====\n");
        
            if (jmlPesanan == 0) {
                System.out.println("Belum ada pesanan yang tercatat.");
                return;
            }
            boolean[] sudahDitampilkan = new boolean[jmlPesanan];

            for (int i = 0; i < jmlPesanan; i++) {
                if (sudahDitampilkan[i]) {
                continue;
                }
            
                System.out.println("Nama Pelanggan: " + pesanan[i][0]);
                System.out.println("Nomor Meja: " + pesanan[i][1]);
                System.out.println("Detail Pesanan:");
        
                int totalHargaPesanan = 0;
                for (int j = 0; j < jmlPesanan; j++) {
                    if (pesanan[j][0].equals(pesanan[i][0]) && pesanan[j][1].equals(pesanan[i][1])) {
                        int jumlahItem = Integer.parseInt(pesanan[j][3]);
                        int hargaTotal = Integer.parseInt(pesanan[j][4]);
                        totalHargaPesanan += hargaTotal;
        
                        System.out.println("- " + pesanan[j][2] + " x " + jumlahItem + " = Rp " + hargaTotal);
                        sudahDitampilkan[j] = true;
                    }
                }
        
                System.out.println("Total Harga Pesanan: Rp " + totalHargaPesanan);
                System.out.println("--------------------------------------");
            }
        }
    }
