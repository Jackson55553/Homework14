package org.example;

import org.junit.Test;

public class ArrTest1 {

    Integer[] numbs = {1, 1, 1, 1, 1, 1, 1};

    Integer[] numbs1 = {4, 4, 4, 4, 4, 4, 4};

    Integer[] numbs2 = {1, 2, 3, 4, 5, 5};

    Integer[] numbs3 = {1, 4, 4, 1, 4, 4, 4, 1};

    @Test
    public void test(){
        Arr1 arr1 = new Arr1();
        System.out.println(arr1.checkNum(numbs));
}
    @Test
    public void test1(){
        Arr1 arr1 = new Arr1();
        System.out.println(arr1.checkNum(numbs1));
    }
    @Test
    public void test2(){
        Arr1 arr1 = new Arr1();
        System.out.println(arr1.checkNum(numbs2));
    }
    @Test
    public void test3(){
        Arr1 arr1 = new Arr1();
        System.out.println(arr1.checkNum(numbs3));
    }

}
