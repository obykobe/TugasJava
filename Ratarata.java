import java.util.Scanner;

public class Ratarata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double rataRata, total = 0, nilai;

        for (int n = 1; n <= 5; n++) {
            System.out.print("Masukkan Nilai ke- " + n + ": ");
            nilai = input.nextDouble();

            total = total + nilai;
            rataRata = total / 5;
            System.out.println("Rata-rata nilai anda = " + rataRata);
       }

}

}