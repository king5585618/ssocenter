package com.demo.ssocenter;

/**
 * Created by jinzj on 2017/1/23.
 */
public class Bank {
    private int sum = 0;

    public void add(int n) {
        sum = sum + n;
        System.out.println("sum= " + sum);
    }
}
