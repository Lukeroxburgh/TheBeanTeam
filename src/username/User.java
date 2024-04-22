package username;

import java.sql.Connection;
import java.util.List;

public class User {

    private int id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private int age;


    public User(String username, String password, String firstName, String lastName, int age) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public int getId() {
        return id;
    }
    public int getage() {
        return age;
    }
    public String getusername() {
        return username;
    }

    public String getpassword() {
        return password;
    }

    public String getfirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setUserandPass(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
