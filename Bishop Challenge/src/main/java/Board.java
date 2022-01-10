import java.util.ArrayList;



//Keep in mind the chessboard goes from a1 to h8 (8x8).
public class Board {
    ArrayList<String> board = new ArrayList<>();
    ArrayList<String> rows = new ArrayList<>();
    ArrayList<String> columns = new ArrayList<>();

    public void createBoard(){
        for(int i = 1; i < 9; i++){
            rows.add(Integer.toString(i));
            System.out.println(rows.get(i-1));
        }

        int limit = 'h';
        int index = 0;
        for(int asciiValue = 'a'; asciiValue <= limit; asciiValue++){
            char c = (char) asciiValue;
            columns.add(Character.toString(c));
            System.out.println(columns.get(index));
            index++;
        }

//        int j = 0;
//        int k = 0;
//        for(int i = 0; i < 64; i++){
//            board.add(columns.get(k)+rows.get(j));
//            System.out.println("Square on board: " + board.get(i) + " @ index: " + i);
//            k++;
//            if(k == 7 && j != 7){
//                j++;
//                k = 0;
//            } else if(j == 7 && k ==8){
//                break;
//            }
//        }
    }

    public ArrayList<String> getRows() {
        return rows;
    }

    public ArrayList<String> getColumns() {
        return columns;
    }
}
