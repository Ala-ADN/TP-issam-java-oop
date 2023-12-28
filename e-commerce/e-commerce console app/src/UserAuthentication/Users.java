package UserAuthentication;
import java.util.HashMap;

public class Users {
    private HashMap<String, User> Users = new HashMap<String, User>();

    public Users() {
        this.Users = new HashMap<String, User>();
    }

    public void addUser(User User) {
        if(this.Users.containsKey(User.getUsername())){
            System.out.println("User already exists!");
            return;
        }
        this.Users.put(User.getUsername(), User);
        System.out.println("User added successfully!");
    }

    public void removeUser(String username) {
        if(!this.Users.containsKey(username)){
            System.out.println("User does not exist!");
            return;
        }
        this.Users.remove(username);
        System.out.println("User removed successfully!");
    }

}
