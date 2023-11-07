import java.util.Scanner;

public class Star18_1 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);

        System.out.print("Masukkan Nilai N : ");
        int n = sc18.nextInt();

        for (int i = 0; i <= n; i--) {
            System.out.print("*");
        }
    }
}