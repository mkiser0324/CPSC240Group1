import java.util.HashMap;

public class UserDatabase {
    private HashMap<String, User> usersByUsername;

    public UserDatabase() {
        this.usersByUsername = new HashMap<>();
    }

    public boolean addUser(String username, String password, String firstName, String lastName) {
        if (usersByUsername.containsKey(username)) {
            return false;
        }
        User user = new User(username, password, firstName, lastName);
        usersByUsername.put(username, user);
        return true;
    }

    public boolean verifyUser(String username, String password) {
        if (!usersByUsername.containsKey(username)) {
            return false;
        }
        User user = usersByUsername.get(username);
        return user.getPassword().equals(password);
    }

    public User getUserByUsername(String username) {
        if (!usersByUsername.containsKey(username)) {
            return null;
        }
        return usersByUsername.get(username);
    }
}