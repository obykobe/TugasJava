import java.util.Scanner;

public class ucupcafe {
    public static void main(String[] args) {
    // Daftar menu beserta harga
                String[] menu = {"pancongcoklat", "mie iblis", "Es Americano", "Es thaithea"};
                double[] harga = {12000, 20000, 15000, 6000};
        
                // Menampilkan menu kepada pengguna
                System.out.println("Menu Restoran ucupcafe:");
                for (int i = 0; i < menu.length; i++) {
                    System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
                }
        
                Scanner input = new Scanner(System.in);
                double totalBiaya = 0.0;
        
                while (true) {
                    System.out.print("Pilih menu (nomor) atau 0 untuk selesai: ");
                    int pilihan = input.nextInt();
        
                    // Cek jika pengguna ingin keluar
                    if (pilihan == 0) {
                        break;
                    }
        
                    // Memeriksa apakah pilihan valid
                    if (pilihan >= 1 && pilihan <= menu.length) {
                        int indexMenu = pilihan - 1;
                        System.out.println("Anda memesan: " + menu[indexMenu]);
                        totalBiaya += harga[indexMenu];
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                }
        
                // Menampilkan tagihan
                System.out.println("Total biaya: Rp" + totalBiaya);
        
                // Meminta pembayaran dari pengguna
                System.out.print("Masukkan jumlah uang: Rp");
                double uangDibayarkan = input.nextDouble();
        
                // Menghitung kembalian atau memberi tahu jika uang kurang atau pas
                if (uangDibayarkan == totalBiaya) {
                    System.out.println("Uang anda pas.");
                } else if (uangDibayarkan < totalBiaya) {
                    System.out.println("Maaf, uang anda kurang.");
                } else {
                    double kembalian = uangDibayarkan - totalBiaya;
                    System.out.println("Kembalian: Rp" + kembalian);
                }
        
                input.close();
            }
        }   
    

