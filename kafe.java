import java.util.Scanner;

public class kafe {

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
}