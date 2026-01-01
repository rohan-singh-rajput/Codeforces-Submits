import java.util.Scanner;

public class A_Tram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int total = 0;

        int maxT = 0;
        while (t-- > 0) {
            int start, end;
            start = sc.nextInt();
            end = sc.nextInt();

            total -= start;

            total += end;

            maxT = Math.max(maxT, total);

        }

        System.out.println(maxT);
        sc.close();
    }
}