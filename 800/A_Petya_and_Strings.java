import java.util.Scanner;

public class A_Petya_and_Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int n = s1.length();

        for (int i = 0; i < n; i++) {
            char t1 = s1.charAt(i);
            char t2 = s2.charAt(i);

            if (t2 >= 'A' && t2 <= 'Z') {
                t2 = (char) (32 + t2);
            }

            if (t1 >= 'A' && t1 <= 'Z') {
                t1 = (char) (32 + t1);
            }

            if (t1 < t2) {
                System.out.println(-1);
                sc.close();
                return;
            } else if (t1 > t2) {
                System.out.println(1);
                sc.close();
                return;
            }
        }

        System.out.println(0);
        sc.close();
    }
}