package com.example.tictactoe_mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements BoardView{

    TableLayout board;
    BoardPresenter boardPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        board = findViewById(R.id.board);
        boardPresenter = new BoardPresenter(this);

        for (byte row = 0; row <3; row++){
            TableRow tableRow = (TableRow) board.getChildAt(row);
            for (byte col = 0; col <3; col++){
                Button button = (Button) tableRow.getChildAt(col);
                BoardPresenter.CellClickListener cellClickListener = new BoardPresenter.CellClickListener(boardPresenter, row, col);
                button.setOnClickListener(cellClickListener);
            }
        }
    }

    @Override
    public void newGame() {
        TableLayout boardView = findViewById(R.id.board);
        for (byte row = 0; row < 3; row++){
            TableRow tableRow = (TableRow) board.getChildAt(row);
            for (byte col = 0; col <3; col++){
                Button button = (Button) tableRow.getChildAt(col);
                button.setText("");
                button.setEnabled(true);
            }
        }
    }

    @Override
    public void putSymbol(char symbol, byte row, byte col) {
        TableRow tableRow = (TableRow) board.getChildAt(row);
        Button button = (Button) tableRow.getChildAt(col);
        button.setText(Character.toString(symbol));
    }

    @Override
    public void gameEnded(byte winner) {
        TableLayout boardView = findViewById(R.id.board);
        for (byte row = 0; row < 3; row++){
            TableRow tableRow = (TableRow) board.getChildAt(row);
            for (byte col = 0; col <3; col++){
                Button button = (Button) tableRow.getChildAt(col);
                button.setText("");
                button.setEnabled(false);
            }
        }

        switch (winner){
            case BoardView.DRAW:
                Toast.makeText(this, "Game Draw", Toast.LENGTH_LONG).show();
                break;
            case BoardView.PLAYER_1_WINNER:
                Toast.makeText(this, "Player1 wins", Toast.LENGTH_LONG).show();
                break;
            case BoardView.PLAYER_2_WINNER:
                Toast.makeText(this, "Player2 wins", Toast.LENGTH_LONG).show();
                break;
        }
    }

    @Override
    public void invalidPlayer(byte row, byte col) {
        Toast.makeText(this, "Invalid player", Toast.LENGTH_LONG).show();
    }
}