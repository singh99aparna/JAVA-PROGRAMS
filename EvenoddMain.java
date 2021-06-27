class Evenodd
{
	int num=10;
	void getNum()
	{
		if (num%2==0)
			System.out.println("num is even");
		else
			System.out.println("num is odd");
		
	}
	
}

public class EvenoddMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Evenodd ev= new Evenodd();
ev.getNum();

	}

}
