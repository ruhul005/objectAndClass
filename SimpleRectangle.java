package objectAndClass;

public class SimpleRectangle {
	
	private double height;
	private double width;
	public SimpleRectangle(){
		this(10.0,5.0);
	}
	public SimpleRectangle(double height,double width){
		
		this.height=height;
		this.width=width;
		
	}
	public double getHeight(){
		return height;
	}
	public double getWidth(){
		return width;
	}
	public void setHeight(double height){
		this.height=height;
	}
	public void setWidth(double width){
		this.width=width;
	}
	public double getArea(){
		double area = 0.5*(height*width);
		return area;
	}
	public double getPerimeter(){
		double perimeter=2.0*(height+width);
		return perimeter;
	}
	
	
	
	
}
