package com.dwd;

import sort.InsersionSort;
import sort.Person;

/**
 * 描述：
 *
 * @author duanweidong
 * @version 1.0
 * @date 2018/9/15 下午4:27
 */
public class Test {

    public static void main(String[] args) {
        int[] a = InsersionSort.insertionSort(new int[]{8,7,6,5,4,3,2,1});
        for(int aa : a){
            System.out.println(aa);
        }

        Person p = new Person(1,"ligoudao");
        System.out.println(p.toString());
        System.out.println(p.ageOf());
        System.out.println(p.nameOf());
        Person p2 = new Person(1);
        System.out.println(p2.nameOf());
    }
}
