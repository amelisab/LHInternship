
public abstract class GeometricObject {
	private java.util.Date dateCreated;
	
	GeometricObject(){
		this.dateCreated = new java.util.Date();
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	
}
