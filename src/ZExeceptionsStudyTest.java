
public class ZExeceptionsStudyTest {

  public static void main(String[] args) {
    ZExeceptionsStudy study = new ZExeceptionsStudy();

//    try {
//      System.out.println(study.definitelyNotAnInt);
//      System.out.println(study.maybeAnInt);
//      System.out.println(Integer.parseInt(study.maybeAnInt));
//      System.out.println(Integer.parseInt(study.definitelyNotAnInt));// Causes an exception cause it happens at run time not compile.
//    } catch (NumberFormatException nfe) {
//      //We tell java what to do if an exception happens...
//      System.out.println("Caught the exception... and kept the program runnin.");
////      System.out.println(nfe);
//      nfe.printStackTrace();// prints the exception here instead of where ever...?
//
//    }
      study.askForAnInt();



  }
}
