import java.util.Scanner;

public class A_Sublime_Sequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int x, n;
            x = sc.nextInt();
            n = sc.nextInt();

            if (n % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(x);
            }
        }
        sc.close();
    }
}