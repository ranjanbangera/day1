package colllectionandgenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetValues {
	public static List<Integer> getValues(List<Integer> al) {
		Collections.sort(al);
		return al;
		
	}

	public static void main(String[] args) {
		int[] arr= {1,5,9,3,4,7};
		List<Integer> lis=convertList(arr);
		System.out.println(lis);
		System.out.println("Sorted List is : "+getValues(lis));
		

	}
private static List<Integer> convertList(int[] ar) {
	List<Integer> li=new ArrayList<Integer>();
	for(int ele:ar) {
		li.add(ele);
		
	}
		
		return li;
	
	
}
}