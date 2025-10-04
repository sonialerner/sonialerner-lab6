public class DotChaser {

  /**
   * This static method is ok :)
   */
  public static void main(String[] args) {
    int N = 200;

    if( args.length != 0 )
      N = Integer.parseInt(args[0]);

    // INSTEAD OF A NODE, CREATE SOMETHING MORE USER-FRIENDLY.
    Thing L = null;
    ThingList list = new ThingList(L) ;
    int count = 0;

    while( true ) {
      // Every N rounds, add another typeA and typeB Thing.
      if( count % N == 0 ) {
        // Add a typeA thing to the list.
        // (GEE, THAT'S A LOT OF CODE FOR JUST CREATING ONE THING)
        list.addAll(new TypeA(45, 50), new TypeB(55, 50));
      }

      // Print out each thing.
      // (SEEMS LIKE A NICE PRINTALL() METHOD CALL WOULD WORK HERE)
      // (SEEMS LIKE A toString() METHOD IN THE CLASS WOULD ALSO BE NICE)
      list.printAll() ;

      System.out.println("done");
      System.out.flush();

      // Move each thing.
      // (SEEMS LIKE A NICE MOVEALL() METHOD CALL WOULD WORK HERE)
      list.moveAll() ;
      count++;
    }
  }
}
