package com.demo.ssocenter;

/**
 * Created by jinzj on 2017/1/23.
 */
public class Test {
    public static void main (String [] args) {
        Cus c = new Cus();
        for(int i=0;i<5;i++){
            new Thread(c).start();
        }
    }
}
