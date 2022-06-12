package _04_Maze_Maker;
import java.awt.Color;
import java.awt.Graphics;

public class Cell {
    public static final int MARGIN = 100;

    private int row;
    private int col;

    private int size = 100;

    private boolean visited;

    private boolean northWall;
    private boolean southWall;
    private boolean eastWall; 
    private boolean westWall;

    public Cell(int row, int col){
        this.row = row;
        this.col = col;

        visited = false;

        northWall = true;
        southWall = true;
        eastWall = true;
        westWall = true;
    }

    public void draw(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval((col * size) + (size / 2) + MARGIN, (row * size) + (size / 2) + MARGIN, 4, 4);

        g.setColor(Color.RED);

        if(northWall){
            g.drawLine((col * size) + MARGIN, (row * size) + MARGIN, (col * size) + size + MARGIN, (row * size) + MARGIN);
        }
        if(southWall){
            g.drawLine((col * size) + MARGIN, (row * size) + size + MARGIN, (col * size) + size + MARGIN, (row * size) + size + MARGIN);
        }
        if(eastWall){
            g.drawLine((col * size) + size + MARGIN, (row * size) + MARGIN, (col * size) + size + MARGIN, (row * size) + size + MARGIN);
        }
        if(westWall){
            g.drawLine((col * size) + MARGIN, (row * size) + MARGIN, (col * size) + MARGIN, (row * size) + size + MARGIN);
        }
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public boolean hasBeenVisited() {
        return visited;
    }

    public void setBeenVisited(boolean beenVisited) {
        this.visited = beenVisited;
    }

    public boolean hasNorthWall() {
        return northWall;
    }

    public void setNorthWall(boolean northWall) {
        this.northWall = northWall;
    }

    public boolean hasSouthWall() {
        return southWall;
    }

    public void setSouthWall(boolean southWall) {
        this.southWall = southWall;
    }

    public boolean hasEastWall() {
        return eastWall;
    }

    public void setEastWall(boolean eastWall) {
        this.eastWall = eastWall;
    }

    public boolean hasWestWall() {
        return westWall;
    }

    public void setWestWall(boolean westWall) {
        this.westWall = westWall;
    }
}
