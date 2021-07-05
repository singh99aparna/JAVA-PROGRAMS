public class Static 
{
static int i=3;
static void getMessage()
{
	System.out.println("STATIC METHOD="+i);
}
static
{
	System.out.println("STATIC BLOCK");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getMessage();

	}

}
