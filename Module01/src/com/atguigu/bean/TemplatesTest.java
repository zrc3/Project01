package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author rczhan
 * @date 2020/3/28 - 23:51
 *
 * 1、IDEA中代码模板所处的位置：settings - Editor - Live Templates / General / Postfix Completion
 * 2、常用的模板
 */
public class TemplatesTest {

    //模板一：psvm
    public static void main(String[] args) {

        //模板二：
        System.out.println("hello!");
        //变形：soutp / soutm / soutv / xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        int number = 10;
        System.out.println("number = " + number);
        System.out.println(number);

        //模板三:fori
        String arr[] = new String[]{"Tom","Jerry","Kangkang","Jack","Mily"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }

        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(45);
        for (Integer integer : list) {
            System.out.println(integer);
        }

        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        
        //变形：list.forr 倒叙遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }


    }

    public void method(){
        //模板五：ifn
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(45);
        if (list == null) {

        }

        //变形:inn
        if (list != null) {

        }

        //变形：xxx.nn / xxx.null
        if (list != null) {

        }

        if (list == null) {

        }
    }

}
