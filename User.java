public class User{

   private String name;
   private int ID;
   private String password;
   
   public User(String name, int ID, String password){
      this.name = name;
      this.ID = ID;
      this.password = password;
   }
   
   public void setUserInfo(String name, int ID, String password){
      this.name = name;
      this.ID = ID;
      this.password = password;   
   }
   
   public String getName(){
      return name;
   }
   
   public int getID(){
      return ID;
   }
   
   public String getPassword(){
      return password;
   }
}