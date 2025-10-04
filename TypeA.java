import java.util.*;

public class TypeA extends Thing {

    TypeA(int row, int col) {
        super(row, col);
        this.lab = 'r' ;
    }

    @Override
    public void maybeTurn() {
        // TODO Auto-generated method stub
        int i = rand.nextInt(3);

        if (i == 1)
            this.rightTurn();
    
        if (i == 2)
            this.leftTurn();
    }

}
