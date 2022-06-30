package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchSlangWordHistoryModel {
	
	private List<String> listhistorySearch;
	
	public SearchSlangWordHistoryModel()
	{
		listhistorySearch = new ArrayList<String>();
	}

	public List<String> getHistorySearch() {
		return listhistorySearch;
	}

	public void setHistorySearch(List<String> listhistorySearch) {
		this.listhistorySearch = listhistorySearch;
	}
	
	
	public void getListHistorySearch()
	{
		
		try(BufferedReader br = new BufferedReader(new FileReader("historysearch.txt"))) {
		    
			
		    String line = br.readLine();

		    while (line != null) {
		    	listhistorySearch.add(line);
		    	line = br.readLine();
		    }
		   
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
