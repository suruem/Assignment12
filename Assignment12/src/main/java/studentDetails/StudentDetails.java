package studentDetails;

public class StudentDetails {
	String name;
	int rollno;
	public void setStudent(String name, int no) {
		this.name=name;
		rollno=no;
	}
	public void getStudent() {
		System.out.println("Student Name: "+name+ "\n" +"Roll Number: "+rollno);
	}

}
