package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ArrTest
{


    Integer [] numbs = {1,2,3,4,5,6,7};

    Integer [] numbs1 = {1,2,3,4,5,4,6,7};

    Integer [] numbs2 = {4};

    Integer [] numbs3 = {1};


       @Test
    public void test1()
    {
        Arr arr = new Arr();
        arr.checkNum(numbs);

    }

    @Test
    public void test2()
    {
        Arr arr = new Arr();
        arr.checkNum(numbs1);

    }

    @Test
    public void test3()
    {
        Arr arr = new Arr();
        arr.checkNum(numbs2);
    }

    @Test
    public void test4()
    {
        Arr arr = new Arr();
        arr.checkNum(numbs3);
    }

}
