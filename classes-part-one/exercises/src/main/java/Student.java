public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        public void setName(String name){
                this.name = name;
        }
        public void setStudentId(int name){
                this.studentId = studentId;
        }
        public void setNumberOfCredits(int numberOfCredits){
                this.numberOfCredits = numberOfCredits;
        }
        public void setName(double gpa){
                this.gpa = gpa;
        }
        public String getName(){
                return name;
        }
        public int getStudentId(){
                return studentId;
        }
        public int getNumberOfCredits(){

                return numberOfCredits;
        }
        public double gpa(){
                return gpa;
        }


        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

}
