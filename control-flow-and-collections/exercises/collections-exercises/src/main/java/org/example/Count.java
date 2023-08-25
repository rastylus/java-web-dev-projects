package org.example;
import java.util.ArrayList;
import java.util.Scanner;




public class Count {


    public static ArrayList<String> count(ArrayList<String> arg) {
        ArrayList<String> newArr= new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        input.close();

        for (String word: arg) {
            if (word.length() == numChars) {
               newArr.add(word);
            }
        }
        return newArr;
    }
}
