import java.util.Scanner;

public class A_Elephant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] steps = { 1, 2, 3, 4, 5 };

        int cnt = 0;

        for (int i = steps.length - 1; i >= 0; i--) {

            while (n >= steps[i]) {
                n -= steps[i];
                ++cnt;
            }

            if (n == 0) {
                break;
            }
        }

        System.out.println(cnt);

        sc.close();
    }
}