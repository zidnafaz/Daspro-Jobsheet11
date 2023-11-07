import java.util.Scanner;
import java.util.Random;

public class Quiz18 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input18 = new Scanner(System.in);

        char menu = 'y';

        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {

                System.out.print("Tebak angka (1-10) : ");
                int answer = input18.nextInt();
                input18.nextLine();
                success = (answer == number);

            } while (!success);

            System.out.println("Apakah anda ingin mengulang permainan (Y/y)? : ");
            menu = input18.nextLine().charAt(0);

        } while (menu == 'y' || menu == 'y');
    }
}
