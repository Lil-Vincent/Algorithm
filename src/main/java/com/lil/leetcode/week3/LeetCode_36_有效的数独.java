package com.lil.leetcode.week3;

import java.util.Arrays;

/**
 * @author Lil
 * @date 2022/04/13 13:45
 **/
public class LeetCode_36_有效的数独 {
    public static boolean isValidSudoku(char[][] board) {
        Boolean str[] = new Boolean[9];

        for (int i = 0; i < 9; i++) {
            Arrays.fill(str, false);
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int t = board[i][j] - '1';
                    if (str[t]) return false;
                    else str[t] = true;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            Arrays.fill(str, false);
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    int t = board[j][i] - '1';
                    if (str[t]) return false;
                    else str[t] = true;
                }
            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                Arrays.fill(str, false);
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        if (board[i + x][j + y] != '.') {
                            int t = board[i + x][j + y] - '1';
                            if (str[t]) return false;
                            else str[t] = true;
                        }

                    }
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {

    }
}