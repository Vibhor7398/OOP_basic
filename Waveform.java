package Assign5;

import java.util.Scanner;

public class Waveform {

	int a[] = new int[10];
	int temp;

	void display() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 9; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		
		for(int i=0;i<10;i+=2)
		{
			temp = a[i];
			a[i] = a[i + 1];
			a[i + 1] = temp;
		}
		
		for(int i=0;i<10;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		Waveform w = new Waveform();
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			w.a[i] = s.nextInt();
		}
		w.display();

	}

}
