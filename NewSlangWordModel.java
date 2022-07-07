package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewSlangWordModel {
	
	private Map<String, List<String>> wordList;
	private Map<String, List<String>> wordList_1;
	
	public NewSlangWordModel ()
	{
		wordList = new HashMap<String, List<String>>();
		wordList_1 = new HashMap<String, List<String>>();
	}
	
	public Map<String, List<String>> getWordList() {
		return wordList;
	}



	public void setWordList(Map<String, List<String>> wordList) {
		this.wordList = wordList;
	}



	public Map<String, List<String>> getWordList_1() {
		return wordList_1;
	}



	public void setWordList_1(Map<String, List<String>> wordList_1) {
		this.wordList_1 = wordList_1;
	}



	public void get_SlangWord_Definition()
	{
		try(BufferedReader br = new BufferedReader(new FileReader("newslangword.txt"))) 
		{
		    
			String key = "";
			
			String [] data = {};
			String [] data_value = {};
		    String line = br.readLine();

		    while (line != null) {
		    	
		    	List<String> value = new ArrayList<String>();
		    	data = line.split("`");
		    	if (data.length > 1)
		    	{
		    		
		    		
		    		key = data[0];
		    		data_value = data[1].split("[|]");
		    		for (int i = 0; i < data_value.length; i++)
		    		{
	    				
		    			value.add(data_value[i].trim());
		    			
		    		}
		    		
		    		if (wordList.containsKey(key) && wordList.size() > 0)
		    		{
	
		    			wordList_1.put(key, value);
		    		}
		    		
		    		else
		    		{

		    			wordList.put(key, value);
		    		}
		    		
		    		
	    	
		    	}
		    	
		    	
		        line = br.readLine();
		        
		    }
		    
		    System.out.println(wordList.size() + wordList_1.size());
		    
		}
	
		catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
