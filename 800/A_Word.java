import java.util.Scanner;

public class A_Word {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int lCase = 0;
        int uCase = 0;

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);

            if (currChar >= 'A' && currChar <= 'Z') {
                ++uCase;
            } else {
                ++lCase;
            }
        }

        if (lCase >= uCase) {
            System.out.println(s.toLowerCase());
        } else {
            System.out.println(s.toUpperCase());
        }

        sc.close();
    }
}