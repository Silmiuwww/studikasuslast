
public static void tampilkanPesanan() {
    if (jmlPesanan == 0) {
        System.out.println("Belum ada pesanan.");
        return;
    }

    System.out.println("\n===== DAFTAR PESANAN =====");
    for (int i = 0; i < jmlPesanan; i++) {
        System.out.println("Nama Pelanggan: " + pesanan[i][0]);
        System.out.println("Nomor Meja: " + pesanan[i][1]);
        System.out.println("Detail Pesanan:");
        System.out.printf("- %s x %s = Rp %s\n", pesanan[i][2], pesanan[i][3], pesanan[i][4]);
        System.out.println("-----------------------------");
    }
}
