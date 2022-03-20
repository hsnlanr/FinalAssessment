public class Kolej {
	private String code, description, duration, faculty, head;
	
	public Kolej(String c, String d, String dur, String fac, String h){
		this.code = c;
		this.description = d;
		this.duration = dur;
		this.faculty = fac;
		this.head = h;
	}
	public String getCode(){
		return code;
	}
	public String getDesc(){
		return description;
	}
	public String getDur(){
		return duration;
	}
	public String getFaculty(){
		return faculty;
	}
	public String getHead(){
		return head;
	}
	public String toString(){
		return("\nProgram Code: " +code +"\nProgram Description: " +description +"\nProgram Duration: " +duration +"\nProgram Faculty: " +faculty +"\nProgram Head: " +head);
	}
	public String getProgramLevel(){
		char progcode = code.charAt(2);
		String programlevel = "";
		if(progcode == '0'){
			programlevel = "Certificate";
		}
		else if(progcode == '1'){
			programlevel = "Diploma";
		}
		else if(progcode == '2'){
			programlevel = "Degree";
		}
		else if(progcode == '7'){
			programlevel = "Master";
		}
		else if(progcode == '9'){
			programlevel = "Doctorate";
		}
		return ("\nProgram Level: " +programlevel);
	}
}
