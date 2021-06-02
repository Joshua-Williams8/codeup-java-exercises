package oopLecture;

public class User {
  public String username;
//  String packagePrivate;
//  public String password;
  private String password;

  public String email;
  public int id;

//If we make something private it will only beable to be used in this calss?
  public String getPassword(){
    return password;
  }
  public String setPassword(String passwordNew){
    return this.password = passwordNew;
  }
  public User(String username, String password, String email) {
    this.username = username;
    this.password = password;
    this.email = email;
    //This is where we go ahead and assign default values as we make an object?
  }
  public User(){}

  //shortcut right click, hit generate, then constructor... etc
  public User(String username, String password, String email, int id) {
    this.username = username;
    this.password = password;
    this.email = email;
    this.id = id;
    //This is where we go ahead and assign default values as we make an object?
  }

  public boolean isLoggedIn;
  public String userDetails;

  public String describeUser() {
    return userDetails;
  }

  public static void main(String[] args) {
    User testUser = new User();
    testUser.username = "Testname";
    testUser.password = "testPass";
    testUser.email = "emailtest";
    System.out.println("Username " + testUser.username);
    System.out.println("Password " +testUser.password);
    System.out.println("Email " +testUser.email);

    User user2 = new User("user2", "pass2", "pass@email.com");
    user2.id = 2;
    System.out.println(user2);

    System.out.println(user2.email);

  }
}


