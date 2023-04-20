

public class User {
    private String username;
    private String password;
    private String firstname;
    private String lastname;

    public User(String username, String password, String firstname, String lastname) {

    }

    {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean checkPassword(String password) {
        User user = UserDatabase.getUserByUsername(username);
        if (user.getPassword().equals(password)) {
            // User not found
            return true;
        } else {
            // Check if password matches
            return false;
        }
    }
}