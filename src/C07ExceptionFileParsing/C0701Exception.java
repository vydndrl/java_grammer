package C07ExceptionFileParsing;

import javax.management.loading.MLetContent;
import java.sql.SQLException;
import java.util.Scanner;

public class C0701Exception {
    public static void main(String[] args) throws SQLException {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("나눗셈 프로그램입니다.");
////        예외가 발생할 것으로 예상되는 코드에 try로 감싸고
////        에외가 발생 했을 때 대응하는 코드를 catch 작성한다.
//        try {
//            System.out.println("분자 입력");
//            int head = Integer.parseInt(sc.nextLine());
//            System.out.println("분모 입력");
//            int tail = Integer.parseInt(sc.nextLine());
//            int result = head / tail;
//            System.out.println("나눈 결과 값은 " + result);
//
//
////            예외는 catch 구문 순차적으로 검사
//        } catch (ArithmeticException e) {
//            System.out.println("0으로 나누시면 안 됩니다.");
////            예외가 발생된 내역 로그를 남기기 위함.
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        } catch (NumberFormatException e) {
//            System.out.println("숫자에 맞는 값을 입력해주세요");
//            e.printStackTrace();
////            Exception: 모든 예외의 조상 클래스
//        } catch (Exception e) {
//            System.out.println("예외가 발생했습니다.");
//            e.printStackTrace();
//        } finally {
//            System.out.println("무조건 실행되는 구문입니다.");
//        }
//        System.out.println("감사합니다.");

//        throws : 예외처리 위임을 명시
        login("1234");
        try {
            login2("1234");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //    unchecked 예외에서는 throws 키워드가 예외사항을 명시하는 용도로만 사용된다.
    static void login(String password) throws IllegalArgumentException {
        if (password.length() < 10) {
//            throw new : 예외를 강제로 발생
//            예외는 기본적으로 메소드를 호출한 쪽에 전파
//            unchecked 예외는 예외 처리가 강제되지 않음
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        }
        if (password.contains("*")) {
            throw new RuntimeException("예외 발생");
        }
    }

    static void login2(String password) throws SQLException{
////        방법1 직접 예외 처리
//        try {
//            if (password.length() < 10) {
//                throw new SQLException("DB 조회 상황에서 예외가 발생했습니다.");
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }

//        방법2. 메서드를 호출한 쪽에 위임: throws
        if (password.length() < 10) {
                throw new SQLException("DB 조회 상황에서 예외가 발생했습니다.");
        }
    }
}