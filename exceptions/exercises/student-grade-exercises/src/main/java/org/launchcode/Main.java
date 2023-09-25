package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        System.out.println(Divide(6,6));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        System.out.println(studentFiles.values());
    }

    public static String Divide(int x, int y)
    {
        if (y <= 0) {
            try {
                throw new ZeroException("The total score must be above zero.");
            } catch (ZeroException e) {
                e.printStackTrace();
            }
        }
        return String.valueOf(x/y);
    }

    public static int CheckFileExtension(String fileName)
    {
        int points = 1;
        if (!fileName.contains(".java")) {
            points = 0;
        } else {

        }
        return points;
    }
}