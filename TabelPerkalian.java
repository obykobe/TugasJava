import java.util.Scanner;

public class TabelPerkalian{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.print("Masukkan bilangan kelipatan perkalian: ");
     int kelipatan =  input.nextInt();
     System.out.print("Masukkan batas: ");
     batas = input.nextInt();

     for (int x = 1; x <= 10; x++)
    {
        System.out.println(kelipatan + "x" + x + "=" + (kelipatan*x));
    }
    }


}