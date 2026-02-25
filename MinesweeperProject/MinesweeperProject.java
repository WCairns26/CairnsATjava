import java.util.Scanner;
public class MinesweeperProject {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void fillBoard(char[][] board, char ch) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                board[r][c] = ch;
            }
        }
    }
    public static int countMines(char[][] map, int row, int col) {
        int amount = 0;
        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                if (r >= 0 && r < map.length && c >= 0 && c < map[0].length) {
                    if (!(r == row && c == col)) {
                        if (map[r][c] == 'm') {
                            amount = amount + 1;
                        }
                    }
                }
            }
        }
        return amount;
    }
    public static void generateMap(char[][] map) {
        fillBoard(map, ' ');
        int numMines = 0;
        while (numMines < 10) {
            int r = (int) (Math.random() * map.length);
            int c = (int) (Math.random() * map[0].length);
            if (map[r][c] != 'm') {
                map[r][c] = 'm';
                numMines = numMines + 1;
            }
        }
        for (int r = 0; r < map.length; r++) {
            for (int c = 0; c < map[0].length; c++) {
                if (map[r][c] != 'm') {
                    int amount = countMines(map, r, c);
                    if (amount == 0) {
                        map[r][c] = ' ';
                    } else {
                        map[r][c] = (char) ('0' + amount);
                    }
                }
            }
        }
    }
    public static void printBoard(char[][] board) {
        System.out.print("    ");
        for (int c = 0; c < board[0].length; c++) {
            System.out.print(c + "   ");
        }
        System.out.println();
        System.out.print("   ");
        for (int c = 0; c < board[0].length; c++) {
            System.out.print("----");
        }
        System.out.println();
        for (int r = 0; r < board.length; r++) {
            System.out.print(r + " - ");
            for (int c = 0; c < board[0].length; c++) {
                System.out.print("[" + board[r][c] + "] ");
            }
            System.out.println();
        }
    }
    public static boolean inBounds(char[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board[0].length;
    }
    public static void toggleFlag(char[][] board, int row, int col) {
        if (board[row][col] == '#') {
            board[row][col] = 'f';
        } else if (board[row][col] == 'f') {
            board[row][col] = '#';
        }
    }
    public static boolean reveal(char[][] board, char[][] map, int row, int col) {
        if (board[row][col] == 'f') {
            return true;
        }
        if (board[row][col] != '#') {
            return true;
        }
        if (map[row][col] == 'm') {
            board[row][col] = 'm';
            return false;
        } else {
            board[row][col] = map[row][col];
            return true;
        }
    }
    public static int countSafe(char[][] board) {
        int amount = 0;
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                char ch = board[r][c];
                if (ch != '#' && ch != 'f' && ch != 'm') {
                    amount = amount + 1;
                }
            }
        }
        return amount;
    }
    public static int totalSafe(char[][] map) {
        int amount = 0;
        for (int r = 0; r < map.length; r++) {
            for (int c = 0; c < map[0].length; c++) {
                if (map[r][c] != 'm') {
                    amount = amount + 1;
                }
            }
        }
        return amount;
    }
    public static void mapToBoard(char[][] map, char[][] board) {
        for (int r = 0; r < map.length; r++) {
            for (int c = 0; c < map[0].length; c++) {
                board[r][c] = map[r][c];
            }
        }
    }
    public static int[] getRowCol(Scanner in) {
        System.out.print("Enter row and col: ");
        String line = in.nextLine();
        Scanner lineScanner = new Scanner(line);
        int row = -1;
        int col = -1;
        if (lineScanner.hasNextInt()) {
            row = lineScanner.nextInt();
        }
        if (lineScanner.hasNextInt()) {
            col = lineScanner.nextInt();
        }
        lineScanner.close();
        int[] rc = new int[2];
        rc[0] = row;
        rc[1] = col;
        return rc;
    }
    public static void main(String[] args) {
        char[][] map = new char[9][9];
        char[][] board = new char[9][9];
        generateMap(map);
        fillBoard(board, '#');
        Scanner in = new Scanner(System.in);
        boolean playing = true;
        boolean mineHit = false;
        boolean won = false;
        int totalSafe = totalSafe(map);
        while (playing) {
            clearScreen();
            printBoard(board);
            System.out.println();
            System.out.print("Enter 'f' to flag/unflag a tile, 'r' to reveal a tile, or 'q' to quit: ");
            String cmd = in.nextLine();
            if (cmd.equals("q")) {
                playing = false;
            } else if (cmd.equals("f") || cmd.equals("r")) {
                int[] rc = getRowCol(in);
                int row = rc[0];
                int col = rc[1];
                if (!inBounds(board, row, col)) {
                } else {
                    if (cmd.equals("f")) {
                        toggleFlag(board, row, col);
                    } else {
                        boolean valid = reveal(board, map, row, col);
                        if (!valid) {
                            mineHit = true;
                            playing = false;
                        }
                    }
                }
                int foundSafe = countSafe(board);
                if (foundSafe == totalSafe) {
                    won = true;
                    playing = false;
                }
            } else {
            }
        }
        clearScreen();
        if (mineHit) {
            mapToBoard(map, board);
            printBoard(board);
            System.out.println();
            System.out.println("BOOM!");
            System.out.println("Game Over!");
            System.out.println("Bye, Bye!");
        } else if (won) {
            printBoard(board);
            System.out.println();
            System.out.println("You win!");
            System.out.println("Bye, Bye!");
        } else {
            printBoard(board);
            System.out.println();
            System.out.println("Bye, Bye!");
        }
        in.close();
    }
}