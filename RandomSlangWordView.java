package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.RandomSlangWordListener;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.swing.JButton;

public class RandomSlangWordView extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Random;
	private MenuView menuView;

	
	public RandomSlangWordView(MenuView menuView) {
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 689, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		
		this.menuView = menuView;
		RandomSlangWordListener ac = new RandomSlangWordListener(this);
		
		
		textField_Random = new JTextField();
		textField_Random.setFont(new Font("Arial", Font.PLAIN, 20));
		textField_Random.setBounds(262, 128, 219, 43);
		textField_Random.setEditable(false);
		contentPane.add(textField_Random);
		textField_Random.setColumns(10);
		
		
		
		JLabel lblNewLabel = new JLabel("SlangWord:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(118, 120, 118, 53);
		contentPane.add(lblNewLabel);
		
		JButton btnrandom = new JButton("Random");
		btnrandom.setFont(new Font("Arial", Font.PLAIN, 20));
		btnrandom.setBounds(280, 210, 161, 53);
		btnrandom.addActionListener(ac);
		contentPane.add(btnrandom);
		
		this.setVisible(true);
		
	}
	
	public void RandomSlangWord()
	{
		 	Set<String> keySet = this.menuView.getSlangWordList().keySet();
		 	Set<String> keySet_1 = this.menuView.getSlangWordList_1().keySet();
		 	
		 	
	        List<String> keyList = new ArrayList<>(keySet);
	        keyList.addAll(keySet_1);

	        int size = keyList.size();
	        int randIdx = new Random().nextInt(size);

	        String randomKey = keyList.get(randIdx);
	        
	        textField_Random.setText(randomKey);
	        
	        
	}
	
}
