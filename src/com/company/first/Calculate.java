package com.company.first;

public class Calculate implements Runnable {
    int sum =0;
    int[] arr;

    public Calculate(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    @Override
    public void run() {
        calculateSum(getArr());
    }
    public synchronized void calculateSum(int[]arr){


        for (int i = 0; i <arr.length ; i++) {

            sum = sum+arr[i];
        }

        System.out.println("Sum = "+sum);
    }
}
