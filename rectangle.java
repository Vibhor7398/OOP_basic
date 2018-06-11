package Assign5;
import java.util.Scanner;

public class rectangle {


	int length,breadth,ar;
	public void calculateArea(int l,int b)
	{
		ar = l*b;
		System.out.println("The area of rectangle is: " + ar);
	}



	public static void main(String[] args) {
		rectangle r = new rectangle();
		Scanner s = new Scanner(System.in);
		r.length = s.nextInt();
		r.breadth = s.nextInt();
		r.calculateArea(r.length,r.breadth);
	}

}
