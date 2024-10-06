package homework1;

import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("V(전압) 입력: ");
        double v = sc.nextDouble();
        System.out.print("R(저항) 입력: ");
        double r = sc.nextDouble();

        double w = v*v/r;
        double dBm = 10 * Math.log10(w)+30;

        System.out.printf("P(전력): %.2f\n", w);
        System.out.printf("dDm: %.2f", dBm);
    }
}
