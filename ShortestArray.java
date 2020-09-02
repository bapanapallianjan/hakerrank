package hakerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShortestArray {
	
    
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        
	        int[][] inputarray = { {1,2,3,4},{0,2,7},{4,12},{1,2,5,6}};
	        List<int[]> inputarrayList = Arrays.asList(inputarray);
	        Collections.sort(inputarrayList, new Comparator<int[]>() {
	            @Override
	            public int compare(int[] arg0, int[] arg1) {
	                // TODO Auto-generated method stub
	                return Integer.compare(arg0.length, arg1.length);
	            }
	           
	        });
	        
	        for (int is : inputarrayList.get(0)) {
	            System.out.print(is+" ");
	        }
	    }






}
