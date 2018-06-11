package Assign5;

import java.util.Scanner;

public class SecondLargest {
	
	int a[] = new int[10];
	void display()
	{
		int max=0,max2=0;
		for(int i=0; i<10; i++)
		{
			if(a[i]>max)
			{
				max2=max;
				max=a[i];
			}
			else if(a[i]>max2&&a[i]<max)
			{
				max2=a[i];
			}
		}
		System.out.println("Second Largest number present in array is: " + max2);
	}

	public static void main(String[] args) {
		int x;
		SecondLargest sl = new SecondLargest();
		Scanner s = new Scanner(System.in);
		for(int i=0; i<10; i++)
		{
			sl.a[i] = s.nextInt();
		}
		sl.display();

	}

}
