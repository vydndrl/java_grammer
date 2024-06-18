package C07ExceptionFileParsing.AuthorException;

import java.sql.SQLException;
import java.util.Scanner;

public class AuthorController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AuthorService as = new AuthorService();

        while (true) {
            System.out.println("원하시는 서비스를 선택해주세요");
            System.out.println("1. 회원가입 | 2. 로그인");
            int menuNum = Integer.parseInt(sc.nextLine());
            if (menuNum == 1) {
                System.out.println("이름을 입력해주세요");
                String name = sc.nextLine();
                System.out.println("이메일을 입력해주세요");
                String email = sc.nextLine();
                System.out.println("비밀번호를 입력해주세요");
                String password = sc.nextLine();

                try {
                    as.register(name, email, password);
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }

            } else if (menuNum == 2) {
                System.out.println("로그인 할 이메일과 비밀번호를 입력해주세요");
                System.out.println("이메일을 입력해주세요");
                String loginEmail = sc.nextLine();
                System.out.println("비밀번호를 입력해주세요");
                String password = sc.nextLine();
                try {
                    as.login(loginEmail, password);
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
