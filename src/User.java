//Represent a user of the database

public class User {
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    //Creates a new user with a username, password, and first and last name
    public User(String username, String password, String firstname, String lastname) {

        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    //returns user's username
    public String getUsername(){
        return username;
    }
    //returns user's password
    public String getPassword(){
        return password;
    }
    //returns user's firstname
    public String getFirstname(){
        return firstname;
    }
    //returns user's lastname
    public String getLastname() {
        return lastname;
    }
    //sets new username for specified user
    public void setUsername(String username){
        this.username = username;
    }
    //sets new password for specified user
    public void setPassword(String password){
        this.password = password;
    }
    //sets new firstname for specified user
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    //sets new lastname for specified user
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    //checks if the user's password is correct when logging in
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