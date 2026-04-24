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
        } else {
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
        } else {
            nextCol = nextCol - 1;
        }
        return yard.getCell(nextRow, nextCol);
    }
    public void mow(Yard yard) {
        yard.setCell(row, col, ' ');
    }
    private char senseRight(Yard yard) {
        turnRight();
        char value = senseFront(yard);
        turnLeft();
        return value;
    }
    private char senseLeft(Yard yard) {
        turnLeft();
        char value = senseFront(yard);
        turnRight();
        return value;
    }
    private boolean hasGrass(Yard yard) {
        for (int i = 1; i <= yard.getHeight(); i++) {
            for (int j = 1; j <= yard.getWidth(); j++) {
                if (yard.getCell(i, j) == '+') {
                    return true;
                }
            }
        }
        return false;
    }
    public void randomizeMower(Yard yard) {
        int corner = (int) (Math.random() * 4);
        direction = (int) (Math.random() * 4);

        if (corner == 0) {
            row = 1;
            col = 1;
        } else if (corner == 1) {
            row = 1;
            col = yard.getWidth();
        } else if (corner == 2) {
            row = yard.getHeight();
            col = 1;
        } else {
            row = yard.getHeight();
            col = yard.getWidth();
        }
    }
    public boolean updateMower(Yard yard) {
        if (hasGrass(yard) == false) {
            return false;
        }
        if (senseFront(yard) == '+') {
            moveForward();
            return true;
        }
        if (senseRight(yard) == '+') {
            turnRight();
            moveForward();
            return true;
        }
        if (senseLeft(yard) == '+') {
            turnLeft();
            moveForward();
            return true;
        }
        turnRight();
        if (senseFront(yard) == ' ') {
            moveForward();
            return true;
        }
        turnLeft();
        turnLeft();
        if (senseFront(yard) == ' ') {
            moveForward();
            return true;
        }
        turnRight();
        if (senseFront(yard) == ' ') {
            moveForward();
            return true;
        }
        return false;
    }
}