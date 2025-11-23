import java.util.Scanner;

public class A_Bit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int res = 0;

        sc.nextLine();

        while (t-- > 0) {
            String str = sc.nextLine();

            if (str.charAt(1) == '+') {
                ++res;
            } else {
                --res;
            }
        }

        System.out.println(res);

        sc.close();
    }
}