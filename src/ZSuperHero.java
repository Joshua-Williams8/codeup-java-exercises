public class ZSuperHero extends Person {
  private String publicPersona;
  private String name;

  public ZSuperHero(String name){
    super(name);
  }
  public ZSuperHero(String name, String publicPersona){
    super(name);
    this.publicPersona = publicPersona;
  }
  public String alterEgo(){
    return this.getName();
  }
  //@SupressWarnings stops the warnings from preventing a compile, but if anything is going to break, then it won't do anything to stop it from breaking and not compiling.
  //Keep in mind this is an error, aka at compile time
  //An exception is when it breaks during run time due to invalid input.
}
