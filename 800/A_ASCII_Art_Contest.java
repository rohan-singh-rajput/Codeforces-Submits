import java.util.Scanner;

public class A_ASCII_Art_Contest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int maxI = Math.max(a, Math.max(b, c));
        int minI = Math.min(a, Math.min(b, c));
        if (maxI - minI >= 10) {
            System.out.println("check again");
        } else {
            int mid = 0;

            if (a != maxI && a != minI) {
                mid = a;
            } else if (b != maxI && b != minI) {
                mid = b;
            } else {
                mid = c;
            }

            System.out.println("final " + mid);
        }

        sc.close();
    }
}