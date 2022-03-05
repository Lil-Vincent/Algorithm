package com.lil.notCommonlyUs.offer;/*
package com.lil.offerjianzhi.week1;

*/
/**
 * @author Lil
 * @date 2021/4/15 20:24
 *//*

public class JZ65Test {
    public static int[] dirX = {-1,0,1,0};
    public static int[] dirY = {0,1,0,0,1};
    public static boolean hasPath (char[][] matrix, String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == word.charAt(0))
                        if(dfs(matrix, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] map,String word, int x, int y, int u,boolean[][] visited){
        if (u==word.length()) return true;
        char tmp = word.charAt(u);
        if (map[x][y] != word.charAt(u)) {
            return false;
        }
//        map[x][y] = '*';
        for (int i = 0; i < 4; i++) {
            int xx = x + dirX[i];
            int yy = y + dirY[i];
            visited[xx][yy] = true;

            if (xx < map.length && xx >= 0 && yy < map[0].length &&!visited[xx][yy] &&yy >= 0&&map[xx][yy]==word.charAt(u)) {
                if (dfs(map, word, xx, yy, u + 1,visited)) {
                    return true;
                }
            }
            visited[xx][yy] = true;
        }
        map[x][y] = tmp;
        return false;
    }

    public static void main(String[] args) {
        char[][] test = {{'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}};
        String s = "abcced";
        boolean b = hasPath(test, s);
        if (b) {
            System.out.println("sdafasd");
        } else {
            System.out.println("nonon");
        }
    }
}
*/
