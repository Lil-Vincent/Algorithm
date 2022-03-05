package com.lil.杂.offer;

/**
 * @author Lil
 * @date 2021/7/20 8:28
 */
public class JZ13调整数组顺序使奇数位于偶数前面 {
    public int[] reOrderArray (int[] array) {
        int i = 0, j = array.length - 1;
        while (i <= j) {
            while (i <= j && array[i] % 2 == 1) i ++;
            while (i <= j && array[j] % 2 == 0) j --;
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return array;
    }

    public int[] reOrderArray2 (int[] array) {
        // write code here
        //双指针，头尾指针
        int[] nums = new int[array.length];
        int i = 0;
        int j = array.length-1;
        int index_head = i;
        int index_tail = j;
        while(i < array.length && j >= 0){
            if(array[i] % 2 == 1){
                //奇数，放前面
                nums[index_head] = array[i];
                index_head++;
            }
            i++;
            if(array[j] % 2 == 0){
                //从后到前，如果为偶数，则从后开始填
                nums[index_tail] = array[j];
                index_tail--;
            }
            j--;
        }
        return nums;
    }
}




