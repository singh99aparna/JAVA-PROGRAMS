import java.util.Scanner;
class Rectangle
{
	int len,bred;
	void getData()
	 {
		Scanner sac = new Scanner(System.in);
		System.out.println("Emter length of a rectangle");
		len= sac.nextInt();
		System.out.println("Enter breadth of a rectangle");
		bred= sac.nextInt();
		}
	void Display()
	 {
		System.out.println("Length="+len);
		System.out.println("Breadth="+bred);
		}
}
class Cuboid extends Rectangle
{
	int heig;
	void getInput()
	 {
		Scanner sac =  new Scanner(System.in);
		System.out.println("Enter height of cuboid");
		heig= sac.nextInt();
	 }
	void Show()
	{
		System.out.println("Height="+heig);
	}
}
public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1= new Rectangle();
		Cuboid c1= new Cuboid();
		System.out.println("\n RECTANGLE DETAILS");
		r1.getData();
		r1.Display();
		System.out.println("CUBOID DETAILS");
		c1.getInput();
		c1.Show();
		}

}
