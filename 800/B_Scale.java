import java.util.Scanner;

public class B_Scale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            for (int i = 0; i < n; i++) {
                String row = sc.next();
                if (i % k == 0) {
                    for (int j = 0; j < n; j++) {
                        if (j % k == 0) {
                            System.out.print(row.charAt(j));
                        }
                    }
                    System.out.println();
                }

            }
        }
        sc.close();
    }
}