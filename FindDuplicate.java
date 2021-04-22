//Question 3
//Suppose you have an array of 101 integers. This array is already sorted and all numbers in this array are consecutive. Each number only occurs once in the array except one number which occurs twice. Write a js code to find the repeated number.
//e.g $arr = array(0,1,2,3,4,5,6,7,7,8,9,10...................);


import java.util.Scanner;

class DuplicateElement {
	 
    void duplicateValue(int[] arr) {

    	int flag = 0 ;
    for (int i = 0; i < arr.length -1; i++) {
        if(arr[i] == arr[i+1]) {
            System.out.println(arr[i] +" is Duplicate");
            flag = 1;
            break;
        } 
        
    }
    if(flag == 0)
    {
    	System.out.println("No Duplicate Element");
    }
  
}
}

public class FindDuplicate {
public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter Array Element in sorting Order with only one repeated");
		for(int i = 0; i < size; i++)
		{
		   arr[i] = sc.nextInt();
		}
 
		DuplicateElement obj = new DuplicateElement();
        obj.duplicateValue(arr);
    }

}
