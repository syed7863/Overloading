package syed;

class Car
{
	private String name;
	private int mileage;
	private int cost;
	
	public void setData(String name,int mileage, int cost)
	{
		this.name=name;
		this.mileage=mileage;
		this.cost=cost;
		
	}
	public String getName()
	{
		return name;
	}
	public int getMileage()
	{
		return mileage;
	}
	public int getcost()
	{
		return cost;
	}
}

public class ExampleForEncapsulation {

	public static void main(String[] args) {
		
		Car c= new Car();
		c.setData("BMW", 10, 7978787);
		System.out.println(c.getName());
		System.out.println(c.getMileage());
		System.out.println(c.getcost());
		

	}

}
