import java.util.Scanner;

public class A_Next_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int target = sc.nextInt();

        target -= 1;

        int[] arr = new int[t];

        int cnt = 0;

        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }

        target = arr[target];

        for (int i = 0; i < t; i++) {
            if (arr[i] >= target && arr[i] > 0) {
                ++cnt;
            }
        }

        System.out.println(cnt);

        sc.close();
    }
}
