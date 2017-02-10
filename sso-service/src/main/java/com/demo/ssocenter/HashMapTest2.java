package com.demo.ssocenter;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/**
 * Created by jinzj on 2017/1/23.
 */
public class HashMapTest2 {

    final Map<String,Long> wordCounts = new HashMap<>();

    public long increase(String word) {
        Long oldValue, newValue;
        while (true) {
            oldValue = wordCounts.get(word);
            if (oldValue == null) {
                // Add the word firstly, initial the value as 1
                newValue = 1L;
                if (wordCounts.putIfAbsent(word, newValue) == null) {
                    break;
                }
            } else {
                newValue = oldValue + 1;
                if (wordCounts.replace(word, oldValue, newValue)) {
                    break;
                }
            }
        }
        return newValue;
    }

    public static void main(String[] args) {
        HashMapTest2 test2 = new HashMapTest2();
        String str = "test";
        CountDownLatch latch = new CountDownLatch(100);
        for(int i=0;i<100;i++){
            Thread t = new Thread(()->{
                test2.increase(str);
                System.out.println(1);
            });
            t.start();
        }
        latch.countDown();
        System.out.println(test2.wordCounts.get(str));
    }
}
