package com.global;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class v1Solution {
    //[1,2,2,3] [3,4,3,5]
    public List<List<Integer>> findDiff(int [] arr1, int [] arr2){

        Set<Integer> s1 =new HashSet<>();  // [1,2,3]
        Set<Integer> s2=new HashSet<>();  // [3,4,5]

        for(int i : arr1 ){
            s1.add(i);
        }
        for(int i : arr2 ){
            s2.add(i);
        }


        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for(int i : s1 ){
            if(!s2.contains(i)){
                l1.add(i);   // [1,2]
            }
        }


        for(int i : s2 ){
            if(!s1.contains(i)){
                l2.add(i);   // [4,5]
            }
        }


        List<List<Integer>> result = new ArrayList<>();
        result.add(l1);
        result.add(l2);

        return result;

    }
}
