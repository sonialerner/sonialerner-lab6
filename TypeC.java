import java.util.* ;

public class TypeC extends Thing{

    boolean isTypeB = false ;
    

    TypeC(int row, int col, int dir, int timeSinceLast, char lab, Thing next) {
        super(row, col, dir, timeSinceLast, lab, next);
    }

    TypeC(int row, int col, char lab, Thing next) {
        super(row, col, lab, next) ;
    }

    TypeC(int row, int col, Thing next) {
        super(row, col, next) ;
    }
}
