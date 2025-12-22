import java.util.Scanner;

public class A_Stones_on_the_Table {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        String stones = sc.next();

        int res = 0;

        for (int i = 1; i < t; i++) {
            char prev = stones.charAt(i - 1);
            char curr = stones.charAt(i);

            if (prev == curr) {
                ++res;
            }
        }

        System.out.println(res);

        sc.close();
    }
}