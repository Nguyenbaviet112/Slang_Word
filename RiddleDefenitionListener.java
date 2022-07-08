package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import view.RiddleDefenitionView;

public class RiddleDefenitionListener implements MouseListener {

	private RiddleDefenitionView riddleView;
	
	public RiddleDefenitionListener(RiddleDefenitionView riddleView)
	{
		this.riddleView = riddleView;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		Object o = e.getSource();
		JButton b = null;
		
		String buttonText = "";

		if(o instanceof JButton)
		    b = (JButton)o;

		if(b != null)
		    buttonText = b.getText();
		
		if (buttonText.equals("Tiếp tục"))
		{
			this.riddleView.clickContinue();
			return;
		}
		
		else if (buttonText.equals("Thoát"))
		{
			this.riddleView.dispose();
			return;
		}
		
		this.riddleView.checkResult(buttonText);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
