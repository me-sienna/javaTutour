import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.next();
        String line2 = sc.next();

        int value = Integer.parseInt(line2);

        System.out.printf("문자: %s\n", line);
        System.out.printf("숫자: %d", value);
    }
}
