import java.util.Scanner;

public class kalkulatorsuhu{
    public static void main(String[] args) {
        
    } {
        Scanner input = new Scanner (System.in);
       double C , F , R , K;
       System.out.print("masukan suhu dalam celcius");

       C = input.nextDouble();

       R = 4.0 / 5.0 * C;
       F = 9.0 /5.0 * C + 32;
       K = C +273;

       System.out.println("Nilai Reamur = "+ R + "R");
       System.out.println("Nilai Fahrenheit = "+ F + "F");
       System.out.println("Nilai Kelvin = "+ K + "K");
    }
    }
