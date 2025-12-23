import java.util.Scanner;

public class A_Be_Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int currProd = 1;

            int steps = 0;
            while (n-- > 0) {
                int temp = sc.nextInt();

                if (temp == 0) {
                    ++steps;
                } else if (temp < 0) {
                    currProd *= temp;
                }
            }

            if (currProd < 0) {
                steps += 2;
            }

            System.out.println(steps);
        }

        sc.close();
    }
}
