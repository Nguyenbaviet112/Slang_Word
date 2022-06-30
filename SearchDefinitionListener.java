package controller;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import view.SearchDefinitionView;

public class SearchDefinitionListener implements DocumentListener  {

	private SearchDefinitionView searchDefinitionView;
	
	public SearchDefinitionListener(SearchDefinitionView searchDefinitionView)
	{
		this.searchDefinitionView = searchDefinitionView;
	}
	
	@Override
	public void insertUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		this.searchDefinitionView.loadSlangWord();
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		this.searchDefinitionView.loadSlangWord();
		
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		this.searchDefinitionView.loadSlangWord();
		
	}

}
