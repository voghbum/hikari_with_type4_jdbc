package tr.gov.bilgem.tubitak.hikaripool.data.entity;

public class User {
    private Long id;
    private String username;
    private String message;

    public User(Long id, String username, String message) {
        if(id == null)
            throw new IllegalArgumentException("id değeri null olamaz!");

        this.id = id;
        this.username = username;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        if(id == null)
            throw new IllegalArgumentException("id değeri null olamaz!");

        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
