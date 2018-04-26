import java.util.Scanner;
import java.io.*;

public class MovieApp {

   public static User[] user = new User[5];
   private static String name;
   private static int ID;  
   private static Scanner scan = new Scanner(System.in);
   private static int currentUser = 0;
   
   public static void main(String[] args) throws IOException {
      // nye User objekter
      
      Account account = new Account(); 
      
      // users
      user[0] = new User("Josephine", 0, "");
      user[1] = new User("Peter", 1, "");
      user[2] = new User("Sarah", 2, "");
      user[3] = new User("Empty user", 3, "");
      
      //account.readMovieList();
      account.movieList();
      
      //logIn();
      
   }
   
   //LogInd menu
   public static void logIn() {
      boolean loginLoop = true;
      int optionLogin;
      while (loginLoop) {
         System.out.println("1: Log in");
         System.out.println("2: Register");
      
         optionLogin = getInt("What would you like to do?");
   
         if (optionLogin == 1) {
            for (int i = 0; i < 4; i++) {
               System.out.println(user[i].getID() + ": " + user[i].getName());
            }
            currentUser = getInt("Please pick a user from the list:");
         }
         else if (optionLogin == 2) {
            System.out.println("Please enter your name: ");
            String registerName = scan.next();
            user[3] = new User(registerName, 3, "");
            System.out.println("You have successfully opened a new account.");
            System.out.println("Your name " + user[3].getName() + " has been assigned the ID " + user[3].getID());
         }
         // Logget ind
         boolean run = true;
         int option;
         while (run) {
            System.out.println("Hello " + user[currentUser].getName());
            break;
         }
      }
   }
   
   public static int getInt(String prompt) {
      Scanner scanInt = new Scanner(System.in);
      System.out.print(prompt);
      while (!scanInt.hasNextInt()) {
         scanInt.next();
         System.out.print(prompt);
      }
      return scanInt.nextInt();
   }
}
   
