package objectAndClass;
import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		//System.out.println("Enter height:");
		double height=40;
		//System.out.println("Enter width:");
		double width = 4;
		double height2=35.9;
		double width2=3.5;
		
		SimpleRectangle rect = new SimpleRectangle(height,width);
		
		System.out.printf("The area of rectangle 1 is=%.2f \nand \nperimeter is=%.2f",rect.getArea(),rect.getPerimeter());
		SimpleRectangle rect2 = new SimpleRectangle(height2,width2);
		System.out.printf("\nThe area of rectangle 2 is=%.2f \nand \nperimeter is=%.2f",rect2.getArea(),rect2.getPerimeter());
		

	}

}
