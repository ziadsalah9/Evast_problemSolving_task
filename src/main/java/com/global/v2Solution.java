package com.global;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class v2Solution {
    //[1,2,2,3] [3,4,3,5]

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> s1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());  // [1,2,3]
        Set<Integer> s2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet()); // [3,4,5]

        return List.of(
                s1.stream().filter(x -> !s2.contains(x)).toList(),
                s2.stream().filter(x -> !s1.contains(x)).toList()
        );
    }
}
