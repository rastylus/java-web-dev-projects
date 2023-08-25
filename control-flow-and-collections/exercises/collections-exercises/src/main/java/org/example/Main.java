package org.example;
import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String newStudent;
        HashMap<Integer, String> classRoster = new HashMap<>();

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                classRoster.put(newID, newStudent);

                input.nextLine();
            }
        } while(!newStudent.equals(""));

        input.close();
//        scanner.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + classRoster.size());


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


        List<String> myList = new ArrayList<String>(Arrays.asList(phrase.split(" ")));
//        System.out.println(myList);
        ArrayList<String> newList = new ArrayList<>();


        for(int c=0; c < myList.size(); c++) {
            newList.add(myList.get(c));
        }

//        System.out.println(newList);

//        String[] words = phrase.split(" ");
//        System.out.println(Arrays.toString(words));

        ArrayList<String> words = new ArrayList<>();
            words.add("seven");
            words.add("this");
            words.add("testy");
            words.add("tester");
            words.add("test");
            words.add("place");
            words.add("put");
            words.add("down");


//        System.out.println(Count.count(words));
        System.out.println(Count.count(newList));



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

