import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A_Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        List<Character> s = new ArrayList<Character>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '+') {
                s.add(str.charAt(i));
            }
        }

        Collections.sort(s);

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.size() - 1; i++) {
            res.append(s.get(i));
            res.append('+');
        }

        res.append(s.get(s.size() - 1));

        System.out.println(res);

        sc.close();
    }
}
