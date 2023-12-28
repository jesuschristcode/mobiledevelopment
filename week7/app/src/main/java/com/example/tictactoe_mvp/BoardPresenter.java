package com.example.tictactoe_mvp;

import android.view.View;
import android.widget.Toast;

public class BoardPresenter implements BoardListener{
    private BoardView boardView;
    private Board board;

    public BoardPresenter(BoardView boardView){
        this.boardView = boardView;
        board = new Board(this);
    }

    public void move(byte row, byte col){
        board.move(row, col);
    }

    @Override
    public void playedAt(byte player, byte row, byte col) {
        if (player == BoardListener.PLAYER_1){
            boardView.putSymbol(BoardView.PLAYER_1_SYMBOL, row, col);
        } else if (player == BoardListener.PLAYER_2){
            boardView.putSymbol(BoardView.PLAYER_2_SYMBOL, row, col);
        }
    }

    @Override
    public void invalidPlayer(byte row, byte col) {
        boardView.invalidPlayer(row, col);
    }

    @Override
    public void gameEnded(byte winner) {
        switch (winner){
            case BoardListener.NO_ONE:
                boardView.gameEnded(BoardView.DRAW);
            case BoardListener.PLAYER_1:
                boardView.gameEnded(BoardView.PLAYER_1_WINNER);
            case BoardListener.PLAYER_2:
                boardView.gameEnded(BoardView.PLAYER_2_WINNER);
        }
    }

    static class CellClickListener implements View.OnClickListener{
        BoardPresenter boardPresenter;
        byte row, col;

        public CellClickListener(BoardPresenter boardPresenter, byte row, byte col){
            this.boardPresenter = boardPresenter;
            this.row = row;
            this.col = col;
        }

        @Override
        public void onClick(View v) {
            boardPresenter.move(row, col);
        }
    }
}
