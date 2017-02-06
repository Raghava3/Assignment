package com.Bridgelabz.assignment;
import java.util.Scanner;
public class LeapYear 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int n=0;
		do
		{
			System.out.println("enter the year");
			int year=scn.nextInt();
			if((year/1000>=1)&&(year/1000<=9))
			{

				if ((year%4==0)||(year%400==0)&&(year%100!=0))
				{
					System.out.println("leap year");
				}
				else 
				{
					System.out.println("not a leap year");
				}
			}
			else 
			{
				System.out.println("number should be four digit");
			}

			System.out.println("enter 1 to continue");
			n=scn.nextInt();
			
		}while(n==1);
	System.out.println("thank u");
	}
	
	
}