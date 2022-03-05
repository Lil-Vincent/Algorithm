package com.lil.notCommonlyUs.offer;

/**
 * @author Lil
 * @date 2021/4/15 19:50
 */
//枚举起点,枚举方向
public class JZ65矩阵中的路径 {
    public static int[] dirX = {-1,0,1,0};
    public static  int[] dirY = {0,1,0,-1};
    public static boolean hasPath (char[][] matrix, String word) {
        // write code here
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (dfs(matrix,word,i,j,0)) return true;
            }
        }
        return false;
    }

    public static boolean dfs(char[][] map, String word, int x, int y, int u){

        if (map[x][y] != word.charAt(u)) return false;
        if (u == word.length()-1) return true;
        char tmp = map[x][y];
        map[x][y] = '*';
        for (int i = 0; i < 4; i++) {
            int xx = dirX[i]+x;
            int yy = dirY[i]+y;
            if (xx >= 0 && xx < map.length && yy >= 0 && yy < map[0].length) {
                if (dfs(map, word, xx, yy, u+1)) return true;
            }
        }
        map[x][y] = tmp;
        return false;
    }

    public static void main(String[] args) {
//        char[][] test = {{'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}};
        char[][] test = {{'A','B','C','E','H','J','I','G'},{'S','F','C','S','L','O','P','Q'},{'A','D','E','E','M','N','O','E'},{'A','D','I','D','E','J','F','M'},{'V','C','E','I','F','G','G','S'}};
        String str = "SGGFIECVAASABCEHJIGQEM";
        boolean b = hasPath(test, str);
        if (b) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
