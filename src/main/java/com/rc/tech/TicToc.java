package com.rc.tech;

import java.util.Arrays;
import java.util.Scanner;

public class TicToc {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(char[] row : board) {
            Arrays.fill(row,'-');
        }
        printBoard(board);
        Scanner sc = new Scanner(System.in);
        char player = 'X';
        while(true) {
            System.out.println("Player " + player + " Take your chance by entering ROW & COL Value");
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;
            if(r >=0 && r < board.length && c>=0 && c < board.length && board[r][c] == '-') {
                board[r][c] = player;
                printBoard(board);
            } else {
                System.out.println("Invalid Row or Col value Or Place is already occupied");
                continue;
            }
            if(hasWon(board, player)) {
                System.out.println("Player " + player + " has WON the game");
                break;
            }

            if(isBoardFull(board)) {
                System.out.println("It's a tie");
                break;
            }

            player = (player == 'X') ? 'O' : 'X';
        }

        sc.close();
    }

    private static boolean isBoardFull(char[][] board) {

        for (int i = 0 ; i < board.length; i++) {
            for (int j = 0; j < board.length; j++)
                if(board[i][j] == '-')
                    return false;
        }
        return true;
    }

    private static boolean hasWon(char[][] board, char player) {
        //Check for Rows
        for(int i = 0 ; i < board.length; i++) {
            if(board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            if(board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        // diagonal check
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        // reverse diagonal check
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    private static void printBoard(char[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == '-')
                    System.out.print(" - ");
                else if (board[i][j] == 'X')
                    System.out.print(" X ");
                else
                    System.out.print(" O ");
            }
            System.out.println();
        }
    }
}
