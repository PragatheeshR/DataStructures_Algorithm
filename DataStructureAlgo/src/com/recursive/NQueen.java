package com.recursive;

import java.util.ArrayList;
import java.util.List;

public class NQueen {

	public static void main(String[] args) {
		
		NQueen queen = new NQueen();
		
		System.out.println(queen.solveNQueens(4));

	}
	
	public List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = '.';
            }    
        }
        List<List<String>> op = new ArrayList<>();
        backTrack(op, 0, n, board);
        return op;
        
    }

    public void backTrack(List<List<String>> op, int row, int n, char[][] board){

        if(row >= n){
            
            List<String> curr = new ArrayList<>();
            for(char[] a : board){
                StringBuilder sb = new StringBuilder();
                for(char c : a){
                        sb.append(c);
                }
                curr.add(sb.toString());
            }
            op.add(curr);
            return;
        }

        for(int col = 0; col < n; col++){
            
            if(!isIntersecting(board, row, col)){
                board[row][col] = 'Q';
                backTrack(op, row + 1, n, board);
                board[row][col] = '.';
            }

        }
    }

    public boolean isIntersecting(char[][] board, int row, int col){

        //check col intersect
        for(int r = row - 1; r >= 0; r--){
            if(board[r][col] == 'Q'){
                return true;
            }
        }
//        //left diagonal check
//
//        for(int r = row - 1;r >= 0; r--){
//            for(int c = col - 1; c >= 0; c--){
//	                 if(board[r][c] == 'Q'){
//	                return true;
//	            }
//            }
//        }
        int r = row - 1;
        int c = col -1;
        
        while(r >= 0 && c >= 0) {
        	if(board[r][c] == 'Q'){
                return true;
            }
        	r--;
        	c--;
        	
        }

         //right diagonal check
        r = row - 1;
        c = col + 1;
        
        while(r >= 0 && c < board.length) {
        	if(board[r][c] == 'Q'){
                return true;
            }
        	r--;
        	c++;
        	
        }

//        for(int r = row - 1;r >= 0; r--){
//            for(int c = col + 1; c < board.length; c++){
//                 if(board[r][c] == 'Q'){
//                return true;
//            }
//            }
//        }

        return false;
    }

}
