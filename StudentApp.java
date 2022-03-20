import java.util.*;
public class StudentApp {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Primary primaryArr[] = new Primary[100];
		
		for (int i = 0; i<primaryArr.length; i++){
			System.out.print("Enter Student Id: ");
			String studID = input.nextLine();
			System.out.print("Enter Student Name: ");
			String studName = input.nextLine();
			System.out.print("Enter Student Age: ");
			int studAge = Integer.parseInt(input.nextLine());
			System.out.print("Enter Name of School: ");
			String nameOfSchool = input.nextLine();
			System.out.print("Would you like to take extra language classes?: ");
			char tempExtraLang = input.nextLine().charAt(0);
			
			boolean extraLang = false;
			if (tempExtraLang == 'y' || tempExtraLang == 'Y'){
				extraLang = true;
			}
			
			System.out.print("Would you like to take computer classes?: ");
			char tempCompCourse = input.nextLine().charAt(0);
			
			boolean computerCourse = false;
			if (tempCompCourse == 'y' || tempCompCourse== 'Y'){
				computerCourse = true;
			}
			System.out.print("How many subjects to register for?: ");
			int totalsubject = Integer.parseInt(input.nextLine());
			primaryArr[i] = new Primary(studID, studName, nameOfSchool, studAge, extraLang, computerCourse, totalsubject);
			System.out.print("\n");
		}
		input.close();
		int counter = 0;
		System.out.print("Primary Students");
		for (int i = 0; i<primaryArr.length; i++){
			if (primaryArr[i].getextraLanguage() == true && primaryArr[i].getextraLanguage() == true){
				counter += 1;
			}
			System.out.print("\nStudent " +(i+1) +": ");
			System.out.print(primaryArr[i].toString() +"\nTotal Price: " +primaryArr[i].calculatePrimaryFees() +"\n");
		}
		System.out.print("\n\nTotal of students who take extra language and computer course: " +counter  +"\n");
		System.out.print("\n\nList of students who registered 5 subjects for SPM");
		for (int i = 0; i<primaryArr.length; i++){
			if (primaryArr[i].getTotalSubject() == 5){
				System.out.print("\nStudent " +(i+1) +": ");
				System.out.print("\n" +primaryArr[i].getStudentName() +"\n" +primaryArr[i].getStudentID() +"\n");
			}
		}
	}
}
