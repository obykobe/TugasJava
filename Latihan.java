import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        int nilaiAtas, nilaiBawah, total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai bawah: ");
        nilaiBawah = input.nextInt();
        System.out.println("Masukkan nilai atas: ");
        nilaiAtas = input.nextInt();

        for (int i = nilaiBawah; i <= nilaiAtas; i++) {
            total += i;
        }
        System.out.println("Total: " + total);
}
}