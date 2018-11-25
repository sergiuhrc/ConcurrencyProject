package com.company.first;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[20];
          new Thread(new Write(array)).start();
          Thread.sleep(1000);
          new Thread(new Calculate(array)).start();
          Thread.sleep(100);
          new Thread(new Read(array)).start();



    }
}
