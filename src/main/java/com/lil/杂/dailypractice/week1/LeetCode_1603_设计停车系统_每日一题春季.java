package com.lil.杂.dailypractice.week1;

/**
 * @author Lil
 * @date 2021/4/20 11:10
 */
public class LeetCode_1603_设计停车系统_每日一题春季 {
    int packingSystem[] = new int[4];

    public void setPackingSystem(int small,int medium,int big){
        packingSystem[0] = small;
        packingSystem[1] = medium;
        packingSystem[2] = big;
    }
    public boolean addCar(int carType){
        int t = carType--;
        if (packingSystem[t] > 0){
            packingSystem[t]--;
            return true;
        }
        return false;
    }
}
