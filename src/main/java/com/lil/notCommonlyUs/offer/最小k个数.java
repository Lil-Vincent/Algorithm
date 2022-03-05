package com.lil.notCommonlyUs.offer;

/**
 * @author Lil
 * @date 2021/7/9 18:50
 */
import java.util.*;

public class 最小k个数 {
        public static int[] getLeastNumbers(int[] arr, int k) {
            int[] res = new int[k];
            //PriorityQueue是Queue的一个实现类
            //默认是小顶堆，建立大顶堆则需要构造时传自定义的Comparator参数
            Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>(){
                @Override
                public int compare(Integer o1,Integer o2){
                    return o2 - o1;//从大到小排
                }
            });

            //大顶堆中保留最小的k个数
            for(int i = 0;i < arr.length;i++){
                queue.add(arr[i]);
                if(queue.size() > k) queue.poll();
            }

            for(int i = 0;i < k;i++){
                res[i] = queue.poll();
            }
            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i] + " ");
            }
            return res;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = in.nextInt();
        }
        int k = in.nextInt();
        getLeastNumbers(q, k);
    }
}

