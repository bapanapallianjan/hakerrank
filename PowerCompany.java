package hakerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PowerCompany {
	public static void main(String[] args) {
        //int[] num = {7, 10, 1, 2,7,7,1};
        int[] num = {14,3, 4, 6, 11, 9, 9, 9, 9, 8,8,8,8,8,8};
        
        int n = reduceCapacity(num);
        System.out.println("++++  "+n+"  ++++");
    }


    public static int reduceCapacity(int[] num){
        int n = (int)Math.ceil(num.length/2) ; 
        if(n%2 !=0)
            n = n+1;
        System.out.println("n= "+n);
        int k = 0;
        Long prev = 0L;
        
        // Converting integer array to map with frequency of occurances.
        Map<Integer, Long> modelMap = Arrays
                .stream(num)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), HashMap::new,  Collectors.counting()));
        
        System.out.println("modelMap 1"+modelMap);
        
        //Sorting the generated map on the values.
        modelMap = modelMap.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue    , (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        
        System.out.println("modelMap 2"+modelMap);
        
        System.out.println("n "+n);
        for (Entry<Integer, Long> entry : modelMap.entrySet()) {
        	System.out.println("entry :"+entry);
            ++k;
            System.out.println("before"+prev + entry.getValue());
            if (prev + entry.getValue() >= n) {
                System.out.println("true"+prev + entry.getValue());
                break;
            } else {
                prev += entry.getValue();
            }
        }
        return k;
    }


}
