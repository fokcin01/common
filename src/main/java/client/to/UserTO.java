package client.to;

public class UserTO extends AbstractTo {
    private String username;

    public UserTO(String username) {
        this.username = username;
    }

    public UserTO() {

    }

    @Override
    public String toString() {
        return "User{" +
                ", username='" + username + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
