package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {


        public static void main(String[] args) {
            List<List<Integer>> arr = new ArrayList<>(3);
            List<Integer> a1 = new ArrayList<>();
            a1.add(1);
            a1.add(2);
            a1.add(3);
            arr.add(a1);

            List<Integer> a2 = new ArrayList<>();
            a2.add(4);
            a2.add(5);
            a2.add(6);
            arr.add(a2);

            List<Integer> a3 = new ArrayList<>();
            a3.add(9);
            a3.add(8);
            a3.add(9);
            arr.add(a3);
            for (int i = 0; i < arr.size(); i++) {
                for (int j = 0; j < arr.get(i).size(); j++) {
                    System.out.print(arr.get(i).get(j) + " ");
                }
                System.out.println();
            }
            int result = Result.diagonalDifference(arr);

            System.out.println(result);
        }
    }

