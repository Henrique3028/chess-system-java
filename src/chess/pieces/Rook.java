package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;
/**
 *
 * @author Datafast
 */
public class Rook extends ChessPiece{

    public Rook(Board board, Color color) {
        super(color, board);
    }

    @Override
    public String toString() {
        return "R";
    }
    
    
    
}
