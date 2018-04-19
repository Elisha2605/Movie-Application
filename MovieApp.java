import java.util.Scanner;

public class MovieApp{

   
   public static User[] user = new User[5];
   public static int[] ID = new int[5]; 
   public static Scanner scan = new Scanner(System.in);
   
   public static void main(String[] args){
      
      // nye User objekter
      // ID arrays
      
      //user
      user[0]= new User("Josephine", 0, "000");
      user[1]= new User("Peter", 1, "111");
      user[2]= new User("Sarah", 2, "222");
      Scanner scan2 = new Scanner(System.in);
      int input2 = scan2.hasNextInt();
    
      
      for (int i = 0; i <= user.length; i++) {
         if (user[i].getID() == input2) {
            System.out.println("Please enter your password:");
         }
      }
   
   }
   
   //LogInd menu
   public static void logIn(){
   System.out.println("Would you like to log in or register an account?");
   System.out.println("1: Log in");
   System.out.println("2: Register");
   
   int input = scan.nextInt();
   
   switch(input){
      case 1: 
         System.out.println("Please enter you ID number");
         
         while(input.nextInt()){
         
         }
         
         System.out.println("Please enter you ID number.");

   
   }
   }
   
}