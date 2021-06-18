public class ConditionalsExample {
    public static void main(String[] args) {
        /*
        'if' statements
        'if-else' statements
        'nested if' statements
        'if-else' ladder
        'switch'
         */

        //if
        int num = -2;
        if(num > 0) {
            System.out.println("Positive number");
        }

        //if-else
        int age = 60;
        if(age < 60) {
            System.out.println("Not a senior citizen");
        }
        else {
            System.out.println("A senior citizen");
        }

        //nested-if
        int ageOfPerson = 20;
        boolean hasDrivingLicense = false;
        if(ageOfPerson >= 18) {
            if(hasDrivingLicense) {
                System.out.println("Can drive");
            }
            else {
                System.out.println("Cannot drive");
            }
        }
        else {
            System.out.println("Cannot drive");
        }

        //'if-else' ladder
        float percent;
        percent = 98.35f;
        char grade;
        if(percent >= 90) {
            grade = 'O';
        }
        else if(percent >= 80) {
            grade = 'E';
        }
        else if(percent >= 60) {
            grade = 'A';
        }
        else if(percent >= 40) {
            grade = 'B';
        }
        else {
            grade = 'F';
        }
        System.out.println("Grade: " + grade);
    }
}