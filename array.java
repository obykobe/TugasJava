import java.util.Scanner;

public class array{
public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    //sintaks array 1
    String namaSiswa[]={"anita","ucup","bhisma","obi"};
    //sintaks array 2
    int []nilaiSiswa={90,65,89,85};
    //sintaks array 3
    String alamat[] = new String[4];

    for (int i = 0; i < namaSiswa.lenght; i++) {
        System.out.println(namaSiswa[i]+", ");
        System.out.println(nilaiSiswa[i]);
    }
    // System.out.println(namaSiswa[0]);
    // System.out.println(namaSiswa[1]);
    // System.out.println(namaSiswa[2]);
    // System.out.println(namaSiswa[3]);

}
}
