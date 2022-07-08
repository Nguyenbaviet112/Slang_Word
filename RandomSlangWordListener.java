package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.RandomSlangWordView;

public class RandomSlangWordListener implements ActionListener {
	private RandomSlangWordView randomView;
	
	public RandomSlangWordListener(RandomSlangWordView randomView)
	{
		this.randomView = randomView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String button = e.getActionCommand();
		
		if (button.equals("Random"))
		{
			this.randomView.RandomSlangWord();
		}
		
	}
	
	
	
}
