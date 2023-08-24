package org.example;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(42);
        nums.add(2);
        nums.add(3);
        nums.add(15);
        nums.add(87);
        nums.add(23);
        nums.add(4);
        nums.add(16);
        nums.add(9);
        nums.add(1);
        nums.add(36);
        System.out.println(Sum.sum(nums));




        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";


        String[] words = phrase.split(" ");
//        System.out.println(Arrays.toString(words));


        System.out.println(WordLength.length(words));



        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));
        System.out.println((sentences[3]));


        int[] numbers = {1, 1, 2, 3, 5, 8};
        for (int i: numbers) {
            if (i % 2 == 1) {
            System.out.println(i);
            }
        }


    }
}

