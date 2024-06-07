package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {

//        참조자료형: 기본 자료형을 제외한 모든 자료형
//        WrapperClass: 기본형 타입을 Wrapping한 클래스
//        int와 Integer간 형변환
//        int a = 10;
//        Integer b = new Integer(20);
//        오토 언박싱: Integer -> int 형변환
//        int c = b;
//        오토 박싱
//        Integer d = a;

//        String과 int의 형변환
//        int a = 10;
//        int -> String으로 변환
//        String st1 = Integer.toString(a);
//        String st2 = String.valueOf(a);
//        String -> int
//        int b = Integer.parseInt(st1);

//        참조 자료형에 원시 자료형을 담을 때는 Wrapper 클래스를 사용해야 한다.
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(10);
//        list1.add(10);


//        String 변수 생성 방법
//        객체 생성
//        String st1 = new String("hello");
//        리터럴 방식
//        String st2 = "hello";

//        System.out.println(st1 == st3);
//        System.out.println(st2 == st4);
//        System.out.println(st3 == st4);

//        String 문자열 비교는 equals
//        System.out.println(str1.equals(st3));
//        System.out.println(str2.equals(st4));
//        System.out.println(str3.equals(st4));
//        System.out.println("hello".equalsIgnoreCase("hellO")); // true

//        문자열 길이: length();
//        String st1 = "hello java java";
//        System.out.println(st1.length());
//        indexOf: 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치
//        int index1 = st1.indexOf("java");
//        System.out.println("index1 = " + index1);
//        마지막 문자열의 index 위치
//        System.out.println(st1.lastIndexOf("java"));

//        contains: 특정 문자열이 있는지 여부를 boolean으로 리턴
//        System.out.println(st1.contains("hello"));
//        System.out.println(st1.contains("world"));

//        charAt: 특정 index의 문자(char)값을 리턴
//        String st = "abcdefavbbadas";
//        char ch1 = st.charAt(1);
//        System.out.println("ch1 = " + ch1);
//        위의 문자열에 a의 개수가 몇개인지 count
//        int cnt = 0;
//        for (int i = 0; i < st.length(); i++) {
//            if (st.charAt(i) == 'a') {
//                cnt++;`
//            }
//        }
//        System.out.println("cnt = " + cnt);
//        toCharArray(): String 문자열을 char 배열로 리턴
//        System.out.println(Arrays.toString(st.toCharArray()));
//        toCharArray()를 활용해서 a가 몇갠지 count, 향상된 for문 사용

//        char[] arr = st.toCharArray();
//        for(char c : arr) {
//            if (c == 'a') {
//                cnt++;
//            }
//        }
//        System.out.println("cnt = " + cnt);

//            문자열 더하기: +=
//        String st1= "hello";
//        st1 += " world";
//        System.out.println(st1);

//        특정 문자 제거하기 - 프로그래머스

//        String my_string = "abcdef";
//        String letter = "f";

//        String answer = "";
//        for (int i = 0; i < my_string.length(); i++) {
//            if (my_string.charAt(i) != letter.charAt(0)) {
//                answer += my_string.charAt(i);
//            }
//        }
//        System.out.println("answer = " + answer);
        
//        substring(a,b): a이상 b미만의 index의 문자를 잘라 리턴
//        String st1 = "hello world";
//        System.out.println(st1.substring(0,5));
//        System.out.println(st1.substring(6,st1.length()));

//        String my_string = "abcdef";
//        String letter = "f";

//        String answer = "";
//        for (int i = 0; i < my_string.length(); i++) {
//            if (!my_string.substring(i, i + 1).equals(letter)) {
//                answer += my_string.substring(i, i + 1);
//            }
//        }
//        System.out.println("answer = " + answer);
        
//        가운데 글자 가져오기 - 프로그래머스
//        String s = "abcde";

//        int idx = s.length() / 2;

//        if (s.length() % 2 == 1) {
//            System.out.println(s.substring(idx, idx + 1));
//        }
//        else System.out.println(s.substring(idx - 1, idx + 1));

//        trim., strip: 문자열 양쪽 끝의 공백 제거
//        String trimSt1 = " hello world   ";
//        String trimSt2 = trimSt1.trim();
//        String trimSt2 = trimSt1.strip();
//        System.out.println("trimSt1 = " + trimSt1);
//        System.out.println("trimSt2 = " + trimSt2);
        
//        toUppercase: 대문자로 변환, toLowercase: 소문자로 변환
//        String s1 = "Hello";
//        String s2 = s1.toUpperCase();
//        String s3 = s1.toLowerCase();
//        System.out.println("s2 = " + s2);
//        System.out.println("s3 = " + s3);

//        char -> String 형 변환
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);
//        System.out.println("st1 = " + st1);
        
//        replace(a, b): a 문자열을 b 문자열로 대체
//        String st1 = "hello world";
//        String st2 = st1.replace("world", "java");
//        System.out.println("st2 = " + st2);

//        replaceAll(a, b): replace와 동일, 정규 표현식을 쓸 수 있음.
//        String st1 = "01abc123한글123";
//        String result = "";
//        for문 활용해서 알파벳(소문자) 제거 answer return
//        for (int i = 0; i < st1.length(); i++) {
//            if (!(st1.charAt(i) >= 'a' && st1.charAt(i) <= 'z')) {
//                result += st1.charAt(i);
//            }
//        }
//        System.out.println("result = " + result);
        
//        replaceAll과 정규 표현식 활용
//        String st1 = "01abc123ABC한글123";
/*
        [a-z]+: 1개 이상의 소문자 알파벳 표현하는 정규 표현식
        [A-Za-z]: 대소문자 포함
        [가-힣]+: 한글
        [0-9]+: 숫자
*/
//        String answer = st1.replaceAll("[A-Za-z]+", "");
//        System.out.println("answer = " + answer);

//        String의 matches와 Pattern.matches()
//        String test = "helloA";
//        System.out.println(test.matches("[A-Za-z]+"));

//        boolean b1 = Pattern.matches("[0-9]+", "12345");
//        System.out.println("b1 = " + b1);

//        ^: 정규 표현식의 시작, $: 정규 표현식의 끝, *: 빈 값 포함
//        boolean b2 = Pattern.matches("^[A-Za-z]*$", "helloworld");
//        System.out.println("b2 = " + b2);

//        문자열 다루기 - 프로그래머스
//        String s = "a234";
//        boolean answer = true;
//        answer = Pattern.matches("[0-9]+", s) && (s.length() == 4 || s.length() == 6);
//        System.out.println("answer = " + answer);

//        전화번호 패턴 검증
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            String number = sc.nextLine();
//            if (Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", number)) {
//                System.out.println("올바르게 입력하셨습니다.");
//                break;
//            } else {
//                System.out.println("틀린 형식의 전화번호입니다.");
//            }
//        }

//        이메일 검증: 소문자 알파벳,숫자@소문자 알파벳.com
//        String email = "abc123@naver.com";
//        boolean b3 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", email);
//        System.out.println("b3 = " + b3);
        
//        split: 특정 문자를 기준으로 문자열을 자르는 것, 문자열 배열을 return
//        String a = "a:b:c:d";
//        String[] a_arr = a.split(":");
//        System.out.println("a_arr = " + Arrays.toString(a_arr));
//        String b = "a b c  d";
//        \s: 공백
//        String[] b_arr = b.split("\\s+");
//        System.out.println("b_arr = " + Arrays.toString(b_arr));

//        isEmpty와 null(자료타입)
//        String st1 = null;
//        String st2 = " ";
//        equal 관계가 아님
//        System.out.println(st1 == st2);
//        문제 발생 X
//        System.out.println(st2.isEmpty()); // true
//        문제 발생 O: NullPointer Exception 예외 발생
//        System.out.println(st1.isEmpty()); // false

//        join: String[]을 하나의 String으로 만드는 메서드
//        String[] arr = {"java", "python", "C++", "javascript"};
//        String st = String.join(" ", arr);
//        System.out.println(st);

//        StringBuffer
//        StringBuffer sb1 = new StringBuffer("hello");
//        append: 문자열 가장 뒤에 다른 문자열을 더하는 것
//        sb1.append(" java");
//        sb1.append(" world");
//        String answer = sb1.toString();
//        sb1.insert(5, " python");
//        sb1.delete(17, sb1.length());
//        System.out.println("sb1 = " + sb1);

//        StringBuilder
//        String += < StringBuffer < StringBuilder
//        StringBuilder 는 스레드 safe X
//        StringBuilder sb2 = new StringBuilder();
//        sb2.append("hello");
//        sb2.append("\n"); // 줄 바꿈
//        sb2.append("world");
        
//        StringBuilder 를 사용해서 
//        String my_string = "hello";
//        StringBuilder answer = new StringBuilder();
//        int n = 3; // hhheeellllllooo 결과가 answer에 담기도록
//
//        for (int i = 0; i < my_string.length(); i++) {
//            for (int j = 0; j < n; j++) {
//                answer.append(my_string.charAt(i));
//            }
//        }
//        System.out.println("answer = " + answer);

//        문자열 밀기 - 프로그래머스
//        String A = "hello";
//        String B = "ohell";
//        StringBuilder sb = new StringBuilder();
//        int answer = 0;
//        while (!sb.equals(B)) {
//            sb.insert(0,)
//        }
    }
}
