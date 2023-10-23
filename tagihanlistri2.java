import java.util.Scanner;

public class tagihanlistri2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double pemakaian, tarif, biayapemakaian, biayatambahan, totaltagihan;
    String nama;

    System.out.println("input besar pemakaian: ");
    pemakaian = input.nextDouble();

    if (pemakaian >= 0 && pemakaian <=50) {
        tarif =100;
     }else if (pemakaian >=51 && pemakaian <=150) {
        tarif = 150;
     }else if (pemakaian >=151 && pemakaian <= 250 ) {
        tarif = 250;
     }else {
        tarif = 300;
     }

     biayapemakaian = pemakaian * tarif;
     biayatambahan = 0.2 * biayapemakaian;

     totaltagihan = biayapemakaian + biayatambahan;

     System.out.println("pemakaian: " + pemakaian + "kWh");
     System.out.println("totaltagihan: Rp" + totaltagihan);
     
    }
}
