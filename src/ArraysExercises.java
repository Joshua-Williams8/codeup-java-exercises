import java.util.Arrays;

public class ArraysExercises {

  public static Person[] addPerson(Person[] pArray, Person pObject) {
    Person[] result = Arrays.copyOf(pArray, pArray.length + 1);
    result[pArray.length] = pObject;
    return result;
  }

  public static void main(String[] args) {
    //PPart 1.
    int[] numbers = {1, 2, 3, 4, 5};
//    System.out.println(numbers); //Prints out the object's reference
//    System.out.println(Arrays.toString(numbers));
    Person[] people = new Person[3];

////Below doesn't work
//    people[0].setName("Byran");
//    people[1].setName("Bryce");
//    people[2].setName("Brandon");
//    //This also doesn't work to set the names.
//    people[0].name = ("Byran");
//    people[1].name = ("Bryce");
//    people[2].name = ("Brandon");

//    for (Person human : people) {
//      System.out.println(human.name);
//    }

    people[0] = new Person("Byran");
    people[1] = new Person("Bryce");
    people[2] = new Person("Brandon");

    for (Person human : people){
      System.out.println(human.name);
  }

    //Add person test.
    Person me = new Person("Josh");
     people = addPerson(people, me); //Can also make a new object holding the value.

    for (Person human : people) {
      System.out.println(human.name);
    }


  }
}
