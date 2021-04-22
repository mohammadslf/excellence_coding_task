/*

Assume there is a object of this format 
var obj = {
 “id” : 4, “name” : “abc”,
 “id” : 10, “name” : “ab2”,
 “id” : 5, “name” : “abc3”,
 “id” : 6, “name” : “abc5”
}
It can be a dictionary or java object, as per your language of choice. But its key/value pair dictionary simply.

Write a code to sort the object by id 
I.e final output should have objected sort by id’s

*/



import java.util.Map;
import java.util.TreeMap;

public class SortByKey {
	public static void main(String args[]){  
		Map<Integer,String> map=new TreeMap<Integer,String>();    
				     
				   
				      map.put(4,"abc");    
				      map.put(10,"abc2");    
				      map.put(5,"abc3");   
				      map.put(6,"abc5"); 
				      
				    
				     System.out.println(map);
				      
				 }

}