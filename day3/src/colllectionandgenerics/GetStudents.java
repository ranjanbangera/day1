package colllectionandgenerics;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GetStudents {
	public static HashMap<Integer, String> gtStudents(Map<Integer, Integer> gs) {
		// new HasMap of Integer and String values
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		// iterating through input HashMap
		for (Map.Entry ele : gs.entrySet()) {
			// checking for marks and assigning to new HashMap
			if ((int) ele.getValue() >= 90) {
				hm.put((Integer) ele.getKey(), "Gold");
			} else if ((int) ele.getValue() >= 80 && (int) ele.getValue() < 90) {
				hm.put((Integer) ele.getKey(), "Silver");
			} else if ((int) ele.getValue() >= 70 && (int) ele.getValue() < 80) {
				hm.put((Integer) ele.getKey(), "Bronze");

			}
		}
		return hm;
	}

	public static void main(String[] args) {
		// new HashMap
		HashMap<Integer, Integer> gs = new HashMap<Integer, Integer>();
		// inserting key,value pairs
		gs.put(1011, 58);
		gs.put(1012, 89);
		gs.put(1013, 90);
		gs.put(1014, 75);
		gs.put(1015, 95);
		gs.put(1016, 80);
		gs.put(1017, 38);
		gs.put(1018, 78);
		gs.put(1019, 70);
		// getting values from method and assigning to new HashMap
		HashMap<Integer, String> nh = gtStudents(gs);
		System.out.println("  " + "Reg No  :  " + "Medal");
		System.out.println("------------------------");
		// printing final result
		for (Entry<Integer, String> m1 : nh.entrySet()) {
			System.out.println("     " + m1.getKey() + " : " + m1.getValue());

		}

	}

}
