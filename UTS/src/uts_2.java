/*
 * Nama : Muhamad Fathur Rahman
 * NIM  : 21343055
 * Prodi: Teknik Informatika
 */
import java.util.Scanner;

public class uts_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris : ");
        int x = input.nextInt();
        input.close();

        for (int i = 0; i <= x - 1; i++){
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= x - 1; k++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        for (int i = x; i >= 0 ; i--){
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = i; k <= x - 1 ; k++) {
                    System.out.print("* ");
                }
        System.out.println();
        }
   } 
}
