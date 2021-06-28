class ConstructorOverloading
{
	int rollno;
	int age;
	String name;
	ConstructorOverloading(int i, String j)
	 {
		rollno=i;
		name=j;
	 }
	ConstructorOverloading(int i, int a, String j)
	 {
		rollno=i;
		age =a;
		name=j;
	 }
	void getDisplay()
	{
		System.out.println(rollno+""+name+""+age);
	}
}
public class Mainconstructoroverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading c1 = new ConstructorOverloading(12, "abc");
		ConstructorOverloading c2 = new ConstructorOverloading(1,16,"xyz");
		c1.getDisplay();
		c2.getDisplay();
	}

}
