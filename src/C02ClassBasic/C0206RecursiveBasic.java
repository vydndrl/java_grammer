package C02ClassBasic;

import java.util.Arrays;

public class C0206RecursiveBasic {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
        System.out.println(addACC(10));

        //    피보나치 수열 구현 => 100번째

        int first = 1;
        int second = 1;
        for (int i = 2; i < 100; i++) {
            int temp = first + second;
            first = second;
            second = temp + first;
        }
        System.out.println(second);

        System.out.println("fibonacci(5) = " + fibonacci(100));
    }

    private static int fibonacci(int a) {
        if (a <= 2) {
            return 1;
        }
        return fibonacci(a - 1) + fibonacci(a - 2);
    }


    static int addACC(int n) {
        if (n == 1) {
            return 1;
        }
        return n + addACC(n - 1);
    }



}
