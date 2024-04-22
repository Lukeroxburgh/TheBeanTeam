package username;

public class User {

    private int id;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private int age;


    public User(String username, String password, String firstname, String lastname, int age) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
}
