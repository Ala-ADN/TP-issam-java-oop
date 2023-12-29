package UserAuthentication;

import java.util.Scanner;

public class Signin {
    private static User currentUser = null;

    public static void signin(Scanner sc){
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        if(currentUser != null){
            System.out.println("Already signed in!");
            return;
        }
        if(Users.exists(username)){
            User user = Users.getUser(username);
            if(user.getPassword().equals(password)){
                currentUser = user;
                System.out.println("Signed in successfully!");
            }
            else{
                System.out.println("Incorrect password!");
            }
        }
        else{
            System.out.println("User does not exist!");
        }
    }

    public static User getCurrentUser() { return currentUser; }
    
}
