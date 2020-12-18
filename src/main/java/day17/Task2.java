package day17;

/**
 * Добавьте новую “фигуру” в enum ChessPiece, которая будет называться EMPTY. Эта “фигура” будет обозначать пустое
 * пространство на шахматной доске. Ценность этой фигуры равна -1, а строковое обозначение равно нижнему подчеркиванию ("_").
 * Затем создайте класс Шахматная доска (англ. ChessBoard). Этот класс в единственном аргументе конструктора должен
 * принимать на вход двумерный массив шахматных фигур. Этот двумерный массив задает конфигурацию фигур на шахматной доске.
 * Пустое пространство на шахматной доске задается с помощью значения EMPTY. Также, у класса ChessBoard должен быть реализован
 * метод print(), который выводит шахматную доску в консоль.
 * В методе main() класса Task2 создайте новый объект класса ChessBoard, передав ему в качестве аргумента двумерный массив
 * с расположением фигур как на картинке ниже (матч Крамник - Каспаров 2000 года).
 * Затем, используя метод print() выведите шахматную доску в консоль, используя строковые обозначения шахматных фигур.
 * Вывод в консоль должен быть таким:
 * <p>
 * ♜____♜♚_
 * _♖__♟♟_♟
 * ♟_♞___♟_
 * ♛__♗____
 * ___♝♙___
 * ____♗♙__
 * ♙__♕_♙_♙
 * _____♖♔_
 */
public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] pieces = new ChessPiece[8][8];

        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces.length; j++) {
                pieces[i][j] = ChessPiece.EMPTY;
            }
        }
        pieces[0][0] = ChessPiece.ROOK_BLACK;
        pieces[0][5] = ChessPiece.ROOK_BLACK;
        pieces[0][6] = ChessPiece.KING_BLACK;
        pieces[1][1] = ChessPiece.ROOK_WHITE;
        pieces[1][4] = ChessPiece.PAWN_BLACK;
        pieces[1][5] = ChessPiece.PAWN_BLACK;
        pieces[1][7] = ChessPiece.PAWN_BLACK;
        pieces[2][0] = ChessPiece.PAWN_BLACK;
        pieces[2][2] = ChessPiece.KNIGHT_BLACK;
        pieces[2][6] = ChessPiece.PAWN_BLACK;
        pieces[3][0] = ChessPiece.QUEEN_BLACK;
        pieces[3][3] = ChessPiece.BISHOP_WHITE;
        pieces[4][3] = ChessPiece.BISHOP_BLACK;
        pieces[4][4] = ChessPiece.PAWN_WHITE;
        pieces[5][4] = ChessPiece.BISHOP_WHITE;
        pieces[5][5] = ChessPiece.PAWN_WHITE;
        pieces[6][0] = ChessPiece.PAWN_WHITE;
        pieces[6][3] = ChessPiece.QUEEN_WHITE;
        pieces[6][5] = ChessPiece.PAWN_WHITE;
        pieces[6][7] = ChessPiece.PAWN_WHITE;
        pieces[7][5] = ChessPiece.ROOK_WHITE;
        pieces[7][6] = ChessPiece.KING_WHITE;

        ChessBoard chessBoard = new ChessBoard(pieces);
        chessBoard.print();
    }
}
