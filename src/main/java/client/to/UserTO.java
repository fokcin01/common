package client.to;

public class UserTO {
    private int id;
    private String username;

    public UserTO(Integer id, String username, int price) {

        this.id = id;
        this.username = username;
    }

    public UserTO() {

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
