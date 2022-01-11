
public class Moves {

    public boolean bishop(Square start, Square end, int n){
        //If the squares are the same, then the answer will be true regardless of the value of n
        if(start.equals(end)){
            return true;
        }

        //Determine how many rows away from the starting square the ending square is.
        int rowDiff = Math.abs(start.getRow()-end.getRow());
        //Determine how many columns away from the starting square the ending square is.
        int columnDiff = Math.abs((int) start.getColumn() - (int) end.getColumn());
        //Get the difference between these numbers to determine whether the starting and ending squares have the
        //same "color" since the bishop can only move on the same color.
        int diff = Math.abs(rowDiff-columnDiff);

        /*
        *If diff equals 0, and n does not equal 0, return true.
        * This is because the start and end squares are on the same diagonal, so the distance can be covered in
        * one move.
         */
        if(diff == 0 && n != 0){
            return true;
        }

        /*
        * If diff%2 = 0, then the squares are both the same color. If n >= 2, then only 2 moves are required
        * to move from the starting square to the ending square.
        * If n = 1 and diff != 0, then it is not possible to go from the starting square to the ending square in
        * one move.
         */
        if(diff%2 == 0){
            return n >= 2;
        }

        return false;
    }
}

