package ija.ija2022.homework2.tool.common;

public interface MazeObject {
    boolean canMove(Field.Direction dir);
    boolean move(Field.Direction dir);

}
