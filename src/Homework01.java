import java.util.Scanner;

public class Homework01 {
    public static void main(String args[]) {
        int ans = 0;
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            System.out.printf("정수를 입력하세요: ");
            ans += sc.nextInt();
            System.out.printf("현재까지 입력된 정수의 합은 %s입니다.\n", ans);
        };

    }
}
