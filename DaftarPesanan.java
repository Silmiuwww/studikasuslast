import java. util. Scanner;

public static void tampilkanPesanan() {
    System.out.println("\n===== DAFTAR PESANAN =====\n");

    if (jmlPesanan == 0) {
        System.out.println("Belum ada pesanan yang tercatat.");
        return;
    }

    for (int i = 0; i < jmlPesanan; i++) {
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
            }
        }

        System.out.println("Total Harga Pesanan: Rp " + totalHargaPesanan);
        System.out.println("--------------------------------------");
    }
}
