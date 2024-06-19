package C07ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;

public class AuthorRepository {
    private List<Author> authorList;


    public AuthorRepository() {
        authorList = new ArrayList<>();
    }

    void register(Author author) {
        this.authorList.add(author);
    }

    public List<Author> getAuthorList() {
        return authorList;
    }
}
