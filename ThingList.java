  import java.lang.String;
  import java.util.* ;
  
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

    public void printAll() {
      String message = "" ;
      Thing curr = this.head ;

      while(curr.next != null) {
        message += this.toString() ;
      }

      // add last element
      message += this.toString() ;

      System.out.println(message) ;
    }

    public void moveAll(ThingList list) {
      for( Thing T = list.head; T != null; T = T.next ) {
        if(T.isTypeB == true)
          T.maybeTurn(T);

        T.step(T);
      }
    }
  }