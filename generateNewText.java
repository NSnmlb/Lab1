package สตั้าป;

public class generateNewText {
	public static String generateNewText(String inputText)
	{
		
		String[] inputArray = inputText.split(" ");
		String str1="";
		for(int i=0;i<inputArray.length-1;i++)
		{
			queryBridgeWords(inputArray[i].toLowerCase(),inputArray[i+1].toLowerCase());
			 if(fina1[0]==-3)
			 {
				 str1=str1+inputArray[i]+" ";
			 }
			 else
			 {
				 str1=str1+inputArray[i]+" "+word_list[fina1[0]]+" ";
				 
			 } 
		}
	return str1+inputArray[inputArray.length-1];	
	}	
}
