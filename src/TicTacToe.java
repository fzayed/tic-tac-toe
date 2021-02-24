import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        String [] gameBoard = {"0","1","2","3","4","5","6","7","8"};
        int j = 0;
        String X = "X";
        String O = "O";
        int i;
        System.out.println();
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println(gameBoard[0] + "  | " + gameBoard[1] + " |  " + gameBoard[2]);
        System.out.println("___|___|___");
        System.out.println(gameBoard[3] + "  | " + gameBoard[4] + " |  " + gameBoard[5]);
        System.out.println("___|___|___");
        System.out.println(gameBoard[6] + "  | " + gameBoard[7] + " |  " + gameBoard[8]);
        while(j < 5) {
            System.out.println();
            System.out.println("It's Player " + X + " turn");
            System.out.println("Choose the position you would like to insert at: 0-8");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            if(gameBoard[number] == "X" || gameBoard[number] == "O"){
                System.out.println();
                System.out.println("Position already filled!");
                System.out.println("Select a new position");
                number = input.nextInt();
                draw(gameBoard, number, X);
                i = checkWinner(gameBoard);
                if(i == 0) {
                    System.exit(0);
                }
            }else {
                draw(gameBoard, number, X);
                i = checkWinner(gameBoard);
                if(i == 0) {
                    System.exit(0);
                }
            }
            if(j == 4){
                break;
            }
            System.out.println();
            System.out.println("It's Player " + O + " turn");
            System.out.println("Choose the position you would like to insert at: 0-8");
            int number1 = input.nextInt();
            if(gameBoard[number1] == "X" || gameBoard[number1] == "O"){
                System.out.println();
                System.out.println("Position already filled!");
                System.out.println("Select a new position");
                number1 = input.nextInt();
                draw(gameBoard, number1, O);
                i = checkWinner(gameBoard);
                if(i == 1) {
                    System.exit(0);
                }
            }else {
                draw(gameBoard, number1, O);
                i = checkWinner(gameBoard);
                if(i == 1) {
                    System.exit(0);
                }
            }
            j++;
        }
        System.out.println();
        System.out.println("Its a draw!");


    }

    static void draw(String[] gameBoard, int number, String turn){
        if(turn == "X") {
            gameBoard[number] = "X";
        }else{
            gameBoard[number] = "O";
        }
        System.out.println(gameBoard[0] + "  | " + gameBoard[1] + " |  " + gameBoard[2]);
        System.out.println("___|___|___");
        System.out.println(gameBoard[3] + "  | " + gameBoard[4] + " |  " + gameBoard[5]);
        System.out.println("___|___|___");
        System.out.println(gameBoard[6] + "  | " + gameBoard[7] + " |  " + gameBoard[8]);
    }

    static int checkWinner(String[] gameBoard){
        if (((gameBoard[0] == "X") && (gameBoard[1] == "X") && (gameBoard[2] == "X"))
                || ((gameBoard[3] == "X") && (gameBoard[4] == "X") && (gameBoard[5] == "X"))
                || ((gameBoard[6] == "X") && (gameBoard[7] == "X") && (gameBoard[8] == "X"))
                || ((gameBoard[0] == "X") && (gameBoard[3] == "X") && (gameBoard[6] == "X"))
                || ((gameBoard[1] == "X") && (gameBoard[4] == "X") && (gameBoard[7] == "X"))
                || ((gameBoard[2] == "X") && (gameBoard[5] == "X") && (gameBoard[8] == "X"))
                || ((gameBoard[0] == "X") && (gameBoard[4] == "X") && (gameBoard[8] == "X"))
                || ((gameBoard[2] == "X") && (gameBoard[4] == "X") && (gameBoard[6] == "X"))) {
            System.out.println();
            System.out.println("Player X wins!");
            return 0;
        } else if (((gameBoard[0] == "O") && (gameBoard[1] == "O") && (gameBoard[2] == "O"))
                || ((gameBoard[3] == "O") && (gameBoard[4] == "O") && (gameBoard[5] == "O"))
                || ((gameBoard[6] == "O") && (gameBoard[7] == "O") && (gameBoard[8] == "O"))
                || ((gameBoard[0] == "O") && (gameBoard[3] == "O") && (gameBoard[6] == "O"))
                || ((gameBoard[1] == "O") && (gameBoard[4] == "O") && (gameBoard[7] == "O"))
                || ((gameBoard[2] == "O") && (gameBoard[5] == "O") && (gameBoard[8] == "O"))
                || ((gameBoard[0] == "O") && (gameBoard[4] == "O") && (gameBoard[8] == "O"))
                || ((gameBoard[2] == "O") && (gameBoard[4] == "O") && (gameBoard[6] == "O"))) {
            System.out.println();
            System.out.println("Player O wins!");
            return 1;
        }
        return 2;
    }
}
