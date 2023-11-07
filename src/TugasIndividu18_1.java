import java.util.Scanner;

public class TugasIndividu18_1 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);

        System.out.print("Masukkan Nilai N : ");
        int n = sc18.nextInt();

        System.out.println();
        
        for (int j = 1; j <= n; j++) {
            for (int k = n; k >= j; k--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= j; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
 }
}
