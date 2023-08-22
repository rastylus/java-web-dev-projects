package org.launchcode;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What text would you like to search for: ");
        String wonder = (("Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "‘and what is the use of a book,’ thought Alice " +
                "‘without pictures or conversation?’").toUpperCase());
        String search = input.nextLine();
        if (wonder.contains(search.toUpperCase())) {
            int index = wonder.indexOf(search);
            System.out.println(index);
        }

//        System.out.println(Wonder.contains(search.toUpperCase()));

    }
}
