import java.util.* ;

public class TypeB extends Thing{
    public Random rand = new Random(System.currentTimeMillis());
    private int timeSinceLast = 0;

    TypeB(int row, int col) {
        super(row, col);
        this.dir = 'b' ;
    }

    public void maybeTurn(Random rand) {
        int i = rand.nextInt(3);

        this.timeSinceLast++;

        if (this.timeSinceLast == 10) {
            this.timeSinceLast = 0;

            if (i == 1) {
                this.rightTurn();
            }

            if (i == 2) {
                this.leftTurn();
            }

        } else {
            if (i == 1) {
                this.rightTurn();
            }

            if (i == 2) {
                this.leftTurn();
            }
        }
    }
}
