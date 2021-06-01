import java.util.Scanner;

public class MethodsExercises {
  public static int add(int x, int y) {
    return x + y;
  }

  public static int sub(int x, int y) {
    return x - y;
  }

  public static int multiply(int x, int y) {
    return x * y;
  }

  public static int multiplyLoop(int x, int y) {
    int result = x;
    for (int i = 1; i < y; i++) {
      result = result + x;
    }
    return result;
  }

  public static int multiplyRec(int x, int y, int xAgain) {
    y--;
    if (y <= 0) {
      return x;
    } else {
      return multiplyRec(x + xAgain, y, xAgain);
    }
  }

  public static int divide(int x, int y) {
    return x / y;
  }

  public static int mod(int x, int y) {
    return x % y;
  }

  public static long getIntegerPlease(long min, long max) {
    Scanner sc = new Scanner(System.in);

    System.out.printf("Please enter a number between %d and %d\n", min, max);
    long userNum = sc.nextInt();

    if (userNum >= min && userNum <= max) {

      System.out.println("You picked a good number...");
      return userNum;
    } else {
      return getIntegerPlease(min, max);
    }
  }

  public static long factorial(long userNum) {
    Scanner sc = new Scanner(System.in);
    if (userNum > 20) {
      System.out.println("Enter a new max, because 20 is the largest max you can use.");
      long newNum = sc.nextLong();
      return factorial(newNum);
    }
    long lastNum = 1;
    String result = "#d! = ";

    for (long i = 1; i <= userNum; i++) {
//        System.out.println(lastNum);
      result += String.valueOf(i) + " x ";
      lastNum = lastNum * i;
//        System.out.println(lastNum);
    }
    System.out.println(lastNum);
    result = result.trim().substring(0, result.length() - 2);
    result = result.replace("#d", String.valueOf(userNum));
    System.out.printf("%s = %d\n", result, lastNum);
    System.out.println("If you would like to continue enter y.");
    Scanner yn = new Scanner(System.in);
    String yesNo = yn.nextLine();
    if (yesNo.equals("y")) {
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter a minimum check");
      long mini = input.nextInt();
      System.out.println("Please enter a maximum check");
      long maxi = input.nextInt();
      return factorial(getIntegerPlease(mini, maxi));

    } else {
      return lastNum;
    }
  }


  public static long getInteger(long min, long max) {
    Scanner sc = new Scanner(System.in);

    if (max > 20) {
      System.out.println("Enter a new max, because 20 is the largest max you can use.");
      long newMax = sc.nextLong();
      return getInteger(min, newMax);
    }
    System.out.printf("Please enter a number between %d and %d\n", min, max);
    int userNum = sc.nextInt();
    long lastNum = 1;
    String result = "#d! = ";
    if (userNum >= min && userNum <= max) {
      System.out.println("You picked a good number...");
      for (int i = 1; i <= userNum; i++) {
//        System.out.println(lastNum);
        result += i + " x ";
        lastNum = lastNum * i;
//        System.out.println(lastNum);
      }
      System.out.println(lastNum);
      result = result.trim().substring(0, result.length() - 2);
      result = result.replace("#d", String.valueOf(userNum));
      System.out.printf("%s = %d\n", result, lastNum);
      System.out.println("If you would like to continue enter y.");
      Scanner yn = new Scanner(System.in);
      String yesNo = yn.nextLine();
      if (yesNo.equals("y")) {
        return getInteger(min, max);
      } else {
        return lastNum;
      }
    } else {
      return getInteger(min, max);
    }
  }

  public static int diceRoll(int diceSides) {
    int roll = (int) (Math.random() * diceSides + 1);
    return roll;
  }

  public static int diceRollApp() {
    Scanner sc = new Scanner(System.in);

    System.out.println("How many sides are on the pair of dice?");
    int sides = sc.nextInt();
    int result = 0;
    System.out.println("Press r then enter to roll the di.");
    Scanner confirm = new Scanner(System.in);
    String yes = confirm.nextLine();
    if (yes.equalsIgnoreCase("r")) {
      int dice1 = diceRoll(sides);
      System.out.printf("...You rolled a %d!\n", dice1);
      int dice2 = diceRoll(sides);
      System.out.printf("...Your second dice rolled a %d!\n", dice2);
      System.out.printf("%d Is your total.\n",dice1 + dice2);

      System.out.println("Press r to roll again.");
      yes = confirm.nextLine();
      if (yes.equalsIgnoreCase("r")) {
        return diceRollApp();
      } else {
        System.out.println("Have a good day.");
        return dice1 + dice2;
      }
    } else {
      System.out.println("Bye!");
      return 0;
    }

  }


  public static void main(String[] args) {
    //Part 1
//    System.out.println(add(1,2));//equals 3
//    System.out.println(sub(4,3));// equals 1
//    System.out.println(multiply(3,3));//equals 9
//    System.out.println(divide(8,2));//equals 4
//    System.out.println(mod(12,5));//equals 2
//    System.out.println(divide(4,0)); //returns errors?
    //Part 1 Bonus
//    System.out.println(multiplyLoop(2,3));
//    System.out.println(multiplyRec(2,3,2));

    //Part 2 (done)
    Scanner sc = new Scanner(System.in);
    //getIntegerPlease(1,10);
    //getIntegerPlease(1,22);

    //Part 3 Original
//    Scanner input = new Scanner(System.in);
//    System.out.println("Please enter a minimum check");
//    int mini = input.nextInt();
//    System.out.println("Please enter a maximum check");
//    int maxi = input.nextInt();
//    getInteger(mini,maxi);


    //PArt 3 redid as intended
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a minimum check");
    long mini = input.nextInt();
    System.out.println("Please enter a maximum check");
    long maxi = input.nextInt();
    factorial(getIntegerPlease(mini, maxi));


    //Part 4
//    diceRollApp();

  }
}
