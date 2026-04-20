package mow;
public class Mower {
    private int row;
    private int col;
    private int direction;
    public Mower(int row, int col, int direction) {
        this.row = row;
        this.col = col;
        this.direction = direction;
    }
    public int getRow() {
        return row;
    }
    public void setRow(int newRow) {
        row = newRow;
    }
    public int getCol() {
        return col;
    }
    public void setCol(int newCol) {
        col = newCol;
    }
    public int getDirection() {
        return direction;
    }
    public void setDirection(int newDirection) {
        direction = newDirection;
    }
    public void moveForward() {
        if (direction == 0) {
            row = row - 1;
        } else if (direction == 1) {
            col = col + 1;
        } else if (direction == 2) {
            row = row + 1;
        } else if (direction == 3) {
            col = col - 1;
        }
    }
    public void turnLeft() {
        direction = direction - 1;
        if (direction < 0) {
            direction = 3;
        }
    }
    public void turnRight() {
        direction = direction + 1;
        if (direction > 3) {
            direction = 0;
        }
    }
    public char senseFront(Yard yard) {
        int nextRow = row;
        int nextCol = col;
        if (direction == 0) {
            nextRow = nextRow - 1;
        } else if (direction == 1) {
            nextCol = nextCol + 1;
        } else if (direction == 2) {
            nextRow = nextRow + 1;
        } else if (direction == 3) {
            nextCol = nextCol - 1;
        }
        return yard.getCell(nextRow, nextCol);
    }
    public void mow(Yard yard) {
        yard.setCell(row, col, ' ');
    }
}