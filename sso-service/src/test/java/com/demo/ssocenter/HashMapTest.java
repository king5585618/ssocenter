package com.demo.ssocenter;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jinzj on 2017/1/23.
 */
public class HashMapTest {
    final Map<String,Long> wordCounts = new HashMap<>();

    @Test
    public void test() throws Exception {
        String str = "test";
        for(int i=0;i<100;i++){
            Thread t = new Thread(()->{
                increase(str);
                System.out.println(1);
            });
            t.start();
            t.join();
        }
        System.out.println(wordCounts.get(str));
    }

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
}
