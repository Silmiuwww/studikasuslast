import java.util.Scanner;

    public static void tambahkanPesanan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc.nextLine();

        System.out.print("Masukkan nomor meja: ");
        int nomorMeja = sc.nextInt();
        sc.nextLine();

        System.out.println("===== MENU KAFE =====");
        for (int i = 0; i < menuKafe.length; i++) {
            System.out.println((i + 1) + ". " + menuKafe[i] + " - Rp " + hargaMenu[i]);
        }

        while (true) {
            System.out.print("Pilih menu : (pilih 0 untuk keluar)");
            int pilihamMenu = sc.nextInt();

            if (pilihamMenu == 0) {
                System.out.println("Pesanan selesai ditambahkan.");
                return;
            } else if (pilihamMenu < 1 || pilihamMenu > menuKafe.length) {
                System.out.println("Nomor menu tidak valid, coba lagi.");
                continue;
            }

            System.out.print("Masukkan jumlah item: ");
            int jumlahItem = sc.nextInt();

            if (jumlahItem <= 0) {
                System.out.println("Jumlah item harus lebih dari 0, coba lagi.");
                continue;
            }

            String namaMenu = menuKafe[pilihamMenu - 1];
            int hargaSatuan = hargaMenu[pilihamMenu - 1];
            int totalHarga = jumlahItem * hargaSatuan;

            daftarPesanan[jumlahPesanan][0] = namaPelanggan;
            daftarPesanan[jumlahPesanan][1] = Integer.toString(nomorMeja);
            daftarPesanan[jumlahPesanan][2] = namaMenu;
            daftarPesanan[jumlahPesanan][3] = Integer.toString(jumlahItem);
            daftarPesanan[jumlahPesanan][4] = Integer.toString(totalHarga);

            jumlahPesanan++;
            System.out.println("Pesanan berhasil ditambahkan.");
            System.out.println("Total harga pesanan: " + totalHarga);
        }
    }
