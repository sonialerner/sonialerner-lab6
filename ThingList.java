  import java.lang.String;
  
  /**
   * YOU'LL NEED TO PUT THIS SOMEWHERE ELSE
   * HINT: WOULDN'T IT BE NICE TO HAVE A LIST OR QUEUE SO THAT
   *       WE DON'T HAVE TO USE NODES HERE?
   * This class is for linked lists of Thing's
   */
  public class ThingList {
    public Node head ;

    ThingList(Thing head) {
      Node listHead = new Node(head) ;
      this.head = listHead ;
    }

    private class Node {
      public Thing data ;
      public Node next = null ;

      Node(Thing data) {
        this.data = data ;
      }
    }

    public void add(Thing data) {
      Node node = new Node(data) ;
      node.next = this.head ;
      this.head = node ;
    }

    public void addAll(TypeA a, TypeB b) {
      this.add(a) ;
      this.add(b) ;
    }

    public void printAll() {
      String message = "" ;
      Node curr = this.head ;

      while(curr.next != null) {
        message += this.toString() ;
      }

      // add last element
      message += this.toString() ;

      System.out.println(message) ;
    }

    public void moveAll() {
      for( Thing T = this.head.data; T != null; T = T.next ) {
        T.maybeTurn();
        T.step();
      }
    }
  }