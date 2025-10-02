  import java.lang.String;
  
  /**
   * YOU'LL NEED TO PUT THIS SOMEWHERE ELSE
   * HINT: WOULDN'T IT BE NICE TO HAVE A LIST OR QUEUE SO THAT
   *       WE DON'T HAVE TO USE NODES HERE?
   * This class is for linked lists of Thing's
   */
  public class ThingList {
    public Thing head ;

    ThingList(Thing head) {
      this.head = head ;
    }

    public void printAll(ThingList thing) {
      String message = "" ;
      Thing curr = thing.head ;

      while(curr.next != null) {
        message += curr.row + " " + curr.col + " " + curr.lab + "\n" ;
      }

      message += curr.row + " " + curr.col + " " + curr.lab + "\n" ;
      System.out.println(message) ;
    }
  }