package client.to;

public class UserTO extends AbstractTo {
    private String username;
    private String userPassword;

    public UserTO(Integer id, String username,String userPassword) {
        super(id);
        this.username = username;
        this.userPassword = userPassword;
    }
    public UserTO() {

    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
