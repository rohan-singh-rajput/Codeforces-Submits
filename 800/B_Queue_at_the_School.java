import java.util.Scanner;

public class B_Queue_at_the_School {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int k = sc.nextInt();

        String arr = sc.next();

        char[] queue = arr.toCharArray();

        while (k-- > 0) {
            for (int i = 1; i < n; i++) {
                char prev = queue[i - 1];
                char curr = queue[i];

                if (curr == 'G' && prev == 'B') {
                    char temp = queue[i];
                    queue[i] = queue[i - 1];
                    queue[i - 1] = temp;
                    i++;
                }
            }
        }

        for (char curr : queue) {
            System.out.print(curr);
        }
        System.out.println();
        sc.close();
    }
}