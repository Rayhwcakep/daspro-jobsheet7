import java.util.Scanner;

public class tugas125 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int totalTiket = 0, jumlahTiket;
        double hargaTiket = 50000, totalPenjualan = 0;
        
        while (true) {
            System.out.print("Masukkan jumlah tiket yang terjual (0 untuk mengakhiri): ");
            jumlahTiket = input.nextInt();
            
            if (jumlahTiket == 0) {
                break;
            }
            
            if (jumlahTiket > 0) {
                totalTiket += jumlahTiket;
                
                double diskon = 0;
                if (jumlahTiket > 10) {
                    diskon = 0.15;
                } else if (jumlahTiket > 4) {
                    diskon = 0.1;
                }
                
                double hargaSetelahDiskon = hargaTiket * jumlahTiket * (1 - diskon);
                totalPenjualan += hargaSetelahDiskon;
                System.out.println("Total harga tiket" + hargaSetelahDiskon);
            } else {
                System.out.println("Jumlah tiket tidak valid");
            }
        }
        
        System.out.println("Total tiket yang terjual: " + totalTiket + " tiket");
        System.out.println("Total penjualan hari ini: Rp " + totalPenjualan);
    }
}
