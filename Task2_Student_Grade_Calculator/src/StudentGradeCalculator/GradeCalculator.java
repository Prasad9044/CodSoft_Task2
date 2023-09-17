package StudentGradeCalculator;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of subjects: ");
		int totalSubjects = scanner.nextInt();

		int[] marks = new int[totalSubjects];
		int totalMarks = 0;

		System.out.println("Enter marks obtained in each subject (out of 100): ");
		for (int i = 0; i < totalSubjects; i++) {
			System.out.println("Subject " + (i + 1) + ": ");
			int mark = scanner.nextInt();
			if (mark <= 100) {
				marks[i] = mark;
				totalMarks = totalMarks + marks[i];
			} else {
				System.out.println("Entered marks are more than 100. Please enter marks out of 100.");
				i--;
			}
		}

		double avgPercentage = (double) totalMarks / totalSubjects;

		System.out.println("\nResult:");
		System.out.println("Total Marks: " + (totalSubjects * 100));
		System.out.println("Total Marks Obtained: " + totalMarks);
		System.out.printf("Average Percentage: " + "%,.2f ", avgPercentage);
		System.out.println("%");

		String grade;

		if (avgPercentage >= 90) {
			grade = "A+";
		} else if (avgPercentage >= 80) {
			grade = "A";
		} else if (avgPercentage >= 70) {
			grade = "B+";
		} else if (avgPercentage >= 60) {
			grade = "B";
		} else if (avgPercentage >= 50) {
			grade = "C+";
		} else if (avgPercentage >= 35) {
			grade = "C";
		} else {
			grade = "F";
		}

		System.out.println("Grade: " + grade);
	}
}
