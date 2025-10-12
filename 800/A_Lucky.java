import java.util.Scanner;

public class A_Lucky {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String in = sc.nextLine();

            int num1 = 0;
            for (int i = 0; i < 3; i++) {
                num1 += (int) (in.charAt(i) - '0');
            }

            int num2 = 0;

            for (int i = 5; i >= 3; i--) {
                num2 += (int) (in.charAt(i) - '0');
            }

            if (num1 == num2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}