public static void tampilkanPesanan() {
    if (daftarPesanan.isEmpty()) {
        System.out.println("Belum ada pesanan.");
        return;
    }

    System.out.println("\n===== DAFTAR PESANAN =====");
    for (Pesanan pesanan : daftarPesanan) {
        System.out.println("Nama Pelanggan: " + pesanan.namaPelanggan);
        System.out.println("Nomor Meja: " + pesanan.nomorMeja);
        System.out.println("Detail Pesanan:");
        System.out.printf("- %s x %d = Rp %d\n", pesanan.namaMenu, pesanan.jumlahItem, pesanan.totalHarga);
        System.out.println("Total Harga Pesanan: Rp " + pesanan.totalHarga);
        System.out.println("-----------------------------");
    }
}
