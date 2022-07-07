package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.EditSlangWordListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class EditSlangWordView extends JFrame {

	private JPanel contentPane;
	private JTextField textField_oldSlangword;
	private JTextField textField_newSlangword;
	private MenuView menuView;
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public EditSlangWordView(MenuView menuView) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 938, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		
		this.menuView = menuView;
		EditSlangWordListener ac = new EditSlangWordListener(this);
		
		
		
		JLabel lblNewLabel = new JLabel("Old Slangword:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(64, 70, 153, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewSlangword = new JLabel("New Slangword:");
		lblNewSlangword.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewSlangword.setBounds(64, 144, 153, 43);
		contentPane.add(lblNewSlangword);
		
		textField_oldSlangword = new JTextField();
		textField_oldSlangword.setFont(new Font("Arial", Font.PLAIN, 20));
		textField_oldSlangword.setHorizontalAlignment(SwingConstants.LEFT);
		textField_oldSlangword.setBounds(247, 73, 306, 43);
		contentPane.add(textField_oldSlangword);
		textField_oldSlangword.setColumns(10);
		
		textField_newSlangword = new JTextField();
		textField_newSlangword.setHorizontalAlignment(SwingConstants.LEFT);
		textField_newSlangword.setFont(new Font("Arial", Font.PLAIN, 20));
		textField_newSlangword.setColumns(10);
		textField_newSlangword.setBounds(247, 144, 306, 43);
		contentPane.add(textField_newSlangword);
		
		JButton btn_editSlangword = new JButton("Edit");
		btn_editSlangword.setFont(new Font("Arial", Font.PLAIN, 20));
		btn_editSlangword.setBounds(643, 109, 162, 60);
		btn_editSlangword.addActionListener(ac);
		contentPane.add(btn_editSlangword);
		
		this.setVisible(true);
	}
	
	public void editSlangWord()
	{
		String oldSlangWord = textField_oldSlangword.getText();
		String newSlangWord = textField_newSlangword.getText();
		
		if (oldSlangWord.length() == 0 || newSlangWord.length() == 0)
		{
			JOptionPane.showMessageDialog(contentPane, "Vui lòng nhập đầy đủ thông tin", "Thông báo", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		boolean checkKey = this.menuView.getSlangWordList().containsKey(oldSlangWord);
		boolean checkKey_1 = this.menuView.getSlangWordList_1().containsKey(oldSlangWord);
		
		if (checkKey == true)
		{
			this.menuView.getSlangWordList().put(newSlangWord, this.menuView.getSlangWordList().get(oldSlangWord));
			this.menuView.getSlangWordList().remove(oldSlangWord);
		}
		
		else if (checkKey_1 == true)
		{
			this.menuView.getSlangWordList().put(newSlangWord, this.menuView.getSlangWordList_1().get(oldSlangWord));
			this.menuView.getSlangWordList_1().remove(oldSlangWord);
		}
		
		else
		{
			JOptionPane.showMessageDialog(contentPane, "OldSlangword does not exist", "Thông báo", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		JOptionPane.showMessageDialog(contentPane, "edit successfully", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

		
	}
	
}
