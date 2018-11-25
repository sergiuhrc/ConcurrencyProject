package com.company.first;

public class Read implements Runnable {

    int[] arr;

    public int[] getArr() {
        return arr;
    }

    public Read(int[] arr) {
        this.arr = arr;

    }

    @Override
    public void run() {

           // increment();
           // System.out.println("R increment"+r);
        System.out.println("|Read Thread|");
            readArray(getArr());
            System.out.println();


    }

    public synchronized void readArray(int[]arr){

        System.out.print("|");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.print("|");
    }
}
