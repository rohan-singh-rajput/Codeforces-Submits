import java.util.Arrays;
import java.util.Scanner;

public class A_Boy_or_Girl {

    public static void main(String[] args) {
        int[] alpha = new int[26];

        Arrays.fill(alpha, 0);

        Scanner sc = new Scanner(System.in);

        String in = sc.next();

        int cnt = 0;

        for (int i = 0; i < in.length(); i++) {
            if (alpha[in.charAt(i) - 'a'] == 0) {
                ++cnt;
                alpha[in.charAt(i) - 'a'] = 1;
            }
        }

        if (cnt % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }
}