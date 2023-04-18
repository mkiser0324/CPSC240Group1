

import java.util.HashMap;

public class UserDatabase{

    HashMap<String, User> users = new HashMap<String, User>();
    public UserDatabase(){}
    public boolean addUser(String username, String password, String firstName, String lastName){
        return true;
    }

    public String getUser(String username){
      return username;
    }

    public boolean login(String username, String password){
        return true;
    }

}