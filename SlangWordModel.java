package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SlangWordModel {
	
	private Map<String, List<String>> wordList;
	private Map<String, List<String>> wordList_1;
	
	
	
	public SlangWordModel ()
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
		int numberOfLine = 0;
		int number = 0;
		String [] data_input = {};
		
		
		
		try(BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
		    
			
		    String line = br.readLine();

		    while (line != null) {
		    	data_input = (line.split(" "));
		    	line = br.readLine();
		    }
		    
		
		    
		   
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		try(BufferedReader br = new BufferedReader(new FileReader("slang.txt"))) {
		    
			String key = "";
			
			String [] data = {};
			String [] data_value = {};
		    String line = br.readLine();

		    while (line != null) {
		    	
		    	List<String> value = new ArrayList<String>();
		    	data = line.split("`");
		    	if (data.length > 1)
		    	{
		    		
		    		for ( int i = 0; i < data_input.length; i++)
		    		{
		    			if (data[0].equals(data_input[i]))
		    			{
		    				key = data[0];
				    		
				    		
				    		data_value = data[1].split("[|]");
			    			for (int j = 0; j < data_value.length; j++)
				    		{
			    				
				    			value.add(data_value[j].trim());
				    			
				    		}
			    			

			    			wordList_1.put(key, value);
		    			}
		    		}
		    		
		    		number++;
		    		key = data[0];
		    		
		    		
		    		data_value = data[1].split("[|]");
	    			for (int i = 0; i < data_value.length; i++)
		    		{
	    				
		    			value.add(data_value[i].trim());
		    			
		    		}
	    			

	    			wordList.put(key, value);
	    	
		    	}
		    	
		    	
		    	numberOfLine++;
		        line = br.readLine();
		        
		    }
		       
		    
		    System.out.println("wordList: " + wordList.size());
		    System.out.println("wordList_1: " + wordList_1.size());
		    System.out.println("Total Line Read: " + number);
		    System.out.println("Total Line in File: " +numberOfLine);
		
		    
		   
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
