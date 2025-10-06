import java.util.Scanner;

public class A_Shortest_Increasing_Path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();

            if (y > x) {
                System.out.println(2);
            } else if (x > y && y >= 2 && (x - y) >= 2) {
                System.out.println(3);
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
