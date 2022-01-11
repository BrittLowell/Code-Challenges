import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //Create the starting and ending squares
        Square start = new Square();
        Square end = new Square();

        //Obtain the start and end squares
        start.setColumn((s.nextLine().charAt(0)));
        start.setRow(s.nextInt());
        s.nextLine(); //Skips to next line
        end.setColumn(s.nextLine().charAt(0));
        end.setRow(s.nextInt());
        s.nextLine();
        int n = Integer.parseInt(s.nextLine());


        Moves moves = new Moves();
        System.out.println(moves.bishop(start,end,n));
    }
}
