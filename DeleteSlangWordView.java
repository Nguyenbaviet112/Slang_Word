package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.DeleteSlangWordListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DeleteSlangWordView extends JFrame {

	private JPanel contentPane;
	private JTextField textField_SlangWord;
	private MenuView menuView;
	

	/**
	 * Create the frame.
	 */
	public DeleteSlangWordView(MenuView menuView) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 841, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SlangWord: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(138, 109, 144, 84);
		contentPane.add(lblNewLabel);
		
		this.menuView = menuView;
		DeleteSlangWordListener ac = new DeleteSlangWordListener(this);
		
		textField_SlangWord = new JTextField();
		textField_SlangWord.setBounds(289, 126, 348, 57);
		contentPane.add(textField_SlangWord);
		textField_SlangWord.setColumns(10);
		
		JButton btnDeleteSlangWord = new JButton("Delete");
		btnDeleteSlangWord.setFont(new Font("Arial", Font.PLAIN, 20));
		btnDeleteSlangWord.addActionListener(ac);
		btnDeleteSlangWord.setBounds(341, 238, 182, 57);
		contentPane.add(btnDeleteSlangWord);
		this.setVisible(true);
	}
	
	
	public void deleteSlangWord()
	{
		String slangWord = textField_SlangWord.getText();
		
		if (slangWord.length() == 0)
		{
			JOptionPane.showMessageDialog(contentPane, "Vui lòng nhập đầy đủ thông tin", "Thông báo", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		boolean checkKey = this.menuView.getSlangWordList().containsKey(slangWord);
		boolean checkKey_1 = this.menuView.getSlangWordList_1().containsKey(slangWord);
		
		int dialogButton = JOptionPane.YES_NO_OPTION;
		int dialogResult = JOptionPane.showConfirmDialog(this, "Ban có chắc chắn muốn xóa slagword này không?", "Title on Box", dialogButton);
		if(dialogResult == 0) {
			
			if (checkKey == true)
			{	
				this.menuView.getSlangWordList().remove(slangWord);
			}
			else if (checkKey_1 == true)
			{
				this.menuView.getSlangWordList_1().remove(slangWord);
			}
			else
			{
				JOptionPane.showMessageDialog(contentPane, "Slangword does not exist", "Thông báo", JOptionPane.ERROR_MESSAGE);
				return;
			}
		  
		} else {
			
			JOptionPane.showMessageDialog(contentPane, "Hủy bỏ xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
			return;
		  
		} 
		
		
		JOptionPane.showMessageDialog(contentPane, "Delete successfully", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

	}
	
	
}
