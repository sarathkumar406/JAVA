import java.util.*;
import java.util.Map.*;
import java.io.*;
class RepeatedWordsInFile 
{
	public static void main(String[] args) 
	{
		HashMap<String,Integer> wordCountMap = new HashMap<>();
		try{

		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\sarat\\OneDrive\\Desktop\\sample.txt"));
		String currentLine = reader.readLine();
		System.out.println("currentLine ------>>> "+currentLine);

		while(currentLine!=null){
			String[] str = currentLine.split(" ");
			 for (String word : str)
                {
                    //if word is already present in wordCountMap, updating its count
                     
                    if(wordCountMap.containsKey(word))
                    {   
                        wordCountMap.put(word, wordCountMap.get(word)+1);
                    }
                     
                    //otherwise inserting the word as key and 1 as its value
                    else
                    {
                        wordCountMap.put(word, 1);
                    }
                }
			currentLine = reader.readLine();
		}
		System.out.println(wordCountMap);
		
		String repeatWord = null;

		int count = 0;

		Set<Entry<String,Integer>> entrySet = wordCountMap.entrySet();

		for(Entry<String,Integer> entry : entrySet){

			if(entry.getValue() > count){
					repeatWord = entry.getKey();
					count = entry.getValue();
			}
		}
		
		System.out.println("repeated word "+repeatWord);
		System.out.println("repeated word count "+count);

		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
