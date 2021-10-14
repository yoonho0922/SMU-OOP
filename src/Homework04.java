import java.util.Scanner;

public class Homework04 {

    public static void main(String args[]) {
        int n, m;
        Scanner sc = new Scanner(System.in);

        System.out.print("두 수를 입력하세요: ");
        n = sc.nextInt();
        m = sc.nextInt();

        System.out.printf("두 수의 최대공약수는 %d입니다.", gcd(m, n));
    }

    static int gcd(int a, int b) {
//        System.out.println(a+" "+b);
        if (a == 0 || b == 0) {
            return 0;
        } else if (a % b == 0) {
            return b;
        } else if (b % a == 0) {
            return a;
        }

        if (a > b) {
            return gcd(b, a%b);
        } else {
            return gcd(b%a, a);
        }
    }
}
