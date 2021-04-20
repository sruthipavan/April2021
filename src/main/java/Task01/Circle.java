package Task01;

public class Circle {
	
	public int radius;
	public double pi;
	
	public double Area()
	{
		return pi * radius * radius;
	}

	public double Circumference()
	{
		return 2 * pi * radius;
	}
	
	public Circle(int radius, double pi) {
		this.radius = radius;
		this.pi = pi;		
	}
	
	
}


