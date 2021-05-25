import java.lang.reflect.Array;

public class HelloWorld {
  public static void main(String[] args) {


    //josh = 123;
    System.out.print("Hello\n");
    System.out.println(", World");
    //"test".sout *tab*


    //{
//      System.out.println("test");
    byte verySmallInt = 127;
    System.out.println(verySmallInt);
    short smallInt = 32767;
    System.out.println(smallInt);
    int integer = 2000000;
    //long,
    float decimalNum = 1.68F;
    //You need the capital F to cast the data type to be a float.
    double bigdeciNum = 1.41515;
    char singleLetter = 'j'; //You HAVE TO USE SINGLE QUOTES for a char.
    boolean cool = true;
//    System.out.println(decimalNum);
//    System.out.println(singleLetter);
//    System.out.println(cool);

    //Above are PRIMITIVE DATA TYPES

    //below REFERENCE DATA TYPES

    String josh = "Josh";
    Number num1 = 3.14;
    //Array fre = [141,41]
    //System.out.println("slash t \t is tab");
    //constants
    final String NOT_CHANGING = "bada bing";
    System.out.println(NOT_CHANGING);
    //NOT_CHANGING = "FA";

    int sum = 4 + 5;
    System.out.println(sum);
    String sumStringCat = 4 + "5";
    System.out.println(sumStringCat);
    // same functionality with - * / %
    int remainder = 10 % 3;
    System.out.println(remainder);

    remainder++;
    System.out.println(--remainder);
    //Casting
    long testNum = 50000;
    int testInt = 50000;
    //int longIntSum = testNum + testInt;
    //long longIntSum = testNum + testInt;
    int longIntSum = (int) (testNum + testInt);

    int oof = 27;
    double iAmADouble = oof;
    System.out.println(iAmADouble);
    iAmADouble = 3.641598; //It just takes the decimal value off, does not round up.
    oof = (int) iAmADouble;
    System.out.println(oof);
    System.out.println((char) 47);
    //}

    //2nd exercise below
    int myFavoriteNumber = 87;
    System.out.println(myFavoriteNumber);
    String myString = "a string value";
    System.out.println(myString);
    //myString = 's'; //Getting an error because this isn't the datatype for string it's for a character
    myString = "s";
    System.out.println(myString);
    //myString = 3.13159; //Getting an error because this data type is a number not string
    //long myNumber;
    float myNumber = 3.14F;

    //System.out.println(myNumber);
    //myNumber = 3.14; // error because this is a FLOAT.
    myNumber = 123L;
    System.out.println(myNumber);
    myNumber = 123;
//    System.out.println(myNumber);
//    int x = 5;
//    System.out.println(++x); // increment before showing the value
//    System.out.println(x); //Just show the value
    // class is reserved
//    String theNumberThree = "three";
//    Object o = theNumberThree;
//    int three = (int) o;
//    int three = (int) "three"; //Inconvertible types
//
//    int x = 4;
//    x += 5;
//    //x = x + 5
//    System.out.println(x);

//    int x = 3;
//    int y = 4;
//    //y = y * x;
//    y *= x;
//    System.out.println(y);

    int x = 10;
    int y = 2;
    //x = x / y;
    x /= y;
    y -= x;
    //y = y - x;
    System.out.println(y);

    int maxTest = Integer.MAX_VALUE + 1;
    System.out.println(maxTest);
    maxTest += 1;
    System.out.println(maxTest); // It resets and continues adding up, after going  back to the lowest value.
  }

}
//intellj hotkey, you can type the string "string".sout *press tab*
//You can use \n to make a new line.
// You can also do System.out.printIn to make a new line
// A string is a reference data type? look up java data types!
//

//Float can deal with decimal numbers up to 7 positions?
//double same as float but up to 16 positions?
