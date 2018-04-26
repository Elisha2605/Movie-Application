import java.util.*;
import java.io.*;

public class Account{

   private String[] favoriteMovieList;
   private String[] statistics;
   
   
   public void movieList() throws FileNotFoundException{
      
      Scanner s = new Scanner(new File("title.txt"));
      ArrayList<String> movieList = new ArrayList<>();
      while (s.hasNextLine()){
         movieList.add(s.nextLine());
      }
      for (int i = 0; i<movieList.size(); i++){
         System.out.println(movieList.get(i));
      }   
   }
      
   public void readMovieList() throws FileNotFoundException{
   
   File f = new File("MovieList.txt");
   Scanner scan = new Scanner(f);
   
      while (scan.hasNext()){
         System.out.println(scan.nextLine());
   
      }
   }
   
   public void addMovie(){
      System.out.println("Which movie would you like to add?");
            
      
   }
}