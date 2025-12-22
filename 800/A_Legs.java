import java.util.Scanner;

public class A_Legs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] animals = { 4, 2 };

        while (t-- > 0) {
            int n = sc.nextInt();

            int cnt = 0;

            for (int i = 0; i < animals.length; i++) {
                while (n >= animals[i]) {
                    n = n - animals[i];
                    ++cnt;
                }
            }

            System.out.println(cnt);

        }

        sc.close();
    }
}