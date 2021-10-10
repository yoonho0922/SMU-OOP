import java.util.Scanner;

public class Homework03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 개의 수를 입력할 예전인가요? ");
        int N = sc.nextInt();
        int[] nums = new int[N];

        System.out.print("수를 입력하세요: ");
        for (int i=0; i < N; i++) {
            nums[i] =sc.nextInt();
        }

        int max = nums[0], min = nums[0];

        for (int i = 1; i < N; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

    }
}
