package com.demo.ssocenter;

/**
 * Created by jinzj on 2017/1/23.
 */
public class Cus implements Runnable{
    Bank b = new Bank();
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            b.add(100);
        }
    }
}
