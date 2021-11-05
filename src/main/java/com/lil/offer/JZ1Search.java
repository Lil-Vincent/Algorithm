package com.lil.offer;

/**
 * @author Lil
 * @date 2021/3/30 11:37
 */
public class JZ1Search {
    public boolean Find(int target, int [][] array) {
        if(array.length == 0){
            return false;
        }
        if(array[0].length == 0){
            return false;
        }

        int row = 0;
        int cow = array[0].length - 1;

        while(row < array.length && cow >= 0){
            if(target > array[row][cow]){
                row++;
            }else if(target < array[row][cow]){
                cow--;
            }else{
                return true;
            }

        }
        return false;
    }
}
