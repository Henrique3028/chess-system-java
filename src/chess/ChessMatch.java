package chess;

import boardgame.Board;

/**
 *
 * @author Datafast
 */
public class ChessMatch  {
    
    private Board board;

    public ChessMatch(Board board) {
        board = new Board(8,8);
    }

    public ChessMatch() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i = 0; i<board.getRows(); i++){
            for(int j = 0; j<board.getColumns(); j++){
                mat[i][j] =(ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }
    
}
