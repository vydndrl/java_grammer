package C07ExceptionFileParsing.AuthorException;

import java.util.List;
import java.util.NoSuchElementException;

public class AuthorService {

    AuthorRepository authorRepository;

    public AuthorService() {
        authorRepository = new AuthorRepository();
    }

    public void register(String name, String email, String password) throws IllegalArgumentException {

        if (authorRepository.getAuthorList().equals(email)) {
            throw new IllegalArgumentException("이미 동일한 email이 존재합니다.");
        } else if (password.length() <= 5) {
            throw new IllegalArgumentException("비밀번호가 5자리 이하입니다.");
        } else {
            authorRepository.register(new Author(name, email, password));
            System.out.println("성공적으로 회원가입이 완료되었습니다.");
        }
    }

    public void login(String email, String password) throws NoSuchElementException, IllegalArgumentException {
        boolean passwordNotEqual = false;
        boolean emailNotFound = false;

        List<Author> authorList = authorRepository.getAuthorList();

        for (Author a : authorList) {
            if (a.getEmail().equals(email)) {
                emailNotFound = true;
            } else if (a.getPassword().equals(password)) {
                passwordNotEqual = true;
            }
        }

        if (emailNotFound == false) {
            throw new NoSuchElementException("계정이 존재하지 않습니다.");
        }
        if (passwordNotEqual == false) {
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }
    }
}

