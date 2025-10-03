  import java.lang.String;
  
  /**
   * A "Thing" moves in a grid world. A TypeA Thing randomly
   * decides to turn left or right (or not turn) every "round",
   * and, afterward, takes a step forward.  A TypeB Thing
   * only considers making a random turn every 10th round.
   *
   * A STATIC CLASS? OH NO! GET IT OUT OF HERE!
   */

public class Thing {
    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.
    public int  row, col, dir;
    public char lab = 'r';
    public Thing next ;
    public boolean isTypeB = false;

    Thing(int row, int col, int dir, char lab, Thing next) {
        this.row = row ;
        this.col = col ;
        this.dir = dir ;
        this.lab = lab ;
        this.next = next ;
    }

    Thing(int row, int col, char lab, Thing next) {
        this.row = row ;
        this.col = col ;
        this.lab = lab ;
        this.next = next ;
    }

    Thing(int row, int col, Thing next) {
        this.row = row ;
        this.col = col ;
        this.next = next ;
    }

   public void rightTurn(Thing t) {
        t.dir = (t.dir + 1) % 4;
    }

    public void leftTurn(Thing t) {
        t.dir = (t.dir + 3) % 4;
    }

    public void step(Thing t) {
        final int[] dc = {
        0, 1, 0, -1
        }, dr = {
        1, 0, -1, 0
        };
        t.row += dr[t.dir];
        t.col += dc[t.dir];
    }

    public String toString() {
        return this.row + " " + this.col + " " + this.lab + "\n" ;
    }
}