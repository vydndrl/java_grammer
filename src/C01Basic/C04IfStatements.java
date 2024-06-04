package C01Basic;

import java.util.Scanner;

public class C04IfStatements {
    public static void main(String[] args) {

//        도어락키 if문
//        int answer = 1234;

        Scanner sc = new Scanner(System.in);
//        System.out.println("비밀번호를 입력해주세요");
//        int pwd = sc.nextInt();

//        if (pwd == answer) {
//            System.out.println("비밀번호가 일치합니다");
//        } else {
//            System.out.println("비밀번호가 틀렸습니다.");
//        }

//        알파벳이 소문자인지 대문자인지 판별하는 프로그램
//        소문자 알파벳, 대문자 알파벳, 그 외
//        소문자 1글자 입력시 소문자입니다.
//        대문자 1글자 입력시 대문자입니다.
//        그 외 문자 입력 시 알파벳이 아닙니다.
//        System.out.println("알파벳을 입력해주세요.");
//        char ch1 = sc.nextLine().charAt(0);
//        if(ch1 >= 'a' && ch1 <= 'z' ) {
//            System.out.println("대문자입니다.");
//        } else if(ch1 >= 'A' && ch1 <= 'Z') {
//            System.out.println("소문자입니다.");
//        } else {
//            System.out.println("알파벳이 아닙니다.");
//        }

//        택시요금: 10000, 버스요금: 3000, 킥보드: 2000
//        사용자에게 얼마가 있는지 물어보고 구간별로 교통수단 추천

        System.out.println("보유 금액을 입력해주세요");
        int money = sc.nextInt();
        if (money >= 10000) {
            System.out.println("택시를 추천합니다.");
        } else if (money >= 3000) {
            System.out.println("버스를 추천합니다");
        } else if (money >= 2000) {
            System.out.println("킥보드를 추천합니다.");
        } else System.out.println("걸어가세요");

//        if문 독립적으로 존재할 경우에는 정확한 범위 지정을 하지 않으면
//        모든 if문이 중복되어 실행 될 가능성이 존재.
        if (money >= 10000) {
            System.out.println("택시를 추천합니다.");
        } if (money >= 3000) {
            System.out.println("버스를 추천합니다");
        } if (money >= 2000) {
            System.out.println("킥보드를 추천합니다.");
        } else System.out.println("걸어가세요");
    }
}

