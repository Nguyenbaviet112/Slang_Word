package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import model.SlangWordModel;
import view.AddSlangWordView;
import view.DeleteSlangWordView;
import view.EditSlangWordView;
import view.MenuView;
import view.RandomSlangWordView;
import view.RiddleDefenitionView;
import view.RiddleSlangWordView;
import view.SearchDefinitionView;
import view.SearchSlangWordsHistoryView;
import view.SearchWordsView;

public class MenuListener implements ActionListener, WindowListener {
	private MenuView menuView;
	private AddSlangWordView addSlangWordView;
	private SearchDefinitionView searchDefinitionView;
	private SearchWordsView searchWordsView;
	private SearchSlangWordsHistoryView searchSlangWordsHistoryView;
	private EditSlangWordView editSlangWordView;
	private DeleteSlangWordView deleteSlangWordView;
	private SlangWordModel slangWordModel;
	private RandomSlangWordView randomSlangWordView;
	private RiddleSlangWordView riddleSlangWord;
	private RiddleDefenitionView defenitionView;
	
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
			searchDefinitionView = new SearchDefinitionView(this.menuView);
		}
		else if (button.equals("Hiển thị history"))
		{
			searchSlangWordsHistoryView = new SearchSlangWordsHistoryView();
		}
		else if (button.equals("Add 1 slang word mới"))
		{
			addSlangWordView = new AddSlangWordView(this.menuView);
		}
		else if (button.equals("Edit 1 slang word"))
		{
			editSlangWordView = new EditSlangWordView(this.menuView);
		}
		else if (button.equals("delete 1 slang word")) {
			deleteSlangWordView = new DeleteSlangWordView(this.menuView);
		}
		else if (button.equals("Reset slang words"))
		{
			this.slangWordModel = new SlangWordModel();
			this.slangWordModel.get_SlangWord_Definition();
			this.slangWordModel.getWordList();
			this.slangWordModel.getWordList_1();
			
			this.menuView.setSlangWordList(this.slangWordModel.getWordList());
			this.menuView.setSlangWordList_1(this.slangWordModel.getWordList_1());
			
			JOptionPane.showMessageDialog(this.menuView, "Reset successfully", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
			return;
			
		}
		
		else if (button.equals("Random 1 slang wrod"))
		{
			this.randomSlangWordView = new RandomSlangWordView(this.menuView);
		}
		
		else if(button.equals("Đố vui slang words"))
		{
			this.riddleSlangWord = new RiddleSlangWordView(this.menuView);
			this.riddleSlangWord.showInformation();
		}
		else if (button.equals("Đố vui defenition"))
		{
			this.defenitionView = new RiddleDefenitionView(menuView);
			this.defenitionView.showInformation();
		}
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
		this.menuView.WriteNewFileSlangWord(this.menuView);
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
