package client.to;

public class UserTO extends AbstractTo {
    private String username;
    private String userPassword;
    private String userEmail;

    public UserTO(Integer id, String username,String userPassword, String userEmail) {
        super(id);
        this.username = username;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
    }
    public UserTO() {

    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setEmail(String userEmail) {
        this.userEmail = userEmail;
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
