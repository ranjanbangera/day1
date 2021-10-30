package colllectionandgenerics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VotersList {
	public static List<Integer> votersList(HashMap<Integer, Integer> hm) {
		List<Integer> neww = new ArrayList<Integer>();
		for (Map.Entry ele : hm.entrySet()) {
			if ((int) ele.getValue() > 18) {
				neww.add((int) ele.getKey());
			}
		}
		return neww;
	}

	public static void main(String[] args) {
		HashMap<Integer, Integer> oh = new HashMap<>();
		oh.put(101, 12);
		oh.put(104, 19);
		oh.put(108, 40);
		oh.put(106, 48);
		oh.put(119, 98);
		oh.put(145, 9);
		oh.put(149, 78);
		oh.put(135, 13);
		System.out.println("Candidate ID's which are eligible for vote are : ");
		System.out.println(votersList(oh));

	}

}
