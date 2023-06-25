package com.recursive;

public class MazeRun {

	public static void main(String[] args) {
		char[][] maze = {{'+','+','+'},{'.','.','.'},{'+','+','+'}};
		int entrance[] = {1,0};
		MazeRun mazeRun = new MazeRun();
		mazeRun.nearestExit(maze, entrance);

	}
	 public int nearestExit(char[][] maze, int[] entrance) {
	        return backTrack(maze, entrance[0], entrance[1], entrance, 0);
	    }

	    public int backTrack(char[][] maze, int row, int col, int[] entrance, int count){

	        if((col < 0 || row < 0 || row >= maze.length || col >= maze[0].length)){
	            return count;
	        }


	        int top = Integer.MAX_VALUE, bot = Integer.MAX_VALUE, left = Integer.MAX_VALUE, right = Integer.MAX_VALUE;
	        if(maze[row][col] != '+' && maze[row][col] != '-'){
	        	maze[row][col] = '-';
	           right =backTrack(maze, row, col + 1, entrance, count + 1);
	           left =backTrack(maze, row, col - 1, entrance, count + 1);
	           bot =backTrack(maze, row + 1, col, entrance, count + 1);
	           top =backTrack(maze, row - 1, col, entrance, count + 1);
	           
	           return Math.min(Math.min(top, bot), Math.min(left,right));
	        }
	        return Integer.MAX_VALUE;

	        
	    }

}
