
public class p6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RacingCarp6 rccar1=new RacingCarp6(1234,20.5,5);
		
	}
}


class Carp6 {
	private int num;
	private double gas;
	
public Carp6() {
	num =0;
	gas=0.0;
	System.out.println("生產了車子");
}
public Carp6(int n,double g)
{
	
	num=n;
	gas=g;
	System.out.println("將車號設為"+num+"，汽油量設為"+gas);
}
public void setCar(int n,double g)
{
	
	num=n;
	gas=g;
	System.out.println("將車號設為"+num+"，汽油量設為"+gas);
}



public void show()
{
	System.out.println("車號是"+num);
	System.out.println("汽油量是"+gas);
}
}
class RacingCarp6 extends Carp6{
	private int course;
	
	public RacingCarp6() {
		course=0;
		System.out.println("生產了賽車");
	}
	public RacingCarp6(int n,double g,int c)
	{
		super(n,g);
		course=c;
		System.out.println("生產了編號為"+course+"的賽車");
	}
	public void setCourse(int c)
	{
		
		course=c;
		System.out.println("將賽車編號設為"+course);
	}
}