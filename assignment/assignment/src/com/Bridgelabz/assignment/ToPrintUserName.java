package com.Bridgelabz.assignment;
import java.util.Scanner;
public class ToPrintUserName 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		String s=" ";
		System.out.println("Enter the Name");
		String name=scn.next();
		if(name.length()>3)
		{
			char a[]=name.toCharArray();

			for(int i=0;i<a.length;i++)
			{
				if ((a[i]>=75&&a[i]<=90)||(a[i]>=97&&a[i]<=122))
				{
					s=s+a[i];
				}
				else
				{
					System.out.println(" Name should contain  only alphabets");
					System.exit(0);
				}
			}
			System.out.println("hello "+s+" how are you ?");
		}
		else
		{
			System.out.println("Name  should conatin atleat 3 character");
		}
		
		scn.close();
	}
}
