import java.util.Scanner;

public class A_Legs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int cows = n / 4;
            while (cows >= 0) {
                int remainingLegs = n - cows * 4;
                if (remainingLegs % 2 == 0) {
                    int chickens = remainingLegs / 2;
                    System.out.println(cows + chickens);
                    break;
                }
                cows--;
            }
        }
    }
}