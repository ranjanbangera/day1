package colllectionandgenerics;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountChars {
	public static HashMap<Integer, Integer> CountCharss(int[] arr) {
		
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
         //square
		for (int n : arr) {
			m.put(n, n * n);
		}

		return m;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6 };
		HashMap<Integer, Integer> map = CountCharss(array);
		System.out.println("number : squres");
        //printing num:square
		for (Entry<Integer, Integer> m1 : map.entrySet()) {
			System.out.println("     " + m1.getKey() + " : " + m1.getValue());

		}

	}

}
