package C01Basic;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C005LoopStatements {
    public static void main(String[] args) {

//        int a = 0;
//        while (a < 10) {
//            System.out.println("hello world");
//            a++;
//        }

//        2~10까지 출력하는 while문 예제
//        int a = 2;
//        while (a <= 10) {
//            System.out.println(a);
//            a++;
//        }

//        입력한 숫자의 구구단 단수 출력
//        Scanner sc = new Scanner(System.in);
//        System.out.println("구구단 숫자 선택");
//        int input = sc.nextInt();
//        int num = 1;
//        while (num < 10) {
//            System.out.println(input + " x " + num + " = " + input * num);
//            num++;
//        }

//        1.반복되는 도어락키 예제
//        2.int를 string 변경
//        3.비밀번호 일치하면 종료. break;
//        4.비밀번호가 5회이상 틀리면 종료

//        Scanner sc = new Scanner(System.in);
//        String answer = "1234";
//        int cnt = 0;
//        while (cnt < 5) {
//            System.out.println("비밀번호를 입력해주세요");
//            String pwd = sc.nextLine();
//
//            if (pwd.equals(answer)) {
//                System.out.println("비밀번호가 일치합니다");
//                break;
//            } else {
//                System.out.println("비밀번호가 틀렸습니다.");
//                cnt++;
//            }
//        }
//        System.out.println("5회 이상 실패");

//        int num = 1234;
//        int result = 0;
//        result에 숫자 num을 반대로 뒤집은 숫자값을 넣어주세요
//        while (num > 0) {
//            int temp = num % 10;
//            result = result * 10 + temp;
//            num /= 10;
//        }
//        System.out.println(result);

//        do while문: 무조건 1번은 실행되는 반복문
//        int a = 100;
//        do {
//            a++;
//            System.out.println(a);
//        } while (a < 10);

//        2~10까지 출력을 for문을 활용하여 출력
//        for (int i = 2; i <= 10; i++) {
//            System.out.println(i);
//        }

//        1~10중에 홀수만 출력하기
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 1) System.out.println(i);
//        }

//        1~20까지의 수 중에 짝수를 모두 더한 값
//        int sum = 0;
//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);

//        최대공약수 구하기
//        int a = 24;
//        int b = 36;
//        int max = a > b ? a : b;
//        int result = 0;
//        for (int i = 1; i <= max; i++) {
//            if (a % i == 0 && b % i == 0) {
//                result = i;
//            }
//        }
//        System.out.println(result);

//        소수 구하기: 1과 자기 자신을 제외한 숫자로 나누어지지 않는 수
//        1~24까지 수 중에 소수를 출력
//        int cnt;
//        for (int i = 2; i <= 24; i++) {
//            cnt = 0;
//            for (int j = 1; j <= 24; j++) {
//                if(i % j == 0) {
//                    cnt++;
//                }
//            }
//            if(cnt == 2) {
//                System.out.println(i);
//            }
//        }
//
//        사용자가 입력한 특정값이 소수인지 아닌지
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        boolean tureOrNot = false;
//        for (int i = 2; i*i < input; i++) {
//            if(input % i == 0) {
//                tureOrNot = true;
//                break;
//            }
//        }
//        if(tureOrNot == false) {
//            System.out.println("소수입니다.");
//        }

//        홀수만 출력하기 1~10까지
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//            System.out.println(i);
//        }

//       배열과 enhanced for문(향상된 for문 - for each문)
//        int[] arr = {1, 3, 5, 7, 9};
//        일반 for문
//        for (int i = 0; i < 5; i++) {
//            System.out.println(arr[i]);
//        }
//        향상된 for문: 반복 횟수는 arr에 들어가있는 데이터 개수만큼 반복
//        for (int i : arr) {
//            System.out.println("i = " + i);
//        }
//        일반 for문을 통한 arr 값 변경 후 출력
//        for (int i = 0; i < 5; i++) {
//            arr[i] += 10;
//        }
//        System.out.println("arr = " + Arrays.toString(arr));

//        향상된 for문을 통한 arr 값 변경 후 출력
//        향상된 for문으로는 실제 arr 값의 변경은 불가능
//        for(int i : arr) {
//            i += 10;
//        }
//        System.out.println("arr = " + Arrays.toString(arr));

//        자바 변수의 유효범위 : {}
//        int num = 10;
//        if(num > 1) {
//            int abc = 20;
//            num = 20;
//        abc = 30: if문 중괄호 밖에서는 abc변수의 존재를 모름
//        System.out.println(num);
//        System.out.println(abc);

//    int a= 10;

//        다중 반복문
//        구구단
//        for (int i = 2; i < 10; i++) {
//            System.out.println(i + "단 입니다.");
//            for (int j = 1; j <10; j++) {
//                System.out.println(i + " x " + j + " = " + i * j);
//            }
//        }

//        라벨문
//        loop1:
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.println("Hello world");
//                if (j == 2) {
//                    break loop1;
//                }
//            }
//        }

//        라벨문 활용해서 값 찾기
        int[][] arr = {{1, 2, 3}, {4,5,6}, {7,8,9}, {10,11,12}};
        int target = 11;
        loop1:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println(i + ", " + j + "에 " + target + "이 있습니다.");
                    break loop1;
                }
            }
        }
        
        
    }
}
