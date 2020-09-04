package hakerrank;

public class PrefixString {

	public static void main(String[] args) {
		 String text = "anji"; 
         String prefixString = "ramanji"; 
         
         int textScore = prefix(text, prefixString);
         System.out.println("Text total score:"+textScore);
         
         
	}

	private static int prefix(String text, String prefixString) {
		
		  int prefixScore = 0;
	        int textScore = 0;
	        
	        for(int i = 0; i < prefixString.length() ; i++ ) {
	            String subString = prefixString.substring(i, prefixString.length());
	            //System.out.println(subString);
	            
	              if(text.contains(subString)) 
	              { 
	                  prefixScore = subString.length();
	                  break; 
	              } 
	        }
	        
	        System.out.println("#################");
	      
		return prefixScore;
	}
}
