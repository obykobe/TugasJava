import java.util.Scanner;

public class UH1{
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       double UangSaku, Budgetbensin, Budgetjajan, BudgetHiburan;
       UangSaku = 1500000;
       Budgetbensin = 250000;
       Budgetjajan = 400000;
       BudgetHiburan = 200000;

       Scanner inpu = new Scanner(System.in);
        System.out.println("Masukkan Jumlah UangSaku");
        double UangTotal= input.nextDouble();
        double Kurangi= UangSaku-Budgetbensin-Budgetjajan-BudgetHiburan;


    }
}