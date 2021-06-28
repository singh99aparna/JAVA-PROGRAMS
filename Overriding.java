import java.util.Scanner;

class Rect
{
	int l,b;
	void getData()
	{
		Scanner sac= new Scanner(System.in);
		System.out.println("Enter length");
		l=sac.nextInt();
		System.out.println("Enter breadth");
		b=sac.nextInt();
		}
}
class Cube extends Rect
{
	int h;
void getInput()
{
	super.getData();
	Scanner sac = new Scanner (System.in);
	System.out.println("Enter height");
	h=sac.nextInt();
}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r1= new Rect();
		r1.getData();
		Cube c1 = new Cube();
		c1.getInput();

	}
}


