package arrays;

import java.util.Scanner;

public class TwoDimensionalArrays2 {

	public static void main(String[] args) {
		
		int[][] a=new int[2][5];
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
			
		}
		
		//a[0][0]=1;
		//a[0][1]=2;
		//a[0][2]=3;
		//a[0][3]=4;
		//a[0][4]=5;
		
		System.out.println("Enter values for row 1 ");
		
		Scanner input=new Scanner(System.in);
		
		for(int i=0;i<a[0].length;i++)
		{
			System.out.println("enter value for a[0][["+i+"] : ");
			a[0][i]=input.nextInt();
		}
		
		a[1][0]=a[0][0]*a[0][0];
		a[1][1]=a[0][1]*a[0][1];
		a[1][2]=a[0][2]*a[0][2];
		a[1][3]=a[0][3]*a[0][3];
		a[1][4]=a[0][4]*a[0][4];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
			
		}
		
		

	}

}
