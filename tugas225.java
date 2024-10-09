import java.util.Scanner;
 
public class tugas225 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis, durasi, total=0;

        
        while (true) {
            System.out.println("Masukkan jenis kendaraan (1 mobil, 2 motor, 0 keluar)");
            jenis = input.nextInt();
            if (jenis == 0) {
                break;
            }
            System.out.println("masukkan durasi parkir: ");
            durasi = input.nextInt();   

            if (jenis == 1) {
                total += durasi * 3000;

            }else if (jenis == 2) {
                total += durasi * 2000;

            }else {
                if (durasi > 5) {
                    total = 12000;
                }else{
                    System.out.println("jenis kendaraan tidak valid");
                }
            }
            System.out.println("total biaya parkir: " + total);
        }
    }
}