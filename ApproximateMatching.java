package hakerrank;

public class ApproximateMatching {
public static void main(String[] args) {
	
	
	//String text = "nothing";
//  String prefixString = "bruno";
//  String suffixString = "ingenious";
	   String text = "engine"; 
       String prefixString = "raven"; 
       String suffixString = "ginkgo";
     
     int textScore = extractedScore(text, prefixString, suffixString);
     System.out.println("Text total score:"+textScore);
 }


 private static int extractedScore(String text, String prefixString, String suffixString) {
     int prefixScore = 0;
     int suffixScore = 0;
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
     
     for(int i = suffixString.length(); i > 0 ; i-- ) {
         String subString = suffixString.substring(0, i);
         //System.out.println(subString);
         
           if(text.contains(subString)) 
           { 
               suffixScore = subString.length();
               break; 
           } 
     }
     
     textScore = prefixScore + suffixScore;
     
     System.out.println("Prefix score:"+prefixScore);
     System.out.println("Suffix score:"+suffixScore);
     
     return textScore;
 }
}

