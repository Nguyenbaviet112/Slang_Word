package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.EditSlangWordView;

public class EditSlangWordListener implements ActionListener {

	private EditSlangWordView editview;
	
	public EditSlangWordListener(EditSlangWordView editview)
	{
		this.editview = editview;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String button = e.getActionCommand();
		
		if (button.equals("Edit"))
		{
			this.editview.editSlangWord();
		}
	}

}
