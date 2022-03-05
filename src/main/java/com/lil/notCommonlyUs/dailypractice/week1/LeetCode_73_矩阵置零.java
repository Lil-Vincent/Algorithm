package com.lil.notCommonlyUs.dailypractice.week1;

/**
 * @author Lil
 * @date 2021/4/22 17:24
 */
public class LeetCode_73_矩阵置零 {
    public void setZeroes(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return;
        int x0 = 1,y0 = 1;
        int n = matrix.length, m = matrix[0].length;
        //1.1 遍历第0行是否有0
        for (int i = 0; i < m; i++) //遍历行,不用遍历列
                if (matrix[0][i] == 0) x0 = 0;
        //1.2 遍历第0列是否有0
        for (int i = 0; i < n; i++)
                if (matrix[i][0] == 0) y0 = 0;

        //2.1遍历所有,遇到0则把第0行的第j列的数变0000
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0)
                {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        //3.1遍历第0列,从第一行开始
        for (int i = 1; i < n; i++) {
             if (matrix[i][0] == 0){
                    for (int j = 0; j < m; j++) {
                        matrix[i][j] = 0;
                    }
                }
        }
        //3.2 遍历第0行,把第0行所在的列所有数字变为0
        for (int i = 1; i < m; i++) {
            if (matrix[0][i] == 0){
                for (int j = 0; j < n; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
        if (x0 == 0){
            for (int i = 0; i < m; i++) {
                matrix[0][i] = 0;
            }
        }
        if (y0 == 0){
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
