package com.lil.notCommonlyUs.offer;

/**
 * @author Lil
 * @date 2021/4/1 11:35
 */
/*把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入升序的数组的旋转,输出旋转数组的最小的元素
   输入
   [3,4,5,1,2]
   返回值
   1*/
public class JZ6 {
    public int minNumberInRotateArray(int [] array) {
        int n = array.length - 1;
        if(n < 0) return -1;
        while (n > 0  ) n-- ;
        if(array[n] >= array[0]) return array[0];//例如这种[2,2,2,2,2,2,2]
        int l = 0,r = n;
        while (l < r){
            int mid = (l + r) / 2;//把区间分为[l,mid],[mid+1,r]
            if (array[mid] < array[0]) r = mid;
            else l = mid + 1;
        }
        return array[r];
    }
}
