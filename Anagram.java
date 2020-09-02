package hakerrank;

import java.util.Arrays;

public class Anagram {
	
	   public static void main (String[] args) throws java.lang.Exception
	    {
	        boolean result = isAnagram("god","dog");
	        System.out.println(result);
	    }
	    public static boolean isAnagram(String first, String second)
	    {
	        if (first.length() != second.length())
	        return false;

	        char[] firstArray = first.toCharArray();
	        char[] secondArray = second.toCharArray();

	        Arrays.sort(firstArray);
	        Arrays.sort(secondArray);

	        return Arrays.equals(firstArray,secondArray);
	    }

}
