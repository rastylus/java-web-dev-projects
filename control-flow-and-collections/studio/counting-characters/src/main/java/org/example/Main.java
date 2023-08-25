package org.example;
//import java.util.HashMap;
import java.util.*;
import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a quote to see the character count: ");
//        String str1 = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
//        String str1 = input.nextLine().toLowerCase();

            Path fileName
                    = Path.of("C:\\/Users/ryanriggs/Code/java-web-dev-projects/control-flow-and-collections/studio/counting-characters/src/main/java/org/example/string");

            // Now calling Files.readString() method to
            // read the file
            String str1 = Files.readString(fileName);
            System.out.println(str1);



//        String str1 = quote;
        String newstr = "";
        for (int i = 0; i < str1.length(); i++) {

            boolean b1 = Character.isDigit(str1.charAt(i));
            boolean b2 = Character.isAlphabetic(str1.charAt(i));

            if (b1 || b2) {
                newstr += str1.substring(i, i + 1);
            }
        }

        char[] charsInQuote = newstr.toCharArray();


        HashMap<Character, Integer> characters = new HashMap<>();
        for (char c : charsInQuote) {

            if (characters.containsKey(c)) {
                characters.put(c, characters.get(c) + 1);
            }
            else {
                characters.put(c, 1);
            }
        }


        for (HashMap.Entry entry : characters.entrySet()) {
//            if(characters.entrySet()
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}

