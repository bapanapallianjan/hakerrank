package hakerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramDifference {

	public static void main(String[] args) {
		String[] a = { "tea", "tea", "act" };
		String[] b = { "ate", "toe", "acts" };
		
		
				
		List<Integer> result = findDifference(a, b);
		System.out.println(result);
	}

	static List<Integer> findDifference(String[] a, String[] b) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				result.add(findAnagramDifference(a[i], b[j]));
			}
			break;
		}
		return result;
	}

	static int findAnagramDifference(String string1, String string2) {
		if (string1.length() != string2.length()) {
			return -1;
		}
		char[] a1 = string1.toCharArray();
		char[] a2 = string2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		if (Arrays.equals(a1, a2)) {
			return 0;
		} else {
			String str1 = new String(a1);
			String str2 = new String(a2);
			// System.out.println(str1 + " "+str2 );
			return modify(str1, str2);
		}
	}

	static String getString(char x) {
		String s = String.valueOf(x);
		return s;
	}

	static int modify(String s1, String s2) {
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				char c1 = s1.charAt(i);
				char c2 = s2.charAt(j);

				if (!s2.contains(Character.toString(c1))) {
					s2 = s2.replace(c2, c1);
					char[] a1 = s1.toCharArray();
					char[] a2 = s2.toCharArray();
					Arrays.sort(a1);
					Arrays.sort(a2);
					if (Arrays.equals(a1, a2)) {
						return 1;
					}
				}

				if (c1 == c2) {
					break;
				} else {
					s2 = s2.replace(c1, c2);
				}
			}
		}
		return 1;
	}
}
