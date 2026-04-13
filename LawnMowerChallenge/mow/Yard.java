package mow;
public class Yard {
    public char[][] yard;
    public Yard(int height, int width) {
        yard = new char[height + 2][width + 2];
        for (int i = 0; i < yard.length; i++) {
            for (int j = 0; j < yard[0].length; j++) {
                if (i == 0 || i == yard.length - 1 || j == 0 || j == yard[0].length - 1) {
                    yard[i][j] = 'R';
                } else {
                    yard[i][j] = '+';
                }
            }
        }
    }
    public char getCell(int row, int col) {
        return yard[row][col];
    }
    public void setCell(int row, int col, char value) {
        yard[row][col] = value;
    }
    public int getHeight() {
        return yard.length - 2;
    }
    public int getWidth() {
        return yard[0].length - 2;
    }
    public void printYard() {
        for (int i = 0; i < yard.length; i++) {
            for (int j = 0; j < yard[0].length; j++) {
                System.out.print(yard[i][j]);
            }
            System.out.println();
        }
    }
}