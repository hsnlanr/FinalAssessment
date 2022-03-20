public class Student {
	private String studentID, studentName, nameOfSchool;
	private int age;
	private boolean extraLanguage, computerCourse;
	
	public Student(String studentId, String studentName, String nameOfSchool, int age, boolean extralang, boolean compcourse){
		 this.studentID = studentId;
		 this.studentName = studentName;
		 this.nameOfSchool = nameOfSchool;
		 this.age = age;
		 this.extraLanguage = extralang;
		 this.computerCourse = compcourse;
	}
	public String getStudentID(){
		return studentID;
	}
	public String getStudentName(){
		return studentName;
	}
	public String getnameOfSchool(){
		return nameOfSchool;
	}
	public int getAge(){
		return age;
	}
	public boolean getextraLanguage(){
		return extraLanguage;
	}
	public boolean getcomputerCourse(){
		return computerCourse;
	}
	
	public String toString(){
		return ("\nStudent ID: " +studentID +"\nStudent Name: " +studentName +"\nStudent Age: " +age +"\nTook extra language?: " +extraLanguage +"\nTook computer course?: " +computerCourse);
	}
	
}
