public class Person {
  String name;

  public Person(String name) {
    this.name = name;
  }


  public String getName() {
//TODO: return the person's name
    return this.name;
  }

  public void setName(String name) {
//TODO: change the name property to the passed value
    this.name = name;
  }

  public void sayHello() {
//TODO: print a message to the console using the person's name
    System.out.printf("Hello %s\n", this.name);
  }

  public static void main(String[] args) {
    Person josh = new Person("NotJosh");
    System.out.println(josh.getName());
    josh.setName("Josh");
    josh.sayHello();

    //Code block 1 output should be True, then false? This is a guess.
//    Person person1 = new Person("John");
//    Person person2 = new Person("John");
//    System.out.println(person1.getName().equals(person2.getName()));
//    System.out.println(person1 == person2); //These are 2 different JAva IDs?
    //I was correct

    //Code block 2 output should be false?

//    Person person1 = new Person("John");
//    Person person2 = person1;
//    System.out.println(person1 == person2);// These are the same ID cause we are copying person1?
////I was wrong oof.
//    System.out.println(person2);
//    System.out.println(person1);

    //Code block 3 output should be "John", then null?, then "John, and lastly "Jane"
    Person person1 = new Person("John");
    Person person2 = person1; //Takes all of the properties and now their the same.
    System.out.println(person1.getName());
    System.out.println(person2.getName());
    person2.setName("Jane");
    System.out.println(person1.getName()); //Not sure why person1 got changed unless both are referencing the same data? like how they share ids.
    System.out.println(person2.getName());


  }
}
