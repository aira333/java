public class nestedIf {
    public static String assignGrade(int marks){
        String grade;

        if (marks >= 0 && marks <= 100) {
            if (marks >= 90) {
                grade = "A";
            } else if (marks >= 80) {
                grade = "B";
            } else if (marks >= 70) {
                grade = "C";
            } else if (marks >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
        } else {
            grade = "Invalid Marks";
        }
        return grade;
    }

    public static void main(String[] args) {
        System.out.println("Marks : 95" + " " + assignGrade(95));
    }
}
