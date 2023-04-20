import java.util.HashMap;

public class UserDatabase {
    private static HashMap<String, User> usersByUsername;

    public UserDatabase() {
        this.usersByUsername = new HashMap<>();
    }

    public void addUser(User user) {
        if (usersByUsername.containsKey(user.getUsername())) {
            System.out.println("Nice");
        }
        //User user = new User(username, password, firstName, lastName);
        usersByUsername.put(user.getUsername(), user);
        System.out.println("Availble");
    }

    public static boolean verifyUser(String username, String password) {
        User user = usersByUsername.get(username);
        if (!usersByUsername.containsKey(username)) {
            //user not found
            return false;
        } else {
            //check if password matches
            return user.getPassword().equals(password);
    }

}

    public static User getUserByUsername(String username) {
        if (!usersByUsername.containsKey(username)) {
            return null;
        }
        return usersByUsername.get(username);
    }

    public boolean containsUser(String username) {
        if (!usersByUsername.containsKey(username)) {
            return false;
        }
        return true;
    }
}