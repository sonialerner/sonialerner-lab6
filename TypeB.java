import java.util.* ;

public class TypeB extends Thing{
    public static Random rand = new Random(System.currentTimeMillis());
    public int timeSinceLast = 0;


    TypeB(int row, int col, int dir, int timeSinceLast, char lab, Thing next) {
        super(row, col, dir, lab, next);
        this.isTypeB = true;
    }

    TypeB(int row, int col, char lab, Thing next) {
        super(row, col, lab, next) ;
        this.isTypeB = true ;
    }

    TypeB(int row, int col, Thing next) {
        super(row, col, next) ;
        this.isTypeB = true ;
    }

    public void maybeTurn(TypeB t) {
        int i = rand.nextInt(3);

        t.timeSinceLast++;

        if (t.timeSinceLast == 10) {
            t.timeSinceLast = 0;

            if (i == 1) {
            rightTurn(t);
            }

            if (i == 2) {
            leftTurn(t);
            }
        } else {
            if (i == 1) {
                rightTurn(t);
            }

            if (i == 2) {
                leftTurn(t);
            }
        }
    }
}
