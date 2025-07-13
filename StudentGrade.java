import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1, s2, s3, s4, s5;
        int total;
        double average;


        System.out.print("Enter marks of Subject 1: ");
        s1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        s2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        s3 = sc.nextInt();

        System.out.print("Enter marks of Subject 4: ");
        s4 = sc.nextInt();

        System.out.print("Enter marks of Subject 5: ");
        s5 = sc.nextInt();


        total = s1 + s2 + s3 + s4 + s5;
        average = total / 5;

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average: " + average + "%");

        if (average > 90) {
            System.out.println("Grade: Excellent");
        } else if (average > 80) {
            System.out.println("Grade: A");
        } else if (average > 60) {
            System.out.println("Grade: B");
        } else if (average >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

    }
}
