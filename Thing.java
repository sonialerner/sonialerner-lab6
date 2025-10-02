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
    public int  row, col, dir, timeSinceLast;
    public char lab = 'r';
    public boolean isTypeB;
    public Thing next ;

    Thing(int row, int col, int dir, int timeSinceLast, char lab, boolean isTypeB, Thing next) {
        this.row = row ;
        this.col = col ;
        this.dir = dir ;
        this.timeSinceLast = timeSinceLast ;
        this.lab = lab ;
        this.isTypeB = isTypeB ;
        this.next = next ;
    }

    Thing(int row, int col, char lab, boolean isTypeB, Thing next) {
        this.row = row ;
        this.col = col ;
        this.lab = lab ;
        this.isTypeB = isTypeB ;
        this.next = next ;
    }

    Thing(int row, int col, Thing next) {
        this.row = row ;
        this.col = col ;
        this.next = next ;
    }

    // EEEEEK! STATIC METHODS!!! PLEASE FIND THEM A BETTER HOME.
    public static void rightTurn(Thing t) {
        t.dir = (t.dir + 1) % 4;
    }

    public static void leftTurn(Thing t) {
        t.dir = (t.dir + 3) % 4;
    }

    public static void maybeTurn(Thing t) {
        int i = rand.nextInt(3);

        if (t.isTypeB) {
        t.timeSinceLast++;

        if (t.timeSinceLast == 10) {
            t.timeSinceLast = 0;

            if (i == 1) {
            rightTurn(t);
            }

            if (i == 2) {
            leftTurn(t);
            }
        }
        } else   {
        if (i == 1) {
            rightTurn(t);
        }

        if (i == 2) {
            leftTurn(t);
        }
        }
    }

    public static void step(Thing t) {
        final int[] dc = {
        0, 1, 0, -1
        }, dr = {
        1, 0, -1, 0
        };
        t.row += dr[t.dir];
        t.col += dc[t.dir];
    }
}