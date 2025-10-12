import java.util.Scanner;

public class A_Division {

    private static String check(int num) {
        if (num <= 1399) {
            return "Division 4";
        } else if (num >= 1400 && num <= 1599) {
            return "Division 3";
        } else if (num >= 1600 && num <= 1899) {
            return "Division 2";
        } else {
            return "Division 1";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int num = sc.nextInt();
            String res = check(num);
            System.out.println(res);
        }
    }
}