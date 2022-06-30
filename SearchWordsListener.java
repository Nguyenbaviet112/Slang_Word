package controller;

import java.awt.event.ActionEvent;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import view.SearchWordsView;


public class SearchWordsListener implements DocumentListener  {

	private SearchWordsView searchWordsView;
	
	public SearchWordsListener(SearchWordsView searchWordsView)
	{
		this.searchWordsView = searchWordsView;
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		this.searchWordsView.loadSlangWord();
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		this.searchWordsView.loadSlangWord();
		
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		this.searchWordsView.loadSlangWord();
		
	}
	

		
	

}
