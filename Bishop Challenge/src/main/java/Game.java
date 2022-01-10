import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Board board = new Board();
        board.createBoard();
        Bishop bishop = new Bishop();
        Scanner s = new Scanner(System.in);

        String start = s.nextLine();
        String end = s.nextLine();
        int n = Integer.parseInt(s.nextLine());

    }
}
