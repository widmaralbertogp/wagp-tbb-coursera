public class Main {
    public static void main(String[] args) {

        // set the marks
        int marks1 = 80;
        int marks2 = 80;
        int marks3 = 80;

        // calculate the average
        int average = (marks1 + marks2 + marks3) / 3;

        // 1st level "if" condition
        if (average < 60) {
            System.out.println("Failing.");
        } else {
            //corresponding "else" body or area of control of 1st "if"

            //2nd level "if" condition
            if (average < 70) {
                System.out.println("Below Average.");
            } else {
                // 2nd level "else" of 2nd level "if"

                //3rd level "if" condition inside 2nd level "else"
                if (average < 80) {
                    System.out.println("Average.");
                } else {
                    //3rd level "else" of 3rd level "if"

                    //4th level "if" condition inside 3nd level "else"
                    if(average < 90) {
                        System.out.println("Good.");
                    } else {
                        //4th level "else" of 4th level "if"
                        System.out.println("Excellent.");
                    }
                }

            }
        }
    }
}
