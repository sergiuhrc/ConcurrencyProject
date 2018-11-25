package com.company.first;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class Write  implements Runnable {
    int[] arr;

    public Write(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    @Override
    public void run() {

        try {
            writeInArray(getArr());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        System.out.println("Writing is done");
    }
    public static   synchronized void writeInArray(int[]array ) throws NoSuchAlgorithmException {
         Random rd = SecureRandom.getInstanceStrong();

        for (int i = 0; i <array.length ; i++) {
            array[i]= rd.nextInt(10) ;

        }
    }
}
