package application;

import chess.ChessMatch;

/**
 *
 * @author Datafast
 */
public class ChessProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
        
    }
    
}
