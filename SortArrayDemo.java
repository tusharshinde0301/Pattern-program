package basic;
import java.util.*;
public class SortArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   /*  int arr[]= {2,6,3,1,10,9};
     Arrays.sort(arr);
    // System.out.println("Elements sorted in ascending order: ");
     for(int i=0;i<arr.length;i++)
     {
    	 System.out.println(arr[i]);
     }*/
		
		//Split the words
	/*	String s1= "java string split method";            //return array type
		
		String[] words=s1.split("\s");
		for(String w:words)
		{
			System.out.println(w);
		}
   */
		
		//join String using concat method
		
		String s1="ABC";
		String s2="PQR";
		String s3="XYZ";
		String s4=s1.concat(s2).concat(s3);
		System.out.println(s4);
	
}

}
