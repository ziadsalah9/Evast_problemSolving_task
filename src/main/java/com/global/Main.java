package com.global;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        int[] nums1 = {1,2,2,3,3};
//        int[] nums2 = {1,1,2,2};
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array1 : ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("enter the elements of the array1 : ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("enter the size of the array2 : ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("enter the elements of the array2 : ");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }
        v1Solution v1 = new v1Solution();
        var result = v1.findDiff(nums1,nums2);


        System.out.println("result from solution 1 =====> " + result);



        v2Solution v2 = new v2Solution();
        result = v2.findDifference(nums1,nums2);


        System.out.println("result from solution 2 =====> " + result);


        }
    }


