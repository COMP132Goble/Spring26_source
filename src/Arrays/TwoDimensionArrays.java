package Arrays;

public class TwoDimensionArrays {
    public static void main(String[] args) {
        // raggedArray();
        rectangularArray();
    }

    public static void rectangularArray() {
        char[][] board = new char[3][3];

        // Fill the board with '.' to represent an empty space
        for(int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                board[row][col] = '.';
            }
        }

        board[0][0] = 'X';
        board[1][1] = 'X';
        board[2][2] = 'X';

        for(int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void raggedArray() {
        int[][] ragged = new int[3][];

        ragged[0] = new int[2];
        ragged[1] = new int[4];
        ragged[2] = new int[3];

        // Set the value of each entry to the product of its row and col indices
        for(int row = 0; row < ragged.length; row++) {
            for(int col = 0; col < ragged[row].length; col++) {
                ragged[row][col] = row*col;
            }
        }

        // Double the value of all of the even entries.
        for(int row=0;row < ragged.length;row++) {
        	for(int col=0;col<ragged[row].length;col++) {
        		if (ragged[row][col]%2==0) {
        			ragged[row][col]= ragged[row][col] * 2;
        		}
        	}
        }
        
        for(int row=0;row < ragged.length;row++) {
        	for(int col=0;col<ragged[row].length;col++) {
        		System.out.print(ragged[row][col] + " ");
        	}
        	System.out.println();
        }

        // Using a For Each loop
        for(int[] row: ragged) {
            for(int col: row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
