package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import view.SearchWordsView;


public class SearchWordsListener implements ActionListener  {

	private SearchWordsView searchWordsView;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String button = e.getActionCommand();
		
		if (button.equals("Search"))
		{
			this.searchWordsView.loadSlangWord();
		}
	}
	
	
	

		
	

}
