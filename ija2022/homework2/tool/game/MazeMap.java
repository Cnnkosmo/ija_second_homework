package ija.ija2022.homework1.game;

import ija.ija2022.homework1.common.Field;
import ija.ija2022.homework1.common.Maze;

public class MazeMap implements Maze{

    int rows;
    int cols;

    Field[][] field;

    public MazeMap(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        Field[][] field = new Field[rows][cols];
    }
    @Override
    public Field getField(int row, int col) {
        return null;
    }

    @Override
    public int numRows() {
        return 0;
    }

    @Override
    public int numCols() {
        return 0;
    }
}