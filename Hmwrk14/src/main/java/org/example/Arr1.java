package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arr1 {
    private static Integer[] numbs = {1, 1, 1, 1, 1, 1, 1};
    private static Integer[] numbs1 = {4, 4, 4, 4, 4, 4, 4};
    private static Integer[] numbs2 = {1, 2, 3, 4, 5, 5};
    private static Integer[] numbs3 = {1, 4, 4, 1, 4, 4, 4, 1};

    public boolean checkNum(Integer[] numbs) {
        int x = 1;
        int y = 4;
        List<Integer> a = new ArrayList<>();
        a = Arrays.asList(numbs);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) != x && a.get(i) != y) {
                return false;
            }
        }
        if (a.contains(x) && a.contains(y)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Arr1 arr1 = new Arr1();
        System.out.println(arr1.checkNum(numbs));
        System.out.println(arr1.checkNum(numbs1));
        System.out.println(arr1.checkNum(numbs2));
        System.out.println(arr1.checkNum(numbs3));
    }


}
