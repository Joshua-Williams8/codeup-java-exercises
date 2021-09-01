package Inheritance;

public class People {
  public static void main(String[] args) {
    Woman Maria = new Woman("Maria");
    Man Stan = new Man("Stan");
    Person dude = new Person("Dude");

    System.out.println(Maria.name);
    System.out.println(Maria.gender);
    Maria.breath();

    System.out.println(Stan.name);
    System.out.println(Stan.gender);
    Stan.breath();

    System.out.println(dude.name);
    System.out.println(dude.gender);
    dude.breath();
  }
}
