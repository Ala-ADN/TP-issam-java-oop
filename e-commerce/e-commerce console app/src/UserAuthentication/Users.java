package UserAuthentication;
import java.util.HashMap;

public class Users {
    private static HashMap<String, User> Users = new HashMap<String, User>();

    public static void addUser(User User) {
        if(Users.containsKey(User.getUsername())){
            System.out.println("User already exists!");
            return;
        }
        Users.put(User.getUsername(), User);
        System.out.println("User added successfully!");
    }

    public static void removeUser(String username) {
        if(Users.containsKey(username)){
            System.out.println("User does not exist!");
            return;
        }
        Users.remove(username);
        System.out.println("User removed successfully!");
    }

    public static User getUser(String username) {
        if(!Users.containsKey(username)){
            System.out.println("User does not exist!");
            return null;
        }
        return Users.get(username);
    }

    public static boolean exists(String username) {
        return Users.containsKey(username);
    }

    public static void printUsers() {
        for (String username : Users.keySet()) {
            Users.get(username).printDetails();
        }
    }

}
