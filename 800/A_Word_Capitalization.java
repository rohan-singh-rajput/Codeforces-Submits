import java.util.Scanner;

public class A_Word_Capitalization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();

        if (in.charAt(0) >= 'a' && in.charAt(0) <= 'z') {
            System.out.print((char) (in.charAt(0) - 32));

            for (int i = 1; i < in.length(); i++) {
                System.out.print(in.charAt(i));
            }
        } else {
            System.out.println(in);
        }

        sc.close();
    }
}