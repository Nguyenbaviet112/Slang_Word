package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AddSlangWordListener;
import model.SlangWordModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.lang.ProcessHandle.Info;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JTextField;

public class AddSlangWordView extends JFrame {
	
	private MenuView menuView;
	private JPanel contentPane;
	private JTextField textField_SlangWord;
	private JTextField textField_Definition;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AddSlangWordView(MenuView menuView) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1025, 673);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		this.menuView = menuView;
		AddSlangWordListener ac = new AddSlangWordListener(this);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 991, 122);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add SLangWord");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(317, 23, 292, 75);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 156, 974, 433);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("SlangWord:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(146, 58, 187, 62);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Definition:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(146, 163, 187, 62);
		panel_1.add(lblNewLabel_1_1);
		
		textField_SlangWord = new JTextField();
		textField_SlangWord.setFont(new Font("Arial", Font.PLAIN, 20));
		textField_SlangWord.setBounds(343, 58, 399, 62);
		panel_1.add(textField_SlangWord);
		textField_SlangWord.setColumns(10);
		
		textField_Definition = new JTextField();
		textField_Definition.setFont(new Font("Arial", Font.PLAIN, 20));
		textField_Definition.setColumns(10);
		textField_Definition.setBounds(343, 163, 399, 62);
		panel_1.add(textField_Definition);
		
		JButton btnAddSlangWord = new JButton("ADD");
		btnAddSlangWord.setFont(new Font("Arial", Font.PLAIN, 20));
		btnAddSlangWord.setBounds(432, 280, 214, 62);
		panel_1.add(btnAddSlangWord);
		btnAddSlangWord.addActionListener(ac);
		
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	
	public void addSlangWord()
	{
		
		

		String slangWord = textField_SlangWord.getText();
		String definiton = textField_Definition.getText();
		
		
		for (Map.Entry<String, List<String>> entry : this.menuView.getSlangWordList().entrySet())
		{
			
			if (entry.getKey().toLowerCase().equals(slangWord.toLowerCase()))
			{
				entry.getValue().add(definiton);
			
			}
			
			
		}
		
		for (Map.Entry<String, List<String>> entry : this.menuView.getSlangWordList_1().entrySet()) {
			
			if (entry.getKey().toLowerCase().equals(slangWord.toLowerCase()))
			{
				entry.getValue().add(definiton);
				
			}
			
		}
		
		List<String> listDefinition = new ArrayList<String>();
		listDefinition.add(definiton);
		
		this.menuView.getSlangWordList_1().put(slangWord, listDefinition);
	
		
		JOptionPane.showMessageDialog(contentPane, "ADD succesfully", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
