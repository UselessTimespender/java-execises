package document_viewer;

public class User {
    private String name;
    private UserRole userRole;

    public User(String name, UserRole userRole) {
        this.name = name;
        this.userRole = userRole;
    }

    public String getName() {
        return name;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public enum UserRole {
        VIEWER, WRITER, ADMIN
    }
}
