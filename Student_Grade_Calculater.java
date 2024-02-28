/*import java.util.Scanner;

public class Student_Grade_Calculater{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int totalMarks = 0;
        int numberOfSubjects = 6;
        int marks;
        char grade;

        for(int count = 0; count < numberOfSubjects; count++){
            System.out.println("Enter marks for subject" + (count + 1) + ":");
            marks = scanner.nextInt();
            totalMark += marks;
        }

        double averagePercentage = (double) totalMarks / numberOfSubjects;
        grade = calculaterGrade(averagePercentage);


        System.out.println("Total Marks:" + totalMarks);
        System.out.println("Average Percentage:" + averagePercentage + "%");
        System.out.println("Grade:" + grade);

        scanner.close();
    }

    public static char calculaterGrade(double averagePercentage){
        if(averagePercentage >= 90){
            return 'A';
        }else if(averagePercentage >= 80){
            return 'B';
        }else if(averagePercentage >= 70){
            return 'c';
        }else if(averagePercentage >= 60){
            return 'D';
        }else(
            return 'F';
        )
    }
}*/


import java.util.Scanner;

public class Student_Grade_Calculater {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subject:");
        int numberOfSubjects = scanner.nextInt();

        int totalMark = 0;
        for(int i = 1; i <= numberOfSubjects; i++){
            System.out.println("Enter marks obtained in subject" + i + "(out of 100):");
            int marks = scanner.nextInt();

            if(marks < 0 || marks > 100){
                System.out.println("Invalid marks entered. Marks should be between 0 and 100. Exiting.");
                return;
            }

            totalMark += marks;
        }

        double averagePercentage = (double) totalMark / numberOfSubjects;

        char grade;
        if(averagePercentage >= 90){
            grade = 'A';
        }else if(averagePercentage >= 80){
            grade = 'B';
        }else if(averagePercentage >= 70){
            grade = 'c';
        }else if(averagePercentage >= 60){
            grade = 'D';
        }else{
            grade = 'F';
        }

        System.out.println("\n Results:");
        System.out.println("Total Marks:" + totalMark);
        System.out.println("Average Percentage:" + averagePercentage + "%");
        System.out.println("Grade:" + grade);

        scanner.close();
    }
}