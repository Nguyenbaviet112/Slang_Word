package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import view.AddSlangWordView;
import view.MenuView;
import view.SearchDefinitionView;
import view.SearchSlangWordsHistoryView;
import view.SearchWordsView;

public class MenuListener implements ActionListener, WindowListener {
	private MenuView menuView;
	private AddSlangWordView addSlangWordView;
	private SearchDefinitionView searchDefinitionView;
	private SearchWordsView searchWordsView;
	private SearchSlangWordsHistoryView searchSlangWordsHistoryView;
	
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
			searchWordsView = new SearchWordsView(this.menuView);
			
		}
		
		else if (button.equals("Tìm kiếm definition"))
		{
			searchDefinitionView = new SearchDefinitionView();
		}
		else if (button.equals("Hiển thị history"))
		{
			searchSlangWordsHistoryView = new SearchSlangWordsHistoryView();
		}
		else if (button.equals("Add 1 slang word mới"))
		{
			addSlangWordView = new AddSlangWordView(this.menuView);
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		this.menuView.WriteNewFileSlangWord();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
