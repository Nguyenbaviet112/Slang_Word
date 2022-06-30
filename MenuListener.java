package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MenuView;
import view.SearchDefinitionView;
import view.SearchWordsView;

public class MenuListener implements ActionListener {
	private MenuView menuView;
	private SearchDefinitionView searchDefinitionView;
	private SearchWordsView searchWordsView;
	
	public MenuListener(MenuView menuView)
	{
		this.menuView = menuView;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String button = e.getActionCommand();
		
		if (button.equals("Tìm kiếm slag words"))
		{
			searchWordsView = new SearchWordsView();
			
		}
		
		else if (button.equals("Tìm kiếm definition"))
		{
			searchDefinitionView = new SearchDefinitionView();
		}
	}

}
