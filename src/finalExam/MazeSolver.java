package finalExam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MazeSolver {
	private static final int[][] DIRECTIONS = {
		{-1, 0},  	// up
		{0, 1},		// right
		{1, 0},		// down
		{0, -1}		// left
	};

	public static void main(String[] args) {
		// Example maze (0=open, 1=wall, 2=exit, 3=start)
		int[][] maze = {
			{3, 0, 1, 1, 1},
			{1, 0, 0, 0, 1},
			{1, 1, 1, 0, 1},
			{1, 0, 0, 0, 0},
			{1, 0, 1, 1, 2}
		};

		Position start = findTarget(maze, 3);
		Position exit = findTarget(maze, 2);
	
		System.out.println("Maze Layout:");
		printMaze(maze);

		List<Position> path = findPath(maze, start, exit);

		if(path != null) {
			System.out.println("\nPath found! Steps: " + path.size());
			printPath(maze, path);
		} else {
			System.out.println("\nNo path exists from start to exit");
		}
	}

	/**
	 * Finds a path in a maze using recursive depth-first search
	 * 
	 * @param maze  The 2D array maze
	 * @param start Starting position
	 * @param exit  Target position
	 * @return List of positions forming the path, or null if no path exists
	 */
	public static List<Position> findPath(int[][] maze, Position start, Position exit) {
		Set<String> visited = new HashSet<>();
		List<Position> path = new ArrayList<>();

		boolean found = solve(maze, start, exit, visited, path);

		return found ? path : null;
	}

	/**
	 * Recursive helper method that explores the maze
	 *  
	 * Base Case:
	 * 		When we reach the exit, add it to path and return true
	 * Recursive Case:
	 * 		1. Mark current position as visited
	 * 		2. Try moving in each of the four directions
	 * 		3. For each valid move, recursively search from that position
	 * 		4. If recursion succeeds, add current position to path
	 * 		5. Return true if any direction leads to success, false otherwise
	 */
	private static boolean solve(int[][] maze, Position current, Position exit, Set<String> visited, List<Position> path) {
		// ===== BASE CASE =====
		if(current.equals(exit)) {
			path.add(current);
			return true;
		}
		// ===== RECURSIVE CASE =====
		// Create a unique key for this position (for visited tracking)
		String key = current.row + "," + current.column;
		visited.add(key);

		for(int[] dir:DIRECTIONS) {
			Position next = new Position(
				current.row + dir[0],
				current.column + dir[1]
			);
			// Is this move valid?
			// 1. within bounds
			// 2. not a wall	(value != 1)
			// 3. not already visited
			if(isValidMove(maze, next, visited)) {
				// Recursive call
				if(solve(maze, next, exit, visited, path)) {
					path.add(0, current);
					return true;
				}
			}
		}
		// dead end -- no direction leads to succuss
		return false;
	}

	private static boolean isValidMove(int[][] maze, Position pos, Set<String> visited) {
		// check bounds
		if(pos.row < 0 || pos.row >= maze.length || 
			pos.column < 0 || pos.column >= maze[0].length
		) {
			return false;
		}

		// check if it's a wall
		if(maze[pos.row][pos.column] == 1) {
			return false;
		}

		// check if we've already visited
		if(visited.contains(pos.row + "," + pos.column)) {
			return false;
		}

		return true;
	}

	// ========== Helper Methods =================

	private static void printMaze(int[][] maze) {
		for(int[] row: maze) {
			for(int cell: row) {
				switch (cell) {
					case 0:
						System.out.print(". ");	
						break;
					case 1:
						System.out.print("# ");	
						break;
					case 2:
						System.out.print("X ");	
						break;
					case 3:
						System.out.print("S ");	
						break;
				}
			}
			System.out.println();
		}
	}

	private static void printPath(int[][] maze, List<Position> path) {
		System.out.println("\nSolution path marked with *");
		for(int row = 0; row < maze.length; row++) {
			for(int col = 0; col < maze[row].length; col++) {
				Position pos = new Position(row, col);
				boolean onPath = path.contains(pos);

				if(onPath && maze[row][col] == 0) {
					System.out.print("* ");
				} else {
					switch(maze[row][col]) {	
						case 0:
							System.out.print(". ");	
							break;
						case 1:
							System.out.print("# ");	
							break;
						case 2:
							System.out.print("X ");	
							break;
						case 3:
							System.out.print("S ");	
							break;
					}
				}
			}
			System.out.println();
		}
	}

	private static Position findTarget(int[][] maze, int target) {
		for(int row = 0; row < maze.length; row++) {
			for(int col = 0; col < maze[row].length; col++) {
				if(maze[row][col] == target)
					return new Position(row, col);
			}
		}
		return new Position(0, 0);
	}
}

class Position {
	int row;
	int column;

	Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		return row == other.row && column == other.column;
	}

	@Override
	public int hashCode() {
		return 31 * row + column;
	}

	@Override
	public String toString() {
		return "(" + row + "," + column + ")";
	}
}
