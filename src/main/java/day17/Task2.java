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
 *
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

        pieces[0][0] = ChessPiece.ROOK_BLACK;
        pieces[0][1] = ChessPiece.EMPTY;
        pieces[0][2] = ChessPiece.EMPTY;
        pieces[0][3] = ChessPiece.EMPTY;
        pieces[0][4] = ChessPiece.EMPTY;
        pieces[0][5] = ChessPiece.ROOK_BLACK;
        pieces[0][6] = ChessPiece.KING_BLACK;
        pieces[0][7] = ChessPiece.EMPTY;
        pieces[1][0] = ChessPiece.EMPTY;
        pieces[1][1] = ChessPiece.ROOK_WHITE;
        pieces[1][2] = ChessPiece.EMPTY;
        pieces[1][3] = ChessPiece.EMPTY;
        pieces[1][4] = ChessPiece.PAWN_BLACK;
        pieces[1][5] = ChessPiece.PAWN_BLACK;
        pieces[1][6] = ChessPiece.EMPTY;
        pieces[1][7] = ChessPiece.PAWN_BLACK;
        pieces[2][0] = ChessPiece.PAWN_BLACK;
        pieces[2][1] = ChessPiece.EMPTY;
        pieces[2][2] = ChessPiece.KNIGHT_BLACK;
        pieces[2][3] = ChessPiece.EMPTY;
        pieces[2][4] = ChessPiece.EMPTY;
        pieces[2][5] = ChessPiece.EMPTY;
        pieces[2][6] = ChessPiece.PAWN_BLACK;
        pieces[2][7] = ChessPiece.EMPTY;
        pieces[3][0] = ChessPiece.QUEEN_BLACK;
        pieces[3][1] = ChessPiece.EMPTY;
        pieces[3][2] = ChessPiece.EMPTY;
        pieces[3][3] = ChessPiece.BISHOP_WHITE;
        pieces[3][4] = ChessPiece.EMPTY;
        pieces[3][5] = ChessPiece.EMPTY;
        pieces[3][6] = ChessPiece.EMPTY;
        pieces[3][7] = ChessPiece.EMPTY;
        pieces[4][0] = ChessPiece.EMPTY;
        pieces[4][1] = ChessPiece.EMPTY;
        pieces[4][2] = ChessPiece.EMPTY;
        pieces[4][3] = ChessPiece.BISHOP_BLACK;
        pieces[4][4] = ChessPiece.PAWN_WHITE;
        pieces[4][5] = ChessPiece.EMPTY;
        pieces[4][6] = ChessPiece.EMPTY;
        pieces[4][7] = ChessPiece.EMPTY;
        pieces[5][0] = ChessPiece.EMPTY;
        pieces[5][1] = ChessPiece.EMPTY;
        pieces[5][2] = ChessPiece.EMPTY;
        pieces[5][3] = ChessPiece.EMPTY;
        pieces[5][4] = ChessPiece.BISHOP_WHITE;
        pieces[5][5] = ChessPiece.PAWN_WHITE;
        pieces[5][6] = ChessPiece.EMPTY;
        pieces[5][7] = ChessPiece.EMPTY;
        pieces[6][0] = ChessPiece.PAWN_WHITE;
        pieces[6][1] = ChessPiece.EMPTY;
        pieces[6][2] = ChessPiece.EMPTY;
        pieces[6][3] = ChessPiece.QUEEN_WHITE;
        pieces[6][4] = ChessPiece.EMPTY;
        pieces[6][5] = ChessPiece.PAWN_WHITE;
        pieces[6][6] = ChessPiece.EMPTY;
        pieces[6][7] = ChessPiece.PAWN_WHITE;
        pieces[7][0] = ChessPiece.EMPTY;
        pieces[7][1] = ChessPiece.EMPTY;
        pieces[7][2] = ChessPiece.EMPTY;
        pieces[7][3] = ChessPiece.EMPTY;
        pieces[7][4] = ChessPiece.EMPTY;
        pieces[7][5] = ChessPiece.ROOK_WHITE;
        pieces[7][6] = ChessPiece.KING_WHITE;
        pieces[7][7] = ChessPiece.EMPTY;

        ChessBoard chessBoard = new ChessBoard(pieces);
        chessBoard.print();
    }
}
