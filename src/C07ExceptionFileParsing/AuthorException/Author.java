package C07ExceptionFileParsing.AuthorException;

public class Author {
    private int id;
    static int static_id =0;
    private String name;
    private String email;
    private String password;

    public Author(String name, String email, String password) {
        static_id += 1;
        id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
