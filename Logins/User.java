package Logins;

public class User {
    private String userName;
    private String hash;

    protected User(String userName, String hash) {
        this.userName = userName;
        this.hash = hash;
    }

    public String toString() {
        return this.userName + "#" + this.hash;
    }
}
