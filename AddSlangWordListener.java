package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.AddSlangWordView;

public class AddSlangWordListener implements ActionListener {

	private AddSlangWordView addSlangWordView;
	
	public AddSlangWordListener(AddSlangWordView addSlangWordView)
	{
		this.addSlangWordView = addSlangWordView;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String button = e.getActionCommand();
		
		if (button.equals("ADD"))
		{
			this.addSlangWordView.addSlangWord();
		}
		
	}

}
