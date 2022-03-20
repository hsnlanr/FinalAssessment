public class Primary extends Student{
	private int totalsubject = 0;
	
	public Primary(String studentId, String studentName, String nameOfSchool, int age, boolean extralang, boolean compcourse, int totalsub){
		super(studentId, studentName, nameOfSchool, age, extralang, compcourse);
		this.totalsubject = totalsub;
	}
	public int getTotalSubject(){
		return totalsubject;
	}
	public double calculatePrimaryFees(){
		double price = 25;
		price = price * totalsubject;
		if (super.getextraLanguage() == true){
			price += 100;
		}
		if (super.getcomputerCourse() == true){
			price += 150;
		}
		return price;
	}
	public String toString(){
		return (super.toString() +"\nTotal Subjects Registered: " +totalsubject);
	}
	
}
