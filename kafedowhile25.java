import java.util.Scanner;

public class kafedowhile25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        double hargaKopi=12000, HargaTeh=7000,  hargaRoti=20000, totalHarga;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal'untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("transaksi dibatalkan");
                break;
            }
            System.out.print("jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("jumlah roti: ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * HargaTeh) + (roti *  hargaRoti);
            System.out.println("total yang harus dibayar: Rp" + totalHarga);
            sc.nextLine();
        }while(true);
        System.out.println("semua transaksi selesai.");
    }
}