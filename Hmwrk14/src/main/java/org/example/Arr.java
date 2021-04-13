package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Arr {
   private static Integer [] numbs = {1,2,3,4,5,6,7};
    private static Integer [] numbs1 = {1,2,3,4,5,4,6,7};
    private static Integer [] numbs2 = {4};
    private static Integer [] numbs3 = {1};

    public void checkNum(Integer [] numbs){
        List<Integer> a = new ArrayList<>();
        List<Integer> a1 = new ArrayList<>();

        a = Arrays.asList(numbs);
       if(a.contains(4)){
           for (int i = a.size()- 1; i > 0; i--) {
               if (a.get(i) == 4){

                   for (int j = i+1; j < a.size(); j++) {
                       a1.add(a.get(j));
                   }

                  break;
               }
           }
           System.out.println(a1);
       }
       if (!a.contains(4)){
           throw new RuntimeException("НЕТ 4");
       }
    }

    public static void main(String[] args) {
      Arr arr = new Arr();
      arr.checkNum(numbs);
      arr.checkNum(numbs1);
      arr.checkNum(numbs2);
      arr.checkNum(numbs3);

    }


}