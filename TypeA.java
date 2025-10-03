import java.util.*;

public class TypeA extends Thing {
    public boolean isTypeB = false;

    TypeA(int row, int col, Thing next) {
        super(row, col, next);
    }

    TypeA(int row, int col, char lab, Thing next) {
        super(row, col, lab, next);
    }

    TypeA(int row, int col, int dir, int timeSinceLast, char lab, Thing next) {
        super(row, col, dir, timeSinceLast, lab, next) ;
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
}
