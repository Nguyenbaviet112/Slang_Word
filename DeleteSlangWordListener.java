package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.DeleteSlangWordView;

public class DeleteSlangWordListener implements ActionListener {
	private DeleteSlangWordView deleteSlangWordView;
	
	public DeleteSlangWordListener(DeleteSlangWordView deleteSlangWordView)
	{
		this.deleteSlangWordView = deleteSlangWordView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String button = e.getActionCommand();
		
		if (button.equals("Delete"))
		{
			this.deleteSlangWordView.deleteSlangWord();
		}
		
	}
	
	
	
}
