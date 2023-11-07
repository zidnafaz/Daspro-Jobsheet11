import java.util.Scanner;

public class Star18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);

        System.out.print("Masukkan Nilai N : ");
        int n = sc18.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}