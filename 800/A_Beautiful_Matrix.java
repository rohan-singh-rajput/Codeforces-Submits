import java.util.Scanner;

public class A_Beautiful_Matrix {

    public static void main(String[] args) {
        int res = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int temp = sc.nextInt();

                if (temp == 1) {
                    res = Math.abs(3 - i) + Math.abs(3 - j);
                }
            }
        }

        System.out.println(res);

        sc.close();
    }
}