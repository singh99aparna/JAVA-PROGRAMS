class Studentinfo
{
	private String name,section,semester;
	private int percentage;
	Studentinfo(String name, String sec, String sem,int per)
	{
		this.name=name;
		this.section=sec;
		this.semester=sem;
		this.percentage=per;
	}
	public String getName()
	{
		return name;
	}
	public String getSection()
	{
		return section;
	}
	public String getSemester()
	{
		return semester;
	}
	public int getPercentage()
	{
		return percentage;
	}
	public void setPercentage(int p)
	{
		percentage=p;
	}
}

public class Encapsultion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentinfo s1=new Studentinfo("ravi","c","2",78);
		System.out.println("Name="+s1.getName());
		System.out.println("Section="+s1.getSection());
		System.out.println("Semester="+s1.getSemester());
		System.out.println("Percentage="+s1.getPercentage());
		
		Studentinfo s2=new Studentinfo("ravi","c","2",78);
		System.out.println("Name="+s2.getName());
		System.out.println("Section="+s2.getSection());
		System.out.println("Semester="+s2.getSemester());
		s2.setPercentage(90);
		System.out.println("Percentage="+s2.getPercentage());
	}

	}


