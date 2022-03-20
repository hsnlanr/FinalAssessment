public class Secondary extends Student{
	private int level = 0;
	public Secondary(String studentId, String studentName, String nameOfSchool, int age, boolean extralang, boolean compcourse, int level) {
		super(studentId, studentName, nameOfSchool, age, extralang, compcourse);
		this.level = level;
	}
	public int getLevel(){
		return level;
	}
	public double calculateSecondaryFees(){
		double price = 0;
		if (level == 1){
			price = 75;
		}
		else if(level == 2){
			price = 90;
		}
		else if (level == 3){
			price = 120;
		}
		if (super.getextraLanguage() == true){
			price += 100;
		}
		if (super.getcomputerCourse() == true){
			price += 150;
		}
		return price;
	}
	public String toString(){
		String finallevel = null;
		if (level == 1){
			finallevel = "PMR";
		}
		else if(level == 2){
			finallevel = "SPM";
		}
		else if (level == 3){
			finallevel = "STPM";
		}
		return (super.toString() +"\nLevel: " +finallevel);
	}
}
