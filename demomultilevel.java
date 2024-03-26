package week8;
class vehicle
{
	protected String Vehicletype;
	private int maxspeed;
	vehicle (int mspeed)
	{
		maxspeed=mspeed;
	}
	public void speed()
	{
		System.out.println("it can cruise upto maximum speed of "+maxspeed+"km/hour");
	}
}
class Toyota extends vehicle
{
	protected String brand;
	Toyota (int mspeed)
	{
		super(mspeed);
	}
}
class Fortuner extends Toyota
{
	private String model;
	Fortuner (String vtype,int ms, String br, String mod)
	{
	super(ms);
	Vehicletype=vtype;
	model=mod;
	brand=br;
	}
	public void display()
	{
		System.out.println("the name of the vehicle is"+model);
		System.out.println("it's brand is "+brand);
		System.out.println("the type of vehicle is"+Vehicletype);
		this.speed();
	}
  }
 public class demomultilevel 
 {
	 public static void main(String args[])
	 {
		 Fortuner Sigma = new Fortuner("four wheeler",280,"Toyota","Fortuner");
		 Sigma.display();
	 }
 }
