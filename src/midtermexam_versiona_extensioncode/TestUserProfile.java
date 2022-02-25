package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserProfile {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        UserProfile user = new UserProfile("","");
        System.out.print("Enter your name: ");
        user.setUserID(input.nextLine());
        
        System.out.println("Comedy " + "Drama " + "Action " + "Mystery ");
        System.out.print("What is your favourite movie genre?: ");
        user.setGenre(input.next());
        
        System.out.println("Your user profile for " + user.getUserID() + 
                " was successfully created");
        
    }
}
