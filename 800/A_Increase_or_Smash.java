import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_Increase_or_Smash {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int size = sc.nextInt();
            Set<Integer> st = new HashSet<>();

            while (size-- > 0) {
                int temp = sc.nextInt();
                st.add(temp);
            }

            System.out.println(2 * st.size() - 1);

        }

        sc.close();
    }
}