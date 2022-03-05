package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] nums = {1,2,-3,4,5,-6,7,8,-9,10,11,12,-13,14,-15};
        double sum = 0;
        double J=0;
        boolean negative = false;
        for (Double Abc:nums) {
            if (Abc < 0) {
                negative = true;
            } else {
                if (negative) {
                    sum += Abc;
                    J++;
                }

            }
        }
        System.out.println(sum/J);
        int[] Nums = {2,1,3,4,6,7,9,5};
        System.out.println(Arrays.toString(Sort(Nums)));


    }

    public static int [] Sort (int []mas1){
        for (int i = 0; i <mas1.length; i++) {
            int minimum = mas1[i];
            int min = i;
            for (int j = i + 1; j < mas1.length; j++) {
                if (mas1[j] < minimum) {
                    minimum =  mas1[j];
                    min = j;
                }

            }
            if (i != min) {
                int Index = mas1[i];
                mas1[i] = mas1[ minimum];
                mas1[ minimum] = Index;
            }


        }
        return mas1;
    }

}

