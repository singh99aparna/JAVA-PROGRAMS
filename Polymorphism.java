class Student
{
	String name;
	int ID;
	Student(String x, int y)
	 {
		this.name=x;
		this.ID=y;
	 }
void getData()
{
	System.out.println("Name="+name);
	System.out.println("IDno="+ID);
	
}
}
class Teacher extends Student
{
	int pay;
	Teacher(String x, int y, int z )
	 {
		super(x,y);
		this.pay=z;
	 }
	void getInfo()
	 {
		super.getData();
		System.out.println("Payment="+pay);
		 }
}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1= new Student("Rahul",101);
s1.getData();
Teacher t1= new Teacher("rama",1001,10000);
t1.getInfo();
Student s2=new Teacher("pqr",102,28745);
s2.getData();
}

}
