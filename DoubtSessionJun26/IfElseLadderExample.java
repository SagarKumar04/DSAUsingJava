package InfinityJune21.DoubtSessionJun26;

public class IfElseLadderExample {
    public static void main(String[] args) {
        /*
        90 - 100 -> O
        80 - 90 -> E
        70 - 80 -> A
        60 - 70 -> B
        40 - 60 -> C
        <40 -> F
         */
        int marks = 65;
        char grade = ' ';
        if(marks >= 90) { //90-100
            grade = 'O';
        }
        else if(marks >= 80) { //80-90
            grade = 'E';
        }
        else if(marks >= 70) {
            grade = 'A';
        }
        else if(marks >= 60) {
            grade = 'B';
        }
        else if(marks >= 40) {
            grade = 'C';
        }
        else {
            grade = 'F';
        }

        System.out.println(grade);
    }
}
