package syed;



class Rectangle
{
	int area(int l, int b)
	{
		return l*b;
	}
	
	float area(int l ,float b)
	{
		return l*b;
	}
}

public class ExampleForMethodOverloading {

	public static void main(String[] args) {
		int a=10, b=20;
		float m=45.5f, n=65.2f;
		Rectangle r=new  Rectangle();
		System.out.println(r.area(a, b));
		System.out.println(r.area(a, n));
		
	}

}
