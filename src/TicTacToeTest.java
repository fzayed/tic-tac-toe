import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest extends TicTacToe{

    @org.junit.jupiter.api.Test
    void testMain() {
        String [] gameBoard = {"0","1","2","3","4","5","6","7","8"};
        String turn = "X";

        int number = 0;
        Assertions.assertEquals(gameBoard[0], String.valueOf(number));
        gameBoard[number] = turn;

        number = 4;
        Assertions.assertEquals(gameBoard[4], String.valueOf(number));
        gameBoard[number] = turn;

        number = 8;
        Assertions.assertEquals(gameBoard[8], String.valueOf(number));
        gameBoard[number] = turn;
    }

    @org.junit.jupiter.api.Test
    void testDraw() {
        String[] gameBoard = {"0","1","2","3","4","5","6","7","8"};
        String turn = "X";
        int number = 0;
        draw(gameBoard, number, turn);
        Assertions.assertEquals(gameBoard[0], turn, "Pass");
        number = 4;
        draw(gameBoard, number, turn);
        Assertions.assertEquals(gameBoard[4], turn, "Pass");
        number = 8;
        draw(gameBoard, number, turn);
        Assertions.assertEquals(gameBoard[8], turn, "Pass");
    }

    @org.junit.jupiter.api.Test
    void testCheckWinner() {
        String[] gameBoard = {"X","1","2","3","X","5","6","7","X"};
        int i = checkWinner(gameBoard);
        Assertions.assertEquals(0,i);//0 is X win
        gameBoard[0] = "0";
        gameBoard[4] = "4";
        gameBoard[8] = "8";
        gameBoard[3] = "O";
        gameBoard[4] = "O";
        gameBoard[5] = "O";
        int j = checkWinner(gameBoard);
        Assertions.assertEquals(1,j);//1 is 0 win

    }
}