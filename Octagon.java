
public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	
	private double side;
	
	Octagon(double side){
		this.side = side;
	}
	
	public double getSide() {
		return this.side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();	
	}
	
	@Override
	public int compareTo(Octagon o) {
		if (this.side == o.getSide()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	@Override
	public double getArea() {
		double area;
		area = (2 + 4/22)*side*side;
		
		return area;
	}
	
	@Override
	public double getPerimeter() {
		double perimeter;
		perimeter = side*8;
		return perimeter;
	}
	
	
	
	
	
}
