package src.models;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Board {
    private List<List<Cell>> board;

    public Board(int dimension) {
        this.board = new ArrayList<>();
        for (int row=0; row<dimension; row++) {
            this.board.add(new ArrayList<>());
            for (int col=0; col<dimension; col++) {
                this.board.get(row).add(new Cell(row, col));
            }
        }
    }

    public void DisplayBoard() {
        for (int row=0; row < board.size(); row++) {
            for (int col=0; col < board.size(); col++) {
                Cell cell = board.get(row).get(col);
                if (cell.getCellState().equals(CellState.EMPTY)) {
                    System.out.println("|   |");
                } else {
                    System.out.println("| " + cell.getPlayer().getSymbol() + " |");
                }
            }
            System.out.println();
        }
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public void applyMove(Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        this.getBoard().get(row).get(col).setCellState(CellState.FILLED);
        this.getBoard().get(row).get(col).setPlayer(move.getPlayer());

    }
}
