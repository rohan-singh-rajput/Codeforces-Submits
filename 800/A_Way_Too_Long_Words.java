import java.util.Scanner;

public class A_Way_Too_Long_Words {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();

        while (n-- > 0) {
            String s;
            s = sc.nextLine();

            if (s.length() <= 10) {
                System.out.println(s);
            } else {
                System.out.println("" + s.charAt(0) + (s.length() - 2) + s.charAt(s.length() - 1));
            }
        }

        sc.close();

    }
}