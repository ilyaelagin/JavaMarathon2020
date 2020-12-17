package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece pawnWhite = ChessPiece.PAWN_WHITE;
        ChessPiece rookBlack = ChessPiece.ROOK_BLACK;

        String[] pieces = new String[8];
        for (int i = 0; i < 8; i++) {
            if (i < 4) {
                pieces[i] = pawnWhite.getSymbol();
            } else {
                pieces[i] = rookBlack.getSymbol();
            }
        }
        for(int i = 0; i< pieces.length; i++) {
            System.out.print(pieces[i] + " ");
        }
    }
}