package org.launchcode;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString() {
        String courseReport = String.format("The % course will be taught by %.", this.topic, this.instructor);
        return courseReport;
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.


    public static void main(String[] args) {
        Course math = new Course("math", "Mr. Riggs", );
        System.out.println(math);
    }
}
