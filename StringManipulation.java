package appleQA;

public class StringManipulation{
	 
	public static void main(String[] args) {
    	String givenString = "This is a sample string";
    	char charToRemove = 's';
    	

        System.out.println(removeCharByIteration(givenString, charToRemove));
        System.out.println(removeChar(givenString, charToRemove));
	}
	

	public static String removeCharByIteration(String sampleString, char charToRemove) {
    	if(null == sampleString)
        	return null;
    	
    	StringBuilder resultString = new StringBuilder(sampleString.length());       
    	for(char chr: sampleString.toCharArray()){
        	if(chr != charToRemove)
            	resultString.append(chr);
    	}
 
    	return resultString.toString();
	}
	
	public static String removeChar(String sampleString, char charToRemove) {
    	if(null == sampleString)
        	return null;
    	
    	return sampleString.replace(String.valueOf(charToRemove), "");
	}
}


