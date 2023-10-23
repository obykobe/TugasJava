import java.util.Scanner;

public class UH1 {
    public static void main(String[] aregs) {

        int Uangsaku, Uangbensin, Uangjajan, Uangliburan;
       String bulan;
       System.out.println("perencanaan untuk bulan septmber");
       bulan = input.nextLine();
        int SisaBudget, TabunganLaptop, TabunganKuliah;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Uang saku;");
        Uangsaku = input.nextInt();
        System.out.print("Masukkan Uang bensin;");
        Uangbensin = input.nextInt();
        System.out.print("Masukkan Uang jajan;");
        Uangjajan = input.nextInt();
        System.out.print("Masukkan Uang hiburan;");
        Uangliburan = input.nextInt();

        SisaBudget = Uangsaku - (Uangbensin + Uangjajan + Uangliburan);
        TabunganKuliah = SisaBudget * 60 / 100;
        
         System.out.println("Jadi Tabungan untuk kuliah sebesar: " + TabunganKuliah);

        
        TabunganLaptop = SisaBudget * 40 / 100;
        
            System.out.println("Jadi Tabungan untuk membeli laptop sebesar: " + TabunganLaptop);
   
}
}



