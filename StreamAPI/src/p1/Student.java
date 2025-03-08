package p1;


public class Student {
	
	public int rollNo;
	public String name;
	public String subject;
	public int fee;
	
	public Student() {
		
	}

	public Student(int rollNo, String name, String subject, int fee) {
		this.rollNo = rollNo;
		this.name = name;
		this.subject = subject;
		this.fee = fee;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
	@Override
	public String toString() {
		return  rollNo +" "+ name +" "+ subject +" "+ fee +"\n" ;
	}
	

}
