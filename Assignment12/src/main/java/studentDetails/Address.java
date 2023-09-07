package studentDetails;

public class Address extends StudentDetails{
String address;

public void setAddress(String address) {
	this.address=address;
	System.out.println("Address : "+address);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ob1=new Address();
		Address ob2=new Address();
		ob1.setStudent("Suru",29);
		ob1.getStudent();
		ob1.setAddress("123 City, City");
		ob2.setStudent("Neethu",20);
		ob2.getStudent();
		ob2.setAddress("ABC City, New York");
	}

}
