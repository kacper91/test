package challenges;

public class User {
    private String login;
    private String username;
    private String lastname;
    private int age;

    public User(String login, String username, String lastname, int age) {
        this.login = login;
        this.username = username;
        this.lastname = lastname;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public String getUsername() {
        return username;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }


}
