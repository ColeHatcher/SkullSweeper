package com.mygdx.skullsweeer;

import com.badlogic.gdx.utils.Array;

public class Board {
    int[][] game_board;
    int[][] revealed_board;
    int tiles_per_line;

    public Board () {

    }

    public void reset_board() {
        this.tiles_per_line = 5;

        for (int y = 0; y < this.tiles_per_line; y++) {
            for (int x = 0; x < this.tiles_per_line; x++) {
                this.game_board[y][x] = 0;
            }
        }
    }
}
