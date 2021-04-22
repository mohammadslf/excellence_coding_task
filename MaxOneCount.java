/*
Question 2
Find the maximum consecutive 1's in an array of 0's and 1's.
Example:
a) 00110001001110 - Output :3 [Max num of consecutive 1's is 3]
b) 1000010001 - Output :1 [Max num of consecutive 1's is 1]

*/


import java.util.Scanner;

class MaxConsecutiveOnes {
	 
        void findMaximumOnes(int[] arr) {
 
        int count = 0;
        int maxCount = 0;
 
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                count += 1;
            } else {
                count = 0;
            }
            maxCount = count > maxCount ? count : maxCount;
        }
        System.out.println(maxCount);
    }
}

public class MaxOneCount {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter Array Element");
		for(int i = 0; i < size; i++)
		{
		   arr[i] = sc.nextInt();
		}
 
		MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
        obj.findMaximumOnes(arr);
    }
}
