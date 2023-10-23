import java.util.Scanner;                                  

public class BayarSekolah{
    public static void main(String[] args) {
        
        String jalurMasuk, namaMhs;
        int pendapatan, DSP, SPP, bulan ,totalBayar;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nama mahasiswa");
        namaMhs =  input.nextLine();

        System.out.println("Masukkan besar pendapatan oranf tua: ");
        pendapatan = input.nextInt();

        System.out.println("Masukkan jumlah bulan yang dibayar: ");
        bulan = input.nextInt();

        System.out.println("Pilihan jalur masuk: ");
        System.out.println("1.SBMPTN\n2. SNMPTN\n3. Mandiri");
        System.out.println("Masukkan pilihan anda (1/2/3): ");
        jalurMasuk = input.nextLine();

        switch (jalurMasuk) {
            case "1" :
                 if (pendapatan <2000000) {
                    DSP = 5000000;
                    SPP = 500000;
        } else if (pendapatan >= 2000000 && pendapatan <= 10000000) {
            DSP = 15000000;
            SPP = 1000000;
        } else {
            DSP = 30000000;
            SPP = 2000000;
        }
        SPP = bulan *SPP;
        System.out.println("Besar SPPS: Rp " + SPP );
        System.out.println("Besar DSP: Rp " +DSP);
        totalBayar = DSP + SPP;
        System.out.println("Total bayar: Rp" + totalBayar);
        break;

        }
}
}