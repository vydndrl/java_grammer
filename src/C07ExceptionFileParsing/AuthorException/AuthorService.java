package C07ExceptionFileParsing.AuthorException;

import java.sql.SQLException;

public class AuthorService {

    AuthorRepository authorRepository;

    public AuthorService() {
        authorRepository = new AuthorRepository();
    }

    public void register(String name, String email, String password) throws SQLException {

        if (authorRepository.getAuthorList().equals(email)) {
            throw new SQLException("이미 동일한 email이 존재합니다.");
        } else if (password.length() <= 5) {
            throw new SQLException("비밀번호가 5자리 이하입니다.");
        } else {
            authorRepository.register(new Author(name, email, password));
            System.out.println("성공적으로 회원가입이 완료되었습니다.");
        }
    }

    public void login(String email, String password) throws SQLException {
        Author myAuthor = findAuthor(email);

        if (myAuthor == null) {
            throw new SQLException("계정이 존재하지 않습니다.");
        } else if (!myAuthor.getEmail().equals(email)) {
            throw new SQLException("이메일이 일치하지 않습니다.");
        } else if (!myAuthor.getEmail().equals(password)) {
            throw new SQLException("비밀번호가 일치하지 않습니다.");
        }


    }

    private Author findAuthor(String email) {
        Author myAuthor = null;
        for (int i = 0; i < authorRepository.getAuthorList().size(); i++) {
            if (authorRepository.getAuthorList().get(i).getEmail().equals(email)) {
                myAuthor = authorRepository.getAuthorList().get(i);
            }
        }
        return myAuthor;
    }
}

