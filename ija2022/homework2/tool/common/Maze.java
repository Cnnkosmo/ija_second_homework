package ija.ija2022.homework2.tool.common;

import java.util.ArrayList;
import java.util.List;

public interface Maze {

    public Field getField(int row, int col);

    public int numRows();

    public int numCols();
}
