import java.util.Scanner;

public class kasinatk{
      public static void main(String[] args) {
        
        double bukutulis, pensil, penghapus, penggaris;
        bukutulis=2500;
        pensil=1000;
        penghapus=1500;
        penggaris=1000;

        int jumlahBeli=10;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah beli buku Tulis: ");
        double jumlahBuku= input.nextDouble();
        double total=jumlahBuku*bukutulis;
        System.out.println("Masukkan Pembayaran: ");
        double bayar=input.nextDouble();
        double diskon=0.05*total;
        double kembali=bayar-(total-diskon);
        System.out.println("Total diskon: "+diskon);
        System.out.println("Total kembalian: "+kembali);   }
        
    } {
    
}
