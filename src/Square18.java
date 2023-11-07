import java.util.Scanner;

public class Square18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);

        System.out.print("Masukkan Nilai N : ");
        int n = sc18.nextInt();

        for (int iOuter = 1; iOuter <= n; iOuter++) {
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
