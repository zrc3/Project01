package com.itcast.test;

import org.junit.Test;

/**
 * @author rczhan
 * @date 2020/4/14 - 17:19
 */
public class Test1 {
    @Test
    public void test(){
        String name = "（季、半年）新发生的欠税金额(元)";
        int length = name.length();
        int index = name.indexOf("(元)");
        name = name.substring(index + 3,length);
        System.out.println(name);
    }
}