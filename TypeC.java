import java.util.*;

public class TypeC extends Thing {
    private int timeSinceLast = 0 ;

    TypeC(int row, int col) {
        super(row, col);
        this.lab = 'c' ;
    }

    @Override
    public void maybeTurn(Random rand) {
        if(this.timeSinceLast == 5) {
            this.timeSinceLast = 0; 
            this.rightTurn() ;
        }
    }
}
