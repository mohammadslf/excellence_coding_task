/*
Question 1
Define an array of numbers (use any random numbers). Write a program to print only the even numbers of the array. Do not use any library functions, need to do via for loops only
*/


import java.util.Scanner;

class Even
{
	void evenNumber(int size, int arr[])
	{
		int flag = 0;
		for(int i = 0; i < size ; i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.println(arr[i]);
				flag = 1;
			}
		}
		if(flag == 0 )
		{
			System.out.println("No Even No in Array");
		}
		
	}
}

public class EvenNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter Array Element");
		for(int i = 0; i < size; i++)
		{
		   arr[i] = sc.nextInt();
		}
		
		Even obj = new Even();
		obj.evenNumber(size, arr);
	}
	
}


